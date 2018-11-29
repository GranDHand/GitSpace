<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">

    <head>
		<!-- 加载特定的静态资源 -->
	<style type="text/css">@font-face {
  		font-family: 'Glyphicons Halflings';

  		src: url('../fonts/glyphicons-halflings-regular.eot');
  		src: url('../fonts/glyphicons-halflings-regular.eot?#iefix') format('embedded-opentype'), url('../fonts/glyphicons-halflings-regular.woff2') format('woff2'), url('../fonts/glyphicons-halflings-regular.woff') format('woff'), url('../fonts/glyphicons-halflings-regular.ttf') format('truetype'), url('../fonts/glyphicons-halflings-regular.svg#glyphicons_halflingsregular') format('svg');
	}</style>
		
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>登陆</title>

        <!--<link href="tubiao.jpg" rel="Shortcut Icon" />
        <link href="tubiao.jpg" rel="Shortcut Icon" />-->
        
        
        <!-- CSS -->
        <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Roboto:400,100,300,500" type="text/css">
        <link rel="stylesheet" href="public/form/assets/bootstrap-3.3.7-dist/css/bootstrap.min.css" type="text/css">
        <link rel="stylesheet" href="public/form/assets/font-awesome/css/font-awesome.min.css" type="text/css">
		<link rel="stylesheet" href="public/form/assets/css/form-elements.css" type="text/css">
        <link rel="stylesheet" href="public/form/assets/css/style.css" type="text/css">

        <!--[if lt IE 9]>
          1 ;p <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->

        <!-- Favicon and touch icons -->
        <link rel="shortcut icon" href="assets/ico/favicon.png">
        <link rel="apple-touch-icon-precomposed" sizes="144x144" href="./form/assets/ico/apple-touch-icon-144-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="114x114" href="public/form/assets/ico/apple-touch-icon-114-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="72x72" href="public/form/assets/ico/apple-touch-icon-72-precomposed.png">
        <link rel="apple-touch-icon-precomposed" href="public/form/assets/ico/apple-touch-icon-57-precomposed.png">

    </head>

    <body>

        <!-- Top content -->
        <div class="top-content">
        	
            <div class="inner-bg">
                <div class="container">
                    <div class="row">
                        <div class="col-sm-8 col-sm-offset-2 text">
                            <h1>欢迎登陆</h1>
                            <div class="description">
                            	<p>
                                    葱茏的校园，飘香的书堂，怎能缺少你的色彩？
                                    灵感的迸发,创意的勾勒,怎能缺少你的光芒?
                                    海报的聚焦，文字的传播，如何缺少你的努力?
                            	</p>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-sm-6 col-sm-offset-3 form-box">
                        	<div class="form-top">
                        		<div class="form-top-left">
                        			<h3>加入我们吧！期待你的加入！！！</h3>
                            		<p>请输入你的学号和密码:</p>
                        		</div>
                        		<div class="form-top-right">
                        			<i class="fa fa-key"></i>
                        		</div>
                            </div>
                            <div class="form-bottom">
                            
                             <c:url value="/login" var="loginProcessingUrl"/>
			                    <form role="form" action="${loginProcessingUrl}" method="post" class="login-form">
			                    
                            <!--    spring security默认开启CSRF防护，所以所有POST表单都必须包含csrf.token -->
   									<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
   									
								   									<!-- use param.error assuming FormLoginConfigurer#failureUrl contains the query parameter error -->
								        <c:if test="${param.error != null}">
								            <div>
								                登录失败，请重新登录
								            </div>
								        </c:if>
								        <!-- the configured LogoutConfigurer#logoutSuccessUrl is /login?logout and contains the query param logout -->
								        <c:if test="${param.logout != null}">
								            <div>
								                你已退出系统，欢迎下次光临
								            </div>
								        </c:if>
   									
			                    	<div class="form-group">
			                    		<label class="sr-only" for="form-username">Username</label>
			                        	<input type="text" name="username" placeholder="请输入学号..." class="form-username form-control" id="username">
			                        </div>
			                        <div class="form-group">
			                        	<label class="sr-only" for="form-password">Password</label>
			                        	<input type="password" name="password" placeholder="请输入密码（第一次登陆的密码是学号）..." class="form-password form-control" id="password">
			                        </div>
                                    <p>
                                        <label for="remember-me">记住我?</label>
                                        <input type="checkbox" id="remember-me" name="remember-me"/>
                                    </p>
			                        <button type="submit" class="btn">登录!</button>
			                    </form>
		                    </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-sm-6 col-sm-offset-3 social-login">
                        	<h3>...或者其他网站:</h3>
                        	<div class="social-login-buttons">
	                        	<a class="btn btn-link-1 btn-link-1-twitter" href="http://www.csmu.edu.cn/">
	                        		<i class="fa fa-twitter"></i> 学校官网
	                        	</a>
	                        	<a class="btn btn-link-1 btn-link-1-google-plus" href="http://jiaowu.csmu.edu.cn:8099/jsxsd/">
	                        		<i class="fa fa-google-plus"></i> 教务系统
	                        	</a>
                        	</div>
                        </div>
                    </div>
                </div>
            </div>
            
        </div>

        <!-- Javascript -->
        <script src="./public/form/assets/js/jquery-1.11.1.min.js" type="text/javascript"></script>
        <script src="./public/form/assets/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
        <script src="./public/form/assets/js/jquery.backstretch.min.js" type="text/javascript"></script>
        <script src="./public/form/assets/js/scripts.js" type="text/javascript"></script>
        
        <!--[if lt IE 10]>
            <script src="assets/js/placeholder.js"></script>
        <![endif]-->

    </body>

</html>