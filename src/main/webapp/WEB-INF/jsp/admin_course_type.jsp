<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>网站后台</title>

    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="/static/css/bootstrap.min.css" crossorigin="anonymous">

    <link rel="stylesheet" href="/static/css/font-awesome.min.css">


    <%--    提示确认对话框--%>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jquery-confirm/3.3.2/jquery-confirm.min.css">


</head>
<body>
<nav class="navbar navbar-dark sticky-top bg-dark flex-md-nowrap p-0 shadow">
    <a class="navbar-brand col-md-3 col-lg-2 mr-0 px-3" href="/admin/user">在线视频学习网站 管理后台</a>
    <button class="navbar-toggler position-absolute d-md-none collapsed" type="button" data-toggle="collapse"
            data-target="#sidebarMenu" aria-controls="sidebarMenu" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
</nav>

<div class="container-fluid">
    <div class="row">
        <nav id="sidebarMenu" class="col-md-2 col-lg-2 d-md-block bg-light sidebar collapse">
            <div class="sidebar-sticky pt-3">
                <ul class="nav flex-column">
                    <li class="nav-item">
                        <a class="nav-link active" href="/admin/user">
                            <span data-feather="home"></span>
                            用户列表 <span class="sr-only">(current)</span>
                        </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">
                            <span data-feather="file"></span>
                            视频类型
                        </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">
                            <span data-feather="shopping-cart"></span>
                            课程视频
                        </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">
                            <span data-feather="users"></span>
                            工具类型
                        </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">
                            <span data-feather="bar-chart-2"></span>
                            网站工具
                        </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">
                            <span data-feather="layers"></span>
                            视频专题
                        </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">
                            <span data-feather="layers"></span>
                            banner广告
                        </a>
                    </li>
                </ul>
            </div>
        </nav>


        <main role="main" class="col-md-10 ml-sm-auto col-lg-10 px-md-4">
            <div>
                <div><h4 class="m-0 font-weight-bold text-primary" style="padding: 20px 0px 0px 5px"> 视频类型管理 </h4>
                </div>
                <div><a href="#" class="btn btn-primary" style="float: right">添加</a>
                </div>
                <br>
            </div>
                <br>
                    <div class="table-responsive">
                        <div id="dataTable_wrapper" class="dataTables_wrapper dt-bootstrap4">
                            <div class="row">
                                <div class="col-sm-12">
                                    <table class="table table-bordered dataTable" id="dataTable" width="100%"
                                           cellspacing="0" role="grid" aria-describedby="dataTable_info"
                                           style="width: 100%;">
                                        <thead>
                                        <tr role="row">
                                            <th class="sorting_asc" tabindex="0" aria-controls="dataTable" rowspan="1"
                                                colspan="1" aria-sort="ascending"
                                            >#ID
                                            </th>
                                            <th class="sorting" tabindex="0" aria-controls="dataTable" rowspan="1"
                                                colspan="1"
                                            >手机
                                            </th>
                                            <th class="sorting" tabindex="0" aria-controls="dataTable" rowspan="1"
                                                colspan="1"
                                            >用户名
                                            </th>
                                            <th class="sorting" tabindex="0" aria-controls="dataTable" rowspan="1"
                                                colspan="1"
                                            >密码
                                            </th>
                                            <th class="sorting" tabindex="0" aria-controls="dataTable" rowspan="1"
                                                colspan="1"
                                            >邮箱
                                            </th>
                                            <th class="sorting" tabindex="0" aria-controls="dataTable" rowspan="1"
                                                colspan="1"
                                            >会员
                                            </th>
                                            <th class="sorting" tabindex="0" aria-controls="dataTable" rowspan="1"
                                                colspan="1"
                                            >注册时间
                                            </th>
                                            <th class="sorting" tabindex="0" aria-controls="dataTable" rowspan="1"
                                                colspan="1"
                                            >删除
                                            </th>
                                            <th class="sorting" tabindex="0" aria-controls="dataTable" rowspan="1"
                                                colspan="1"
                                            >修改
                                            </th>
                                        </tr>
                                        </thead>

                                        <tbody>
                                        <c:forEach items="${coursetypeList.list}" var="coursetype">
                                            <tr role="row" class="odd">
                                                <td class="sorting_1">${coursetype.id}</td>
                                                <td>${coursetype.name}</td>
                                                <td>${coursetype.flag}</td>
                                                <td><a  href="#" onclick="delCourseType(this)"
                                                        myAttr="/admin/courseTypeDel/${coursetype.id}?pageNum=${coursetypeList.pageNum}"><i
                                                        class="fa fa-trash  fa-2x text-danger"
                                                        aria-hidden="true"></i></a></td>
                                                <td><a href="/admin/updatePage/${coursetype.id}">
                                                    <i class="fa fa-pencil-square-o  fa-2x text-warning"
                                                                   aria-hidden="true"></i></a></td>
                                            </tr>
                                        </c:forEach>

                                        </tbody>
                                    </table>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-sm-12 col-md-5">
                                    <div class="dataTables_info" id="dataTable_info" role="status" aria-live="polite">
                                         共 ${coursetypeList.pages} 页 , 总计 ${coursetypeList.total} 位用户
                                    </div>
                                </div>
                                <div class="col-sm-12 col-md-7">
                                    <div class="dataTables_paginate paging_simple_numbers" id="dataTable_paginate">
                                        <%-- 分页--%>
                                        <nav aria-label="Page navigation example">
                                            <ul class="pagination">
                                                <li class="page-item ${coursetypeList.hasPreviousPage? "" :"disabled"} ">
                                                    <a class="page-link"
                                                       href="/admin/course_type?pageNum=${coursetypeList.prePage}">上一页</a>
                                                </li>
                                                <c:forEach var="i" begin="${coursetypeList.navigateFirstPage}"
                                                           end="${coursetypeList.navigateLastPage}">
                                                    <li class=" page-item ${coursetypeList.pageNum == i ? "active" : "" } ">
                                                        <a class="page-link"
                                                           href="/admin/course_type?pageNum=${i}">${i}</a>
                                                    </li>
                                                </c:forEach>
                                                <li class="page-item ${coursetypeList.hasNextPage? "" :"disabled"} ">
                                                    <a class="page-link"
                                                       href="/admin/course_type?pageNum=${coursetypeList.nextPage}">下一页</a>
                                                </li>
                                            </ul>
                                        </nav>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
        </main>
    </div>
</div>


<script src="/static/js/jquery-3.3.1.min.js"></script>

<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
        integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
        crossorigin="anonymous"></script>
<script src="/static/js/bootstrap.min.js"></script>

<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-confirm/3.3.2/jquery-confirm.min.js"></script>

<script type="application/javascript">

    function delCourseType(delNode){
        $.confirm({
            title: '确认删除用户?',
            content: 'This dialog will automatically trigger \'cancel\' in 6 seconds if you don\'t respond.',
            autoClose: 'cancelAction|8000',
            buttons: {
                deleteCoursetype: {
                    text: 'delete course type',
                    action: function () {
                        var myAttr = $(delNode).attr("myAttr");
                        $.alert('用户已删除!');
                        window.location.href= myAttr;

                    }
                },
                cancelAction: function () {
                    $.alert('用户删除已取消!');

                }
            }
        });
    }
</script>
</body>
</html>
