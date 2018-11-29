
/*=============================================================
    Authour URI: www.binarytheme.com
    License: Commons Attribution 3.0

    http://creativecommons.org/licenses/by/3.0/

    100% To use For Personal And Commercial Use.
    IN EXCHANGE JUST GIVE US CREDITS AND TELL YOUR FRIENDS ABOUT US
   
    ========================================================  */


(function ($) {
    "use strict";
    var mainApp = {

        metisMenu: function () {

            /*====================================
            METIS MENU 
            ======================================*/

            $('#main-menu').metisMenu();

        },


        loadMenu: function () {

            /*====================================
            LOAD APPROPRIATE MENU BAR
         ======================================*/

            $(window).bind("load resize", function () {
                if ($(this).width() < 768) {
                    $('div.sidebar-collapse').addClass('collapse')
                } else {
                    $('div.sidebar-collapse').removeClass('collapse')
                }
            });
        },
        slide_show: function () {

            /*====================================
           SLIDESHOW SCRIPTS
        ======================================*/

            $('#carousel-example').carousel({
                interval: 3000 // THIS TIME IS IN MILLI SECONDS
            })
        },
        reviews_fun: function () {
            /*====================================
         REWIEW SLIDE SCRIPTS
      ======================================*/
            $('#reviews').carousel({
                interval: 2000 //TIME IN MILLI SECONDS
            })
        },
        wizard_fun: function () {
            /*====================================
            //horizontal wizrd code section
             ======================================*/
            /*$(function () {
                $("#wizard").steps({
                    headerTag: "h2",
                    bodyTag: "section",
                    transitionEffect: "slideLeft"
                });
            });*/
            /*====================================
            //vertical wizrd  code section
            ======================================*/
           /* $(function () {
                $("#wizardV").steps({
                    headerTag: "h2",
                    bodyTag: "section",
                    transitionEffect: "slideLeft",
                    stepsOrientation: "vertical"
                });
            });*/
        },
       
        
    };
    $(document).ready(function () {
        mainApp.metisMenu();
        mainApp.loadMenu();
        mainApp.slide_show();
        mainApp.reviews_fun();
        mainApp.wizard_fun();
       
    });
}(jQuery));


//聊天
$(".input-group-btn #send").on("click",function() {
	var stu_username = $(".username").text();
	var m_content = $("#m_content").val();
    $.ajax({
        type : "GET", 
        url : "sendMessage",
        data :{'stu_username':stu_username,'m_content':m_content},
        success:function(data){
        	console.log('111')
        	console.log(data)
        	$(".chat-widget-left").remove();
        	$(".chat-widget-name-left").remove();
        	for(var i=0;i<data.length;i++){
				var a="<div class='chat-widget-left'>"+
						data[i].m_content +"</div>"+
						"<div class='chat-widget-name-left'>"+
						data[i].m_stu_name +"</div>"
                $(".chat-widget-main").append(a);
                   }
        	console.log('2018519')
            $("#m_content").val("");
        	
        }
        
    });
})

//新闻编辑
$(".container #determine").on("click",function() {
	var stu_username = $(".stuNum").text();
	var n_title = $("#title").val();
	var n_p_time = $("#time").val();
	console.log(n_p_time)
	var n_content = $("#content").val();
    $.ajax({
        type : "GET", 
        url : "inNews",
        data :{'stu_username':stu_username,'n_p_time':n_p_time,'n_content':n_content,'n_title':n_title},
     
    });
})

//校园新闻编辑
$(".container #admindetermine").on("click",function() {
	var stu_username = $(".stuNum").text();
	var n_title = $("#title").val();
	var n_p_time = $("#time").val();
	console.log(n_p_time)
	var n_content = $("#content").val();
    $.ajax({
        type : "GET", 
        url : "inAdminNews",
        data :{'stu_username':stu_username,'n_p_time':n_p_time,'n_content':n_content,'n_title':n_title},
     
    });
})
