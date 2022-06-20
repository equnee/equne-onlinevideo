package com.equne.onlinevideo.util;

public class AlipayConfig {
    //↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2016102700771514";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCMrZpJCZPC03Mni6vieQVgMRwZe9dVQvyRquqd3QG07W6HD1gnQo0XrzJXznoFHdD13nA3kQx0rAJ0F4cwnDjgkQ0oyeXtBSjjuFOR9O+j1gAMny5TuZbJUUllNIHhJd6ZsWTyZzINMXhOl8CY+H3vjTD2PmyHhaTJ1UqQeWGGDbuoxUI7I/ump6hXwzrFuBtGlc+9CZwNzckXPwnxYXvTAz0W9f4cxCINmViX6Xbx7TYJ1k/2sqGSBIGfipoVOgFNOgZyQTHm1E6L6y4iMekgsmSPzWWAxU0YjZSEc1Z9kf1pwGCePFZM23k+PCHp/CMfoopApZ5ZcKJb7tJy9DXBAgMBAAECggEAB9QVVOEqjtnze4zjOMwhR3QUKzrgBcefhH+tZLGKycW4s91fu3eRoHLIa2h7E9PP8A670evJdKipzkoM5OCcraqEv/NUTzdNSjbUt7eYqlZbVFh7XH9ka7mRSwd7/sp7s7PSeUbS2zcYic8aEakqYO1LfziEE5qVTAIJjzah/bKqzI137BiOJrR9EpuEby1d6ozm4D/sY6oC3i1md9MPhyEzEKDLAw4ENNmyU1W4agwar6Fa1Ol+coSzMQB6UnBhfvadHJnFsXUSB9drz+9fs1GQJChZyK0Fxv1TIy0Oz598hTJrWxUPcQjjs5zGTahepa2n61ah1rpysHyfUe800QKBgQDHDFfl8xuh+gMNJoaYFXGilYAMiEmpH5IOCB5G987duDG6i/NawX7atJChjnOEahbHY3Rpv9Uf82SHOJ2wMPxojFF90cNl4TW9ELLbz/NBZLQp7+b6DavMhGh7H97k4rctQ5p1aZCIIHJvqwQvSSIef0H3nhk3hGKfb16tgmugbQKBgQC07dWQ9T1UdjJ8Os/mqJFc1IvMz+TljWggaC+q89mPR8MbOoHJM7/ABZRR4lvsOro7kRxNzYzlyVz2bACvkMzMZIZBgTFVlmCfUNxkDjaJyGYnsRAwje11WMDINnLAUMdJ9YHnuyKJuhwxVxk1WmYs6jNlSiJ3KYyLCUA0w7ZeJQKBgQCOEUlLXtECMyeqYyz9r5CDsqDKURwCEf509WZm0Mhdh/I2a10uEZ0xDF+Ob9YTVIUdmuaj879yJo5B1S73an89P6mKXAVS2gM5BooiSbIdonrU093P66ILPxYzivPT+d0z+WRtGQOHpWEIQs+h0FkB22KCEd19uoeJtDunK8cVoQKBgCYuQnFSr1yRjNnWd2UPkY1rdQ0FmiIvExgzpEuJJhIsbKnkUNsqxn45LzGQeSGCyyYi2zw38lHTioCeDg7+mZlQZVyRbN3I3B8Cq1+Z+DxfQ9+AaBA3AzNORXB6vQCEi2m6G23Redpioexvmuw9ZW55BduMJ3XKGNSGYTxBSMzZAoGAYNFnAC3TrcD9lpbkZ+jr5vavO2M+YWQMzngoqWCzJnRn8DpJcQZgdu6v24AZW90LaFYelHsHeRlNoEX2v1hf75Xos6hkeEXOKay2ddUSfpyZQwXDda85rjRrcTGhqGEBWQAhPxfLv0M6CWtteaYEC6YRXkZ1T2A/5cm7mo69fGk=\n/IRPaavv5Fnl1vf1u6E0dw4jha6wRgSpvWJ7RDz6tyUfY5WKPNPoTpkn4r/vTWf7WJm+UjvRrVoVosR5RsziMBRWMuEBraUTTfMYAW+iAOKyv4/iAUbsapIv/ZCCjnF08AwHczxJeQKjoQw/MF5RmOMKA1skKKQ1RUlmChprFGjFlHDgLrj5VuwbWZnfKK9Gl1DFtijyROhwt0Fl9KV+XKsDsk26eWSCBIeb1OHNd8rvd9Vcn865vK6KMEhc3CzFurD86XzY8C2ZFikXl83uh/PQQ5DR+XLAqo90Ufx/wmIdww1BRQIDAQAB";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAiqaZPjObWoShaxAtbSWQCvvoZh9505wJRXlxDl0/nCO6pGWxavqVi9lZW9BU/UgLXQ/PPU6Jto1qEsoqMxTV01b0SIYgYtuXsBo3+RT5EljVzGPGoBQ9nmTFh8NEW9kzWtVwg6btdrdn2v5VXD9kNhS6YrfypdcOwB++kzmMdMRHeaw3SluBMTGBq91MeP1ZqjNRV44YftR/cRMQSQlCCeKt6s5HfXsJHIJZnGQDzJJOuGSIuToGlpF7S9XHrmo8fvHpEZPeG0jDa/4LZYetZyGXoOzjB4No2VIDwdrbUN0pbQ2xUj7j6BI1IIQ4CrbVP1eeSYF+pbmnIpb7fqVqkwIDAQAB/nCO6pGWxavqVi9lZW9BU/UgLXQ/PPU6Jto1qEsoqMxTV01b0SIYgYtuXsBo3+RT5EljVzGPGoBQ9nmTFh8NEW9kzWtVwg6btdrdn2v5VXD9kNhS6YrfypdcOwB++kzmMdMRHeaw3SluBMTGBq91MeP1ZqjNRV44YftR/cRMQSQlCCeKt6s5HfXsJHIJZnGQDzJJOuGSIuToGlpF7S9XHrmo8fvHpEZPeG0jDa/4LZYetZyGXoOzjB4No2VIDwdrbUN0pbQ2xUj7j6BI1IIQ4CrbVP1eeSYF+pbmnIpb7fqVqkwIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://localhost:8080/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://localhost:8080/alipay.trade.page.pay-JAVA-UTF-8/return_url.jsp";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "C:\\";
}
