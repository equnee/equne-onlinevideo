<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>课程专题</title>

    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="/static/css/equne-video.css" crossorigin="anonymous">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="/static/css/bootstrap.min.css" crossorigin="anonymous">

    <link rel="stylesheet" href="/static/css/font-awesome.min.css">
</head>
<body>

<%--头部--%>
<jsp:include page="/WEB-INF/jsp/common/header.jsp"></jsp:include>
<br><br>
<%--首页内容区域--%>
<div class="container">

    <%--    视频--%>
    <div class="card">
        <div class="embed-responsive embed-responsive-16by9">
            <%-- 第一进入？，选集进入？--%>
            <iframe src="${video.videoUrl1}"
                    scrolling="no" border="0" frameborder="no" framespacing="0" allowfullscreen="true"></iframe>
            <%--            <iframe src="//player.bilibili.com/player.html?aid=712169146&bvid=BV1iD4y1o7dD&cid=238287362&page=1"--%>
            <%--                    scrolling="no" border="0" frameborder="no" framespacing="0" allowfullscreen="true"></iframe>--%>
        </div>
    </div>

    <%--    视频相关--%>
    <div class="row mt-2">
        <div class="col-md-9">
            <span class="font-weight">浏览次数：<b class="text-primary">${courseTopic.views}次</b></span>
            <span class="font-weight ml-3">课时数：<b class="text-primary">${courseVideoList.size()}</b></span>
            <span class="text-weight ml-3">类别：<b class="text-success">${courseTopic.vipFlag == 0 ? "免费":"会员"}</b></span>
            <i class="fa fa-share-alt text-secondary ml-3">&nbsp;&nbsp;<a href="#"
                                                                          class="alert-link text-secondary">分享</a></i>
            <i class="fa fa-star text-secondary ml-3">&nbsp;&nbsp;<a href="#"
                                                                     class="alert-link text-secondary">收藏</a></i>
        </div>

        <div class="col-md-3">
            <a class="btn btn-info text-white" href="${courseTopic.coursewareUrl}">资料下载</a>

            <a class="btn btn-info text-white ml-2" target="_blank">在线咨询</a>
        </div>
    </div>

    <%--    视频内容列表--%>

    <div class="row mt-2">

        <div class="col-md-9">
            <div class="card">
                <nav>
                    <div class="nav nav-tabs" id="nav-tab" role="tablist">
                        <a class="nav-item nav-link active" id="nav-home-tab" data-toggle="tab" href="#nav-home"
                           role="tab"
                           aria-controls="nav-home" aria-selected="true">课程介绍</a>
                        <a class="nav-item nav-link" id="nav-profile-tab" data-toggle="tab" href="#nav-profile"
                           role="tab"
                           aria-controls="nav-profile" aria-selected="false">课程目录</a>

                    </div>
                </nav>
                <div class="tab-content" id="nav-tabContent">
                    <div class="tab-pane fade show active" id="nav-home" role="tabpanel" aria-labelledby="nav-home-tab">
                        ${courseTopic.topicIntro}
                    </div>
                    <div class="tab-pane fade" id="nav-profile" role="tabpanel" aria-labelledby="nav-profile-tab">


                        <c:forEach items="${courseVideoList}" var="video" varStatus="idx">
                            <a href="/topic/${topicId}/${video.id}"
                               class="list-group-item list-group-item-action list-group-item-light border-0"><i
                                    class="fa fa-play-circle-o">&nbsp;&nbsp;第${idx.index+1}讲<span
                                    class="ml-3">${video.name}</span>


                                <c:choose>
                                    <c:when test="${video.freeView == 0}">
                                        <span class="ml-1 badge badge-pill badge-success  pt-1">免费</span>
                                    </c:when>

                                    <c:otherwise>
                                        <span class="ml-1 badge badge-pill badge-danger  pt-1"> 会员</span>
                                    </c:otherwise>
                                </c:choose>

                            </i></a>
                        </c:forEach>

                    </div>

                </div>

            </div>
        </div>

        <div class="col-md-3">
            <div class="card">
                <div class="card-header">
                    equne
                </div>
                <div class="card-body">
                    <div class="row">
                        <div class="col-md-4"><img src="/static/imgs/hicon.jpg" class="rounded-circle"
                                                   alt="Responsive image" style="height: 60px;width: 60px;">
                        </div>
                        <div class="col-md-8">equne<br><span class="text-secondary"
                                                           style="font-size: 16px;">管理员</span>
                        </div>


                        <span class="text-secondary mt-2" style="font-size: 14px;">学习交流群：2016372</span>

                        </blockquote>
                    </div>
                </div>
            </div>
        </div>

    </div>

</div>
<br>
<br>
<%--网站的尾部--%>
<jsp:include page="/WEB-INF/jsp/common/footer.jsp"></jsp:include>
</body>
</html>
