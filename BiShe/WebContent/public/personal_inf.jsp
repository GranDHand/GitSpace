<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>个人信息</title>

   <!-- BOOTSTRAP STYLES-->
    <link href="public/assets/css/bootstrap.css" rel="stylesheet" type='text/css'/>
    <!-- FONTAWESOME STYLES-->
    <link href="public/assets/css/font-awesome.css" rel="stylesheet" type='text/css'/>
       <!--CUSTOM BASIC STYLES-->
    <link href="public/assets/css/basic.css" rel="stylesheet" type='text/css'/>
    <!--CUSTOM MAIN STYLES-->
    <link href="public/assets/css/custom.css" rel="stylesheet" type='text/css'/>
    <!-- GOOGLE FONTS-->
    <link href='https://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />
</head>
<body>
    <div id="wrapper">
       <nav class="navbar navbar-default navbar-cls-top " role="navigation" style="margin-bottom: 0;height:75px;">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".sidebar-collapse">
                    <!--<span class="sr-only">Toggle navigation</span>-->
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="/BiShe/toIndex">首页</a>
            </div>

            <div class="header-right">
                <c:url value="/logout" var="logoutProcessingUrl"/>
					<form action="${logoutProcessingUrl}" method="post" style="display:inline-block;">
						<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
						<button	type="submit" class="btn btn-danger">退出</button>
					</form>
            </div>
        </nav>
        <!-- /. NAV TOP  -->
        <nav class="navbar-default navbar-side" role="navigation" >
            <div class="sidebar-collapse">
                <ul class="nav" id="main-menu">
                
                    <li>
                        <div class="user-img-div">
                            <img src="public/assets/img/user.jpg" class="img-thumbnail" />

                            <div class="inner-text">
                            	欢迎 学号为：
                                ${stgl.username}
                                <br />
                                <div id="timeShow" class="time1"></div>
                            </div>
                        </div>

                    </li>


                    <li>
                        <a class="active-menu" href="#"><i class="fa fa-dashboard "></i>菜单</a>
                    </li>
                    <li>
                        <a href="toAll?stu_username=${stgl.username}"><i class="fa fa-flash "></i>所有社团</a>
                    </li>
                    <li>
                        <a href="#"><i class="fa fa-desktop "></i>个人资料 <span class="fa arrow"></span></a>
                         <ul class="nav nav-second-level">
                            <li>
                                <a href="pi?username=${stgl.username}"><i class="fa fa-toggle-on"></i>个人信息</a>
                            </li>
                            <li>
                                <a href="toNoti?username=${stgl.username}"><i class="fa fa-bell "></i>推荐社团/申请信息</a>
                            </li>
                             <li>
                                <a href="toMtp"><i class="fa fa-code "></i>修改密码</a>
                            </li>
                        </ul>
                    </li>
                   
                     <li>
                        <a href="#"><i class="fa fa-yelp "></i>社团资金<span class="fa arrow"></span></a>
                         <ul class="nav nav-second-level">
                            <li>
                                <a href="toIas2?inv_status=1"><i class="fa fa-coffee"></i>收入</a>
                            </li>
                            <li>
                                <a href="toIas?inv_status=0"><i class="fa fa-flash "></i>支出</a>
                            </li>
                            <!--  <li>
                                <a href="public/invoice.jsp"><i class="fa fa-key "></i>发票</a>
                            </li> -->
                        </ul>
                    </li>
                    <li>
                        <a href="toMember?stu_username=${stgl.username}"><i class="fa fa-circle-o"></i>社团成员 </a>
                    </li>
                     <li>
                        <a href="#"><i class="fa fa-bicycle "></i>社团活动及荣誉<span class="fa arrow"></span></a>
                         <ul class="nav nav-second-level">

                             <li>
                                <a href="toRecord?stu_username=${stgl.username}"><i class="fa fa-edit  "></i>社团活动记录</a>
                            </li>
                             <li>
                                <a href="toHonor?stu_username=${stgl.username}"><i class="fa fa-edit "></i>社团荣誉记录</a>
                            </li>
                            <sec:authorize access="hasRole('ADMIN')">
                            <li>
                                <a href="toApp"><i class="fa fa-plus  "></i>申请活动</a>
                            </li>
							</sec:authorize>	


                        </ul>
                    </li>
                     <!--  <li>
                        <a href="public/activity_picture.jsp"><i class="fa fa-anchor "></i>社团活动照</a>
                    </li> -->
                    <%-- <sec:authorize access="hasRole('ADMIN')">
                            <li>
                                <a href="uplode?${stgl.username}"><i class="fa fa-plus "></i>上传活动照</a>
                            </li>
					</sec:authorize> --%>
					<sec:authorize access="hasRole('ADMIN')">
                            <li>
                                <a href="toExamine?stu_username=${stgl.username }"><i class="fa fa-plus "></i>申请审核</a>
                            </li>
						</sec:authorize>
                    <!--  <li>
                        <a href="public/error.jsp"><i class="fa fa-bug "></i>Error Page</a>
                    </li> -->
                    <li>
                        <a href="#"><i class="fa fa-square-o  "></i>新闻<span class="fa arrow"></span></a>
                         <ul class="nav nav-second-level">
                            <li>
                                <a href="toFindType?n_status=0"><i class="fa fa-bicycle "></i>校园新闻</a>
                            </li>
                             <li>
                                <a href="toFindType?n_status=1"><i class="fa fa-flask "></i>社团新闻</a>
                            </li>
                             <sec:authorize access="hasRole('ADMIN')">
	                            <li>
	                                <a href="toinsertNews"><i class="fa fa-plus "></i>编写新闻</a>
	                            </li>
							</sec:authorize>	
                        </ul>
                    </li>
                </ul>

            </div>

        </nav>
        <!-- /. NAV SIDE  -->
        <div id="page-wrapper">
            <div id="page-inner">
                <div class="row">
                    <div class="col-md-12">
                        <h1 class="page-head-line">校训</h1>
                        <h1 class="page-subhead-line">厚德、博学、储能、求真 </h1>
                    </div>
                </div>
                <!-- /. ROW  -->
                       
                        <div class="row">
                            <div id="pi_form">
                                <form>
                                    姓名：<input type="text"  value="${stu.stu_name}" readonly ><br>
                                    姓别：<input type="text"  value="${stu.stu_sex}" readonly><br>
                                    学号：<input type="text"  value="${stu.stu_username}" readonly><br>
                                    年级：<input type="text"  value="${stu.stu_grade}" readonly><br>
                                    专业：<input type="text"  value="${stu.stu_major}" readonly><br>
                                    班级：<input type="text"  value="${stu.stu_class}" readonly><br>
                                    电话：<input type="text"  value="${stu.stu_tel}" readonly><br>
                                    寝室号：<input type="text"  value="${stu.stu_address}" readonly>
                                </form>

                            <div class="col-md-12">
                                <div class="panel panel-default">
                                    <div>
                                        <button class="btn btn-primary" data-toggle="modal" data-target="#myModal">
                                            <h2>修改个人信息</h2>
                                        </button>
                                        <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                                            <div class="modal-dialog">
                                                <div class="modal-content">
                                                    <div class="modal-header">
                                                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                                                        <h4 class="modal-title" id="myModalLabel">修改个人信息</h4>
                                                    </div>
                                                    <div class="modal-body">
                                                        <form action="toPI?username= ${stgl.username}" method="POST">
                                                       
                                                         <!--    spring security默认开启CSRF防护，所以所有POST表单都必须包含csrf.token -->
   															<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
   															
                                                            姓名：<input type="text" id="stu_name" name="stu_name" value="${stu.stu_name}"  ><br>
                                                            姓别：<input type="text" id="stu_sex" name="stu_sex" value="${stu.stu_sex}" ><br>
                                                            学号：<input type="text" id="stu_username" name="stu_username" value="${stu.stu_username}" readonly><br>
                                                            专业：<input type="text" id="stu_major" name="stu_major" value="${stu.stu_major}" ><br>
                                                            班级：<input type="text" id="stu_class" name="stu_class" value="${stu.stu_class}" ><br>
                                                            电话：<input type="text" id="stu_tel" name="stu_tel" value="${stu.stu_tel}" ><br>
                                                            寝室号：<input type="text" id="stu_address" name="stu_address" value="${stu.stu_address}"><br>
                                                            年级：<input type="text" id="stu_grade" name="stu_grade" value="${stu.stu_grade}" >
                                                            <div class="modal-footer">
                                                                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                                                                <button type="submit" class="btn btn-primary">保存</button>
                                                            </div>
                                                        </form>
                                                    </div>

                                                </div>
                                                <!--/.modal-content-->
                                            </div>
                                            <!--/.modal-dialog-->
                                        </div>
                                        <!--/。modal fade-->
                                    </div>
                                    <!--/。panel-body-->
                                </div>
                                <!--/。"panel panel-default"-->
                            </div>
                </div>
            </div>
        </div>
        </div>
    </div>
  <!-- JQUERY SCRIPTS -->
    <script src="public/assets/js/jquery-1.10.2.js" type="text/javascript"></script>
    <!-- BOOTSTRAP SCRIPTS -->
    <script src="public/assets/js/bootstrap.js" type="text/javascript"></script>
    <!-- METISMENU SCRIPTS -->
    <script src="public/assets/js/jquery.metisMenu.js" type="text/javascript"></script>
    <!-- CUSTOM SCRIPTS -->
    <script src="public/assets/js/custom.js" type="text/javascript"></script>


</body>
</html>