<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>会员</title>

    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="/static/css/equne-video.css" crossorigin="anonymous">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="/static/css/bootstrap.min.css" crossorigin="anonymous">
</head>
<body>

<%--头部--%>
<jsp:include page="/WEB-INF/jsp/common/header.jsp"></jsp:include>

<div class="container mt-4">
    <h3> 充值会员 </h3>
    <div style="padding: 40px;align: center">
        <img src="/static/imgs/vip.jpg" height="300" width="1100"/>
    </div>
    <br>

    <div>
        <form action="PayController/pay" method="post">
            <button type="submit" class="btn btn-lg btn-block btn-primary">立即充值</button>
        </form>
    </div>
    <br>
    <br>
    <br>

</div>

<%--网站的尾部--%>
<jsp:include page="/WEB-INF/jsp/common/footer.jsp"></jsp:include>
</body>
</html>
