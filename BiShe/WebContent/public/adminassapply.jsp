<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>社团活动申请审核</title>

    <!-- BOOTSTRAP STYLES-->
    <link href="${pageContext.request.contextPath}/public/assets/css/bootstrap.css" rel="stylesheet" type='text/css'/>
    <!-- FONTAWESOME STYLES-->
    <link href="${pageContext.request.contextPath}/public/assets/css/font-awesome.css" rel="stylesheet" type='text/css'/>
       <!--CUSTOM BASIC STYLES-->
    <link href="${pageContext.request.contextPath}/public/assets/css/basic.css" rel="stylesheet" type='text/css'/>
    <!--CUSTOM MAIN STYLES-->
    <link href="${pageContext.request.contextPath}/public/assets/css/custom.css" rel="stylesheet" type='text/css'/>
    <!-- GOOGLE FONTS-->
    <link href='https://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />
</head>
<body>
    <div id="wrapper">
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
                <!-- /. ROW  -->
             
            <div class="row">
               <table class="table table-bordered" style="margin:0 auto;text-align:center;" id="tablerow">
                   <thead>
                    <tr>
                        <th>申请社团ID</th>
                        <th>事件</th>
                        <th>地点</th>
                        <th>时间</th>
                        <th>操作</th>
                    </tr>
                   </thead>
                   <tbody>
                    <c:forEach items="${assApply}" var="aa" varStatus="status">
                       <tr class="tr">
                        <td>${aa.act_ass_id }</td>
                        <td>${aa.act_name }</td>
                        <td>${aa.act_address }</td>
                        <td>${aa.act_time }</td>
                        <td onclick="deleteRow(this)">
	                        <a href="javascript:;" class="agree btn btn-info" onclick="deleteRow(this)">
	                        	同意
	                        </a>
	                    </td>
                       	<td style="display:none">${aa.act_ass_id }</td>
                        <td onclick="deleteRow(this)">
                        	<a href="javascript:void(0);"	class="refuse btn btn-danger" onclick="deleteRow(this)">
                        		拒绝
                        	</a>
                        	</td>
                       	<td style="display:none">${aa.act_ass_id }</td>
                       </tr>
                    </c:forEach>
                   </tbody>
                </table>
                </div>
                
                <script>
					function deleteRow(obj){
					var Row=obj.parentNode;
					var Row=obj.parentNode; //tr
					while(Row.tagName.toLowerCase()!="tr")
					{
					Row=Row.parentNode;
					}
					Row.parentNode.removeChild(Row); //删除行
					}
				</script>
                
            </div>

                <!--/.ROW-->

            </div>
            <!-- /. PAGE INNER  -->
        </div>
    <!-- /. WRAPPER  -->

    <!-- SCRIPTS -AT THE BOTOM TO REDUCE THE LOAD TIME-->
    <!-- JQUERY SCRIPTS -->
    <script src="${pageContext.request.contextPath}/public/assets/js/jquery-1.10.2.js" type="text/javascript"></script>
    <!-- BOOTSTRAP SCRIPTS -->
    <script src="${pageContext.request.contextPath}/public/assets/js/bootstrap.js" type="text/javascript"></script>
    <!-- METISMENU SCRIPTS -->
    <script src="${pageContext.request.contextPath}/public/assets/js/jquery.metisMenu.js" type="text/javascript"></script>
    <!-- CUSTOM SCRIPTS -->
    <script src="${pageContext.request.contextPath}/public/assets/js/custom.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/public/assets/js/adminapply.js" type="text/javascript"></script>



</body>
</html>