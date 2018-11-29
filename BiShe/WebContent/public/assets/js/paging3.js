/**
 * 这里是收入分页的js
 */

//首页
$("#u_li .pagination a.homepage").on("click",function() {
		if(parseFloat($("#cur_page").text()) == 1){
			return;
		}
		console.log('111')
		$.ajax({
			url:"toIas4",
			type:"get",
			data:{"pagenum":1},
			dataType:"json",
			success:function(data){
				console.log('success')
				$("tbody tr").remove();
				console.log(data);
				for(var i=0;i<data.list.length;i++){
					var a="<tr>"+
                    "<td>"+data.list[i].inv_id +"</td>"+
                    "<td>"+data.list[i].inv_content +"</td>"+
                    "<td>"+data.list[i].inv_money +"</td>"+
                    "<td>"+data.list[i].inv_time +"</td>"+
                    "<td>"+data.list[i].inv_name +"</td>"+
                   "</tr>"
                    $("tbody").append(a);
                   }
				//同时修改当前页
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
			url:"toIas4",
			type:"get",
			data:{"pagenum":parseFloat($("#cur_page").text())-1},
			dataType:"json",
			success:function(data){
				console.log('success')
				$("tbody tr").remove();
				console.log(data.list[1]);
				for(var i=0;i<data.list.length;i++){
					  
					var a="<tr>"+
                    "<td>"+data.list[i].inv_id +"</td>"+
                    "<td>"+data.list[i].inv_content +"</td>"+
                    "<td>"+data.list[i].inv_money +"</td>"+
                    "<td>"+data.list[i].inv_time +"</td>"+
                    "<td>"+data.list[i].inv_name +"</td>"+
                   "</tr>"
                    $("tbody").append(a);
				}
				//同时修改当前页
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
			url:"toIas4",
			type:"get",
			data:{"pagenum":parseFloat($("#cur_page").text())+1},
			dataType:"json",
			success:function(data){
				console.log('success')
				$("tbody tr").remove();
				console.log(data);
				for(var i=0;i<data.list.length;i++){
				var a="<tr>"+
                        "<td>"+data.list[i].inv_id +"</td>"+
                        "<td>"+data.list[i].inv_content +"</td>"+
                        "<td>"+data.list[i].inv_money +"</td>"+
                        "<td>"+data.list[i].inv_time +"</td>"+
                        "<td>"+data.list[i].inv_name +"</td>"+
                       "</tr>"
                        $("tbody").append(a);
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
			url:"toIas4",
			type:"get",
			data:{"pagenum":parseFloat($("a.allAss").text())},
			dataType:"json",
			success:function(data){
				console.log('success')
				$("tbody tr").remove();
			console.log(data);
			for(var i=0;i<data.list.length;i++){
				var a="<tr>"+
                "<td>"+data.list[i].inv_id +"</td>"+
                "<td>"+data.list[i].inv_content +"</td>"+
                "<td>"+data.list[i].inv_money +"</td>"+
                "<td>"+data.list[i].inv_time +"</td>"+
                "<td>"+data.list[i].inv_name +"</td>"+
               "</tr>"
                $("tbody").append(a);
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
