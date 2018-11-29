<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>管理员编写新闻</title>

    <!-- BOOTSTRAP STYLES-->
    <link href="${pageContext.request.contextPath}/public/assets/css/bootstrap.css" rel="stylesheet" type='text/css'/>
    <!-- FONTAWESOME STYLES-->
    <link href="${pageContext.request.contextPath}/public/assets/css/font-awesome.css" rel="stylesheet" type='text/css'/>
       <!--CUSTOM BASIC STYLES-->
    <link href="${pageContext.request.contextPath}/public/assets/css/basic.css" rel="stylesheet" type='text/css'/>
    <!--CUSTOM MAIN STYLES-->
    <link href="${pageContext.request.contextPath}/public/assets/css/custom.css" rel="stylesheet" type='text/css'/>
    
    <link rel="stylesheet" href="${pageContext.request.contextPath}/public/form/assets/bootstrap-3.3.7-dist/css/bootstrap.min.css">
	 <style>
    textarea{
      resize: none;
    }
    form{
      display: block;
      margin: 50px auto 20px;
    }
    form .form-group{}
    .textinfo{
        position: relative;
        margin-bottom:8px;
    }
    .dettext{
        position:absolute;
        bottom:0;
        right:20px;
        cursor: pointer;
    }
  </style>

</head>
<body>

<c:url value="${pageContext.request.contextPath}" var ="path"></c:url>

 <div id="wrapper" >
       <nav class="navbar navbar-default navbar-cls-top " role="navigation" style="margin-bottom: 0;height:75px;">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".sidebar-collapse">
                    <!--<span class="sr-only">Toggle navigation</span>-->
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
                        <a href="toAdminAll?stu_username=${stgl.username}"><i class="fa fa-flash "></i>社团</a>
                    </li>
                    <li>
                        <a href="assApply"><i class="fa fa-circle-o"></i>社团活动申请审核</a>
                    </li>
                    <li>
                        <a href="toMemberPerm"><i class="fa fa-circle-o"></i>修改</a>
                    </li>
                    <li>
	                   <a href="inAdminNews"><i class="fa fa-plus "></i>编写新闻</a>
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
            <div class="panel-body" style="margin-left:250px;margin-top:50px">
               <div class="container">
				  <form class="form-horizontal" role="form" style="">
				    <div class="form-group">
				      <label for="title" class="col-sm-1 control-label">标题</label>
				      <div class="col-sm-4">
				        <input type="text" class="form-control" id="title" name="n_title" placeholder="请输入标题">
				      </div>
				    </div>
				    <div class="form-group">
				      <label for="title" class="col-sm-1 control-label">时间</label>
				      <div class="col-sm-4">
				        <input type="text" class="form-control" id="time" name="n_p_time" placeholder="时间格式如2018-3-18">
				      </div>
				    </div>
				    <div class="form-group content">
				      <div class="col-sm-6 textinfo">
				        <textarea class="form-control" rows="15" id="content" type="请输入内容" name="n_content"></textarea>
				      </div>
				    </div>
				  </form>
				  			<div class="stuNum" style="display:none">${stgl.username}</div>
  					<button type="submit" class="btn btn-primary" id="admindetermine">提交</button>
			</div>
            </div>
            <!-- /. ROW  -->
        </div>
    </div>
</div>

     <!-- JQUERY SCRIPTS -->
    <script src="${pageContext.request.contextPath}/public/assets/js/jquery-1.10.2.js" type="text/javascript"></script>
    <!-- BOOTSTRAP SCRIPTS -->
    <script src="${pageContext.request.contextPath}/public/assets/js/bootstrap.js" type="text/javascript"></script>
    <!-- METISMENU SCRIPTS -->
    <script src="${pageContext.request.contextPath}/public/assets/js/jquery.metisMenu.js" type="text/javascript"></script>
    <!-- CUSTOM SCRIPTS -->
    <script src="${pageContext.request.contextPath}/public/assets/js/custom.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/public/form/assets/js/jquery-1.11.1.min.js"></script>
  	<script src="${pageContext.request.contextPath}/public/form/assets/js/jquery.backstretch.min.js"></script>



</body>
</html>
