/**
 * 这里是支出分页的js
 */

//首页
$("#u_li .pagination a.homepage").on("click",function() {
		if(parseFloat($("#cur_page").text()) == 1){
			return;
		}
		console.log('111')
		$.ajax({
			url:"toIas3",
			type:"get",
			data:{"pagenum":1},
			dataType:"json",
			success:function(data){
				console.log('success')
				$(".plan li").remove();
				console.log(data);
				for(var i=0;i<data.list.length;i++){
					var a=  "<li class='price-simple'>"+
		                    "<strong>"+data.list[i].inv_money +"</strong>"+"<i class='fa fa-dollar'></i></li>"+
		                    "<li><strong>"+"出款人："+data.list[i].inv_name +"</strong>"+"</li>"+
		                    "<li><strong>"+"内容："+data.list[i].inv_content +"</strong>"+"</li>"+
		                    "<li><strong>"+"时间："+data.list[i].inv_time +"</strong>"+"</li>"+
		                    "<li><strong>"+"地点："+data.list[i].inv_address +"</strong>"+"</li>"
                
		             $(".plan").append(a);    
                   }
				//同时修改当前页
				console.log(data.pageNum);
				$("#cur_page").remove();
					var b="<span id='cur_page'>"+
	                        data.pageNum +
	                        "/"+
	                        data.totalPage
	                       "</span>"
					$(".pagination #page").append(b);
			}
		});
		
	})
	
	//上一页
	$("#u_li .pagination a.prepage").on("click",function(){
		if(parseFloat($("#cur_page").text()) == 1){
			return;
		}
		$.ajax({
			url:"toIas3",
			type:"get",
			data:{"pagenum":parseFloat($("#cur_page").text())-1},
			dataType:"json",
			success:function(data){
				console.log('success')
				$(".plan li").remove();
				console.log(data.list[1]);
				for(var i=0;i<data.list.length;i++){
					  
					var a=  "<li class='price-simple'>"+
		                    "<strong>"+data.list[i].inv_money +"</strong>"+"<i class='fa fa-dollar'></i></li>"+
		                    "<li><strong>"+"出款人："+data.list[i].inv_name +"</strong>"+"</li>"+
		                    "<li><strong>"+"内容："+data.list[i].inv_content +"</strong>"+"</li>"+
		                    "<li><strong>"+"时间："+data.list[i].inv_time +"</strong>"+"</li>"+
		                    "<li><strong>"+"地点："+data.list[i].inv_address +"</strong>"+"</li>"
                
           $(".plan").append(a); 
				}
				//同时修改当前页
				console.log(data.pageNum);
				$("#cur_page").remove();
					var b="<span id='cur_page'>"+
	                        data.pageNum +
	                        "/"+
	                        data.totalPage
	                       "</span>"
					$(".pagination #page").append(b);
			}
		});
		
	})
	//下一页
	console.log($("#u_li .pagination a.nextpage"));

	$("#u_li .pagination a.nextpage").on("click",function(){
		
		if(parseFloat($("#cur_page").text()) == parseFloat($("#totalPage").text())){
			return;
		}
		$.ajax({
			url:"toIas3",
			type:"get",
			data:{"pagenum":parseFloat($("#cur_page").text())+1},
			dataType:"json",
			success:function(data){
				console.log('success')
				$(".plan li").remove();
				console.log(data);
				console.log("zhichu"+data.list[0].inv_name);
				
				for(var i=0;i<data.list.length;i++){
//					debugger;
					var a=  "<li class='price-simple'>"+
	                        "<strong>"+data.list[i].inv_money +"</strong>"+"<i class='fa fa-dollar'></i></li>"+
	                        "<li><strong>"+"出款人："+data.list[i].inv_name +"</strong>"+"</li>"+
	                        "<li><strong>"+"内容："+data.list[i].inv_content +"</strong>"+"</li>"+
	                        "<li><strong>"+"时间："+data.list[i].inv_time +"</strong>"+"</li>"+
	                        "<li><strong>"+"地点："+data.list[i].inv_address +"</strong>"+"</li>"
                        
                   $(".plan").append(a);    
                }
				
				//同时修改当前页
				$("#cur_page").remove();
					var b="<span id='cur_page'>"+
	                        data.pageNum +
	                        "/"+
	                        data.totalPage
	                       "</span>"
					$(".pagination #page").append(b);
			},
			error:function(){
				console.log("error")
			}
		});
		
	})
	//尾页
	$("#u_li .pagination a.end").on("click",function() {
		console.log('111');
		if(parseFloat($("#cur_page").text()) == parseFloat($("#totalPage").text())){
			return;
		}
		$.ajax({
			url:"toIas3",
			type:"get",
			data:{"pagenum":parseFloat($("a.allAss").text())},
			dataType:"json",
			success:function(data){
				console.log('success')
				$(".plan li").remove();
			console.log(data);
			for(var i=0;i<data.list.length;i++){
				var a=  "<li class='price-simple'>"+
			                "<strong>"+data.list[i].inv_money +"</strong>"+"<i class='fa fa-dollar'></i></li>"+
			                "<li><strong>"+"出款人："+data.list[i].inv_name +"</strong>"+"</li>"+
			                "<li><strong>"+"内容："+data.list[i].inv_content +"</strong>"+"</li>"+
			                "<li><strong>"+"时间："+data.list[i].inv_time +"</strong>"+"</li>"+
			                "<li><strong>"+"地点："+data.list[i].inv_address +"</strong>"+"</li>"
            
                $(".plan").append(a);    
               }
			//同时修改当前页
			console.log(data.pageNum);
			$("#cur_page").remove();
				var b="<span id='cur_page'>"+
                        data.pageNum +
                        "/"+
                        data.totalPage
                       "</span>"
				$(".pagination #page").append(b);
				
			}
		});
		
	})
