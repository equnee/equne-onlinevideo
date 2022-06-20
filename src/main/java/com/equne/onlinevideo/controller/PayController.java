package com.equne.onlinevideo.controller;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.equne.onlinevideo.util.AlipayConfig;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@Controller
@RestController
@RequestMapping("/PayController")
public class PayController {

    // https://github.com/alipay/alipay-sdk-java-all
    // https://opendocs.alipay.com/open/270/105899


    // 1生成订单
    // 2请求接口
    // 3等待返回
    // 4状态通知

    // A -- B
    //  DES
    // B DES HELLO
    // B -- A
    //  DES
    // A DES WORLD
    // C -- A
    // MD5

    // 前台

    // 后台
    @RequestMapping("/pay")
    public void payController(HttpServletRequest request,
                              HttpServletResponse response) throws IOException {
        //设置请求编码
        response.setContentType("text/html;charset=utf-8");
        //获得初始化的AlipayClient
        AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl,
                AlipayConfig.app_id, AlipayConfig.merchant_private_key, "json",
                AlipayConfig.charset,AlipayConfig.alipay_public_key, AlipayConfig.sign_type);

        //设置请求参数
        AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
        alipayRequest.setReturnUrl(AlipayConfig.return_url);
        alipayRequest.setNotifyUrl(AlipayConfig.notify_url);

        //商户订单号，商户网站订单系统中唯一订单号，必填
        String out_trade_no = PayController.getUniqueOrder();
        System.out.println(out_trade_no);
        //付款金额，必填
        String total_amount = "88";
        //订单名称，必填
        String subject = "会员充值";
        //商品描述，可空
        String body = "在线会员充值";
        System.out.println(out_trade_no);

        alipayRequest.setBizContent("{\"out_trade_no\":\""+ out_trade_no +"\","
                + "\"total_amount\":\""+ total_amount +"\","
                + "\"subject\":\""+ subject +"\","
                + "\"body\":\""+ body +"\","
                + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");

        //请求
        String form="";
        try {
            form = alipayClient.pageExecute(alipayRequest).getBody(); //调用SDK生成表单
        } catch (AlipayApiException e) {
            e.printStackTrace();
        }
        response.setContentType("text/html;charset=" + AlipayConfig.charset);
        response.getWriter().write(form);//直接将完整的表单html输出到页面
        response.getWriter().flush();
        response.getWriter().close();
    }


    private static String getUniqueOrder() {
        SimpleDateFormat format = new SimpleDateFormat("YYYYMMddHHmmss");
        String format2 = format.format(new Date());
        int hashCodeV = UUID.randomUUID().toString().hashCode();
        if(hashCodeV < 0) {
            //有可能是负数
            hashCodeV = - hashCodeV;
        }
        return "pk"+format2+String.format("%012d", hashCodeV);
    }
}
