<!--个人信息-->
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>个人信息</title>

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
                        <h1 class="page-head-line">照例是社团名</h1>
                        <h1 class="page-subhead-line">还是社团简介 </h1>
                    </div>
                </div>
                <!-- /. ROW  -->
                        <div class="row">
                            <div id="pi_form">
                                <form action="#" method="post">
                                    姓名：<input type="text" id="username" name="username" value="aaa" readonly ><br>
                                    姓别：<input type="text" id="sex" name="sex" value="aaa" readonly><br>
                                    学号：<input type="text" id="studentNo" name="studentNo" value="aaa" readonly><br>
                                    年级：<input type="text" id="grade" name="grade" value="aaa" readonly><br>
                                    专业：<input type="text" id="major" name="major" value="aaa" readonly><br>
                                    班级：<input type="text" id="class" name="class" value="aaa" readonly><br>
                                    电话：<input type="text" id="tel" name="tel" value="aaa" readonly><br>
                                    地址：<input type="text" id="address" name="address" value="aaa" readonly>
                                </form>

                            <div class="col-md-12">
                                <div class="panel panel-default">
                                    <div class="panel-body">
                                        <button class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal">
                                            <h2>修改个人信息</h2>
                                        </button>
                                        <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                                            <div class="modal-dialog">
                                                <div class="modal-content">
                                                    <div class="modal-header">
                                                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                                                        <h4 class="modal-title" id="myModalLabel">修改个人属性</h4>
                                                    </div>
                                                    <div class="modal-body">
                                                        <form action="#" method="post">
                                                            姓名：<input type="text" id="username1" name="username1" value="aaa" readonly ><br>
                                                            姓别：<input type="text" id="sex1" name="sex1" value="aaa" readonly><br>
                                                            学号：<input type="text" id="studentNo1" name="studentNo1" value="aaa" readonly><br>
                                                            年级：<input type="text" id="grade1" name="grade1" value="aaa" readonly><br>
                                                            专业：<input type="text" id="major1" name="major1" value="aaa" readonly><br>
                                                            班级：<input type="text" id="class1" name="class1" value="aaa" readonly><br>
                                                            电话：<input type="text" id="tel1" name="tel1" value="aaa" readonly><br>
                                                            地址：<input type="text" id="address1" name="address1" value="aaa" readonly>
                                                            <div class="modal-footer">
                                                                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                                                                <button type="button" class="btn btn-primary">保存</button>
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
    <script src="assets/js/jquery-1.10.2.js"></script>
    <!-- BOOTSTRAP SCRIPTS -->
    <script src="assets/js/bootstrap.js"></script>
     <!-- METISMENU SCRIPTS -->
    <script src="assets/js/jquery.metisMenu.js"></script>
    <!-- CUSTOM SCRIPTS -->
    <script src="assets/js/custom.js"></script>



</body>
</html>
