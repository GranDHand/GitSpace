<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

	<style type="text/css">@font-face {
  		font-family: 'Glyphicons Halflings';

  		src: url('../fonts/glyphicons-halflings-regular.eot');
  		src: url('../fonts/glyphicons-halflings-regular.eot?#iefix') format('embedded-opentype'), url('../fonts/glyphicons-halflings-regular.woff2') format('woff2'), url('../fonts/glyphicons-halflings-regular.woff') format('woff'), url('../fonts/glyphicons-halflings-regular.ttf') format('truetype'), url('../fonts/glyphicons-halflings-regular.svg#glyphicons_halflingsregular') format('svg');
	}</style>
 	<meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>校园社团管理页面</title>
	
	
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


<!-- 获取当前时间 -->
	<script language="javascript">

		     var t = null;
		
		    t = setTimeout(time,1000);//开始执行
		
		    function time()
		
		    {
		
		       clearTimeout(t);//清除定时器
		
		       dt = new Date();
		
		var y=dt.getYear()+1900;
		
		var mm=dt.getMonth()+1;
		
		var d=dt.getDate();
		
		var weekday=["星期日","星期一","星期二","星期三","星期四","星期五","星期六"];
		
		var day=dt.getDay();
		
		       	var h=dt.getHours();
		
		       	var m=dt.getMinutes();
		
		       	var s=dt.getSeconds();
		
		if(h<10){h="0"+h;}
		
		if(m<10){m="0"+m;}
		
		if(s<10){s="0"+s;}
		       	document.getElementById("timeShow").innerHTML =  "现在的时间为：<br>"+y+"年"+mm+"月"+d+"日"+weekday[day]+" "+h+":"+m+":"+s+"";
		
		       	t = setTimeout(time,1000); //设定定时器，循环执行           
		
		    }

  </script>
  <!-- 这是时间Div的样式 -->
<!-- 	 <style>

    .time1{width:100%; height:50px; background:#FFF000; line-height:50px; text-align:center;}

  </style> -->
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
                        <!--社团简介-->
                        <h1 class="page-head-line">校训</h1>
                        <h1 class="page-subhead-line">厚德、博学、储能、求真 </h1>

                    </div>
                </div>
			
			<div class="panel-body">
                <table class="table table-bordered" style="margin-left:110px">
                   <thead>
                    <tr>
                        <th> </th>
                        <th>社团名</th>
                        <th>社长</th>
                        <th>操作</th>
                    </tr>
                   </thead>
                   <tbody>
                    <c:forEach items="${allAss.list}" var="tallAss" varStatus="status">
                       <tr>
                        <td id="ass_id">${tallAss.ass_id }</td>
                        <td id="ass_name">${tallAss.ass_name }</td>
                        <td>${tallAss.ass_presidentName }</td>
                        <td><button id="del" class="btn btn-danger">删除</button></td>
                        <td style="display:none">${tallAss.ass_id }</td>
                       </tr>
                    </c:forEach>
                   </tbody>
                </table>
            </div>
				<div id="u_li">
                       <ul class="pagination">
 							<li style="display:none"><a href="javascript:;" class="allAss">${allAss.totalPage}</a></li>
                            <li><a href="javascript:;" >总共有${allAss.totalRecord}个社团</a></li>
                            <li><a href="javascript:void(0);" class="homepage">首页</a></li>
                            <li><a href="javascript:void(0);" class="prepage">上一页</a></li>
                            <li><a href="javascript:void(0);" class="nextpage">下一页</a></li>
                            <li><a href="javascript:void(0);" class="end">尾页</a></li>
                            <li><a href="javascript:void(0);"id="page">当前页为：<span id ="cur_page">${allAss.pageNum}/${allAss.totalPage}</span></a></li><br><br>
                        </ul>
               </div>
		<!-- <script>
			$(document).on("click","tbody td #del",function(j) {
					var Row=obj.parentNode; //tr
					while(Row.tagName.toLowerCase()!="tr")
					{
					Row=Row.parentNode;
					}
					Row.parentNode.removeChild(Row); //删除行
				})
				</script>  -->
        </div>
        <!-- /. PAGE WRAPPER  -->
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
    <script src="${pageContext.request.contextPath}/public/assets/js/adminass.js" type="text/javascript"></script>

</body>
</html>