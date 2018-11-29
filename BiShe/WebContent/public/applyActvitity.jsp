<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>活动申请</title>

    <!-- BOOTSTRAP STYLES-->
    <link href="${pageContext.request.contextPath}/public/assets/css/bootstrap.css" rel="stylesheet" />
    <!-- FONTAWESOME STYLES-->
    <link href="${pageContext.request.contextPath}/public/assets/css/font-awesome.css" rel="stylesheet" />
     <!--WIZARD STYLES-->
    <link href="${pageContext.request.contextPath}/public/assets/css/wizard/normalize.css" rel="stylesheet" />
    <link href="${pageContext.request.contextPath}/public/assets/css/wizard/wizardMain.css" rel="stylesheet" />
    <link href="${pageContext.request.contextPath}/public/assets/css/wizard/jquery.steps.css" rel="stylesheet" />
    <!--CUSTOM BASIC STYLES-->
    <link href="${pageContext.request.contextPath}/public/assets/css/basic.css" rel="stylesheet" />
    <!--CUSTOM MAIN STYLES-->
    <link href="${pageContext.request.contextPath}/public/assets/css/custom.css" rel="stylesheet" />
    
    <link rel="stylesheet" href="${pageContext.request.contextPath}/public/assets/css/j-forms.css">
	<link href="${pageContext.request.contextPath}/public/assets/css/style.css" rel="stylesheet" type="text/css" media="all" />	
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
		<h1 style="margin-left:500px">活动申请</h1>
       	<div class="content">
		<div class="main">
			<form class="contact-forms" action="toAa" method="POST">
			
			 <!--    spring security默认开启CSRF防护，所以所有POST表单都必须包含csrf.token -->
   								<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
				<!-- end /.header-->

					<!-- start name -->
					<div class="first-line">
						<div class="span6 main-row">
							<div class="input">
								
								<input type="text" id="act_ass_id" name="act_ass_id" placeholder="社团ID">
								<span class="tooltip tooltip-right-top">请输入社团ID</span>
							</div>
						</div>
						<div class="span6 main-row">
							<div class="input">
								
								<input type="text" id="act_stusname" name="act_stusname" placeholder="申请人">
								<span class="tooltip tooltip-right-top">请输入申请人姓名</span>
							</div>
						</div>
					</div>
					<!-- end name -->

					<!-- start email phone -->
					<div class="first-line">
						
						<div class="span6 main-row">
							<div class="input">
								
								<input type="text" placeholder="联系方式" id="act_tel" name="act_tel">
								<span class="tooltip tooltip-right-top">请输入电话号码</span>
							</div>
						</div>
					</div>
				

					<div class="first-line">
						<div class="span8 main-row">
							<div class="input">
								
								<input type="text" id="act_name" placeholder="活动标题" name="act_name">
								<span class="tooltip tooltip-right-top">请输入活动标题</span>
							</div>
						</div>
						
					</div>

					<!-- start city post code -->
					<div class="first-line">
						<div class="span8 main-row">
							<div class="input">
								
								<input type="text" id="act_time" placeholder="活动时间" name="act_time">
								<span class="tooltip tooltip-right-top">请输入活动时间</span>
							</div>
						</div>
						
					</div>
					<!-- end city post code -->

					<!-- start address -->
					<div class="main-row">
						<div class="input">
							
							<input type="text" id="act_address" placeholder="地点" name="act_address">
							<span class="tooltip tooltip-right-top">请输入申请的活动地点</span>
						</div>
					</div>



					<!-- start message -->
					<div class="main-row">
						<div class="input">
							<textarea placeholder="活动内容" spellcheck="false" name="act_content"></textarea>
								<span class="tooltip tooltip-right-top">请输入活动的内容</span>
						</div>
					</div>

			
				<!-- end /.content -->

				<div class="footer">
					<button type="submit" class="primary-btn">申请</button>
					<button type="reset" class="secondary-btn">重置</button>
				</div>
				<!-- end /.footer -->

			</form>
		</div>
</div>
            <!-- /. PAGE INNER  -->
        </div>
        <!-- /. PAGE WRAPPER  -->
    </div>
   </div> 
    
    <!-- JQUERY SCRIPTS -->
    <script src="${pageContext.request.contextPath}/public/assets/js/jquery-1.10.2.js"></script>
    <!-- BOOTSTRAP SCRIPTS -->
    <script src="${pageContext.request.contextPath}/public/assets/js/bootstrap.js"></script>
    <!-- METISMENU SCRIPTS -->
    <script src="${pageContext.request.contextPath}/public/assets/js/jquery.metisMenu.js"></script>
     <!-- WIZARD SCRIPTS -->
    <script src="${pageContext.request.contextPath}/public/assets/js/wizard/modernizr-2.6.2.min.js"></script>
    <script src="${pageContext.request.contextPath}/public/assets/js/wizard/jquery.cookie-1.3.1.js"></script>
    <script src="${pageContext.request.contextPath}/public/assets/js/wizard/jquery.steps.js"></script>
    <!-- CUSTOM SCRIPTS -->
    <script src="${pageContext.request.contextPath}/public/assets/js/custom.js"></script>  
    <!-- Scripts -->
	<script src="${pageContext.request.contextPath}/public/assets/js/jquery.1.11.1.min.js"></script> 
</body>
</html>
