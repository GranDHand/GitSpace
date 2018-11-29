<!--修改密码-->
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>修改密码</title>

    <!-- BOOTSTRAP STYLES-->
    <link href="assets/css/bootstrap.css" rel="stylesheet" />
    <!-- FONTAWESOME STYLES-->
    <link href="assets/css/font-awesome.css" rel="stylesheet" />
    <!--CUSTOM BASIC STYLES-->
    <link href="assets/css/basic.css" rel="stylesheet" />
    <!--CUSTOM MAIN STYLES-->
    <link href="assets/css/custom.css" rel="stylesheet" />
    <!-- GOOGLE FONTS-->
    <link href='https://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />
</head>
<body>
    <div id="wrapper">
        <nav class="navbar navbar-default navbar-cls-top " role="navigation" style="margin-bottom: 0">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".sidebar-collapse">
                    <!--<span class="sr-only">Toggle navigation</span>-->
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="index.jsp">首页</a>
            </div>

            <div class="header-right">
                <a href="./form/Login.jsp" class="btn btn-danger1"></i>登录</a>
                <a href="#" class="btn btn-danger">注销登录</a>
            </div>
        </nav>
        <!-- /. NAV TOP  -->
        <nav class="navbar-default navbar-side" role="navigation" >
            <div class="sidebar-collapse">
                <ul class="nav" id="main-menu">
                    <li>
                        <div class="user-img-div">
                            <img src="assets/img/user.png" class="img-thumbnail" />

                            <div class="inner-text">
                                张三
                                <br />
                                <small>上次登录 : 2周前 </small>
                            </div>
                        </div>

                    </li>


                    <li>
                        <a class="active-menu" href="#"><i class="fa fa-dashboard "></i>菜单</a>
                    </li>
                    <li>
                        <a href="All.jsp"><i class="fa fa-flash "></i>所有社团 </a>
                    </li>
                    <li>
                        <a href="#"><i class="fa fa-desktop "></i>个人资料 <span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="Personal_inf.jsp"><i class="fa fa-toggle-on"></i>个人信息</a>
                            </li>
                            <li>
                                <a href="notification.jsp"><i class="fa fa-bell "></i>推荐社团/申请加入</a>
                            </li>
                            <li>
                                <a href="Modify_the_password.jsp"><i class="fa fa-code "></i>修改密码</a>
                            </li>
                        </ul>
                    </li>
                    <li>
                        <a href="#"><i class="fa fa-yelp "></i>社团资金<span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="income.jsp"><i class="fa fa-coffee"></i>收入</a>
                            </li>
                            <li>
                                <a href="expenditure.jsp"><i class="fa fa-flash "></i>支出</a>
                            </li>
                            <li>
                                <a href="invoice.jsp"><i class="fa fa-key "></i>发票</a>
                            </li>
                        </ul>
                    </li>
                    <li>
                        <a href="Member.jsp"><i class="fa fa-flash "></i>社团成员 </a>
                    </li>
                    <li>
                        <a href="#"><i class="fa fa-bicycle "></i>社团活动及荣誉 <span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">

                            <li>
                                <a href="Activity_record.jsp"><i class="fa fa-desktop "></i>社团活动 </a>
                            </li>
                            <li>
                                <a href="form-advance.jsp"><i class="fa fa-code "></i>社团荣誉</a>
                            </li>


                        </ul>
                    </li>
                    <li>
                        <a href="Activity_picture.jsp"><i class="fa fa-anchor "></i>社团活动照</a>
                    </li>
                    <li>
                        <a href="error.jsp"><i class="fa fa-bug "></i>Error Page</a>
                    </li>
                    <li>
                        <a href="#"><i class="fa fa-sitemap  "></i>新闻/活动<span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="#"><i class="fa fa-bicycle "></i>校园新闻</a>
                            </li>
                            <li>
                                <a href="#"><i class="fa fa-flask "></i>社团新闻</a>
                            </li>
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
                        <h1 class="page-head-line">首页</h1>
                        <h1 class="page-subhead-line">This is dummy text , you can replace it with your original text. </h1>

                    </div>
                </div>
                <!-- /. ROW  -->
                <div class="row">
                    <div class="col-md-12">
                        <div class="mtp">
                            <div>
                                <h1>密码修改：</h1>
                            </div>
                            <form action="#" method="post" id="mtp_style">
                                &nbsp;&nbsp;&nbsp;请输入旧密码：<input type="text" id="oldPassword" name="请输入旧密码"><br>
                                &nbsp;&nbsp;&nbsp;请输入新密码：<input type="text" id="newPassword" name="请输入新密码"><br>
                                请重复输入密码：<input type="text" id="newPassword1" name="请重复输入密码"><br>
                                <button class="b_style">确定修改</button>
                            </form>
                        </div>
                    </div>
                </div>

            </div>
            <!-- /. PAGE INNER  -->
        </div>
        <!-- /. PAGE WRAPPER  -->
    </div>
    <!-- /. WRAPPER  -->

    <!-- SCRIPTS -AT THE BOTOM TO REDUCE THE LOAD TIME-->
    <!-- JQUERY SCRIPTS -->
    <script src="assets/js/jquery-1.10.2.js"></script>
    <!-- BOOTSTRAP SCRIPTS -->
    <script src="assets/js/bootstrap.js"></script>
    <!-- METISMENU SCRIPTS -->
    <script src="assets/js/jquery.metisMenu.js"></script>
    <!-- CUSTOM SCRIPTS -->
    <script src="assets/js/custom.js"></script>


</body>
</html>
