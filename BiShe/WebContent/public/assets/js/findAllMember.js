/**
 * 这里是分页的js
 */

//首页
$("#u_li .pagination a.homepage").on("click",function() {
		if(parseFloat($("#cur_page").text()) == 1){
			return;
		}
		console.log('111')
		$.ajax({
			url:"toMember2",
			type:"get",
			data:{"stu_username":parseFloat($(".username").text()),"pagenum":1},
			dataType:"json",
			success:function(data){
				console.log('success')
				$("tbody tr").remove();
				console.log(data);
				for(var i=0;i<data.list.length;i++){
					var a="<tr>"+
					" <td>&nbsp;&nbsp;&nbsp;</td>"+
                    "<td>"+data.list[i].stu_name +"</td>"+
                    "<td>"+data.list[i].stu_major +"</td>"+
                    "<td>"+data.list[i].stu_class +"</td>"+
                    "<td>"+data.list[i].stu_grade +"</td>"+
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
			url:"toMember2",
			type:"get",
			data:{"stu_username":parseFloat($(".username").text()),"pagenum":parseFloat($("#cur_page").text())-1},
			dataType:"json",
			success:function(data){
				console.log('success')
				$("tbody tr").remove();
				console.log(data.list[1]);
				for(var i=0;i<data.list.length;i++){
					  
					var a="<tr>"+
					" <td>&nbsp;&nbsp;&nbsp;</td>"+
                    "<td>"+data.list[i].stu_name +"</td>"+
                    "<td>"+data.list[i].stu_major +"</td>"+
                    "<td>"+data.list[i].stu_class +"</td>"+
                    "<td>"+data.list[i].stu_grade +"</td>"+
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
	console.log($(".username").text());

	$("#u_li .pagination a.nextpage").on("click",function(){
		
		if(parseFloat($("#cur_page").text()) == parseFloat($("#totalPage").text())){
			return;
		}
		console.log('aaaa'+$(".username").text())
		$.ajax({
			url:"toMember2",
			type:"get",
			data:{"stu_username":parseFloat($(".username").text()),"pagenum":parseFloat($("#cur_page").text())+1},
			dataType:"json",
			success:function(data){
				console.log('success')
				$("tbody tr").remove();
				console.log(data);
				for(var i=0;i<data.list.length;i++){
				var a="<tr>"+
						" <td>&nbsp;&nbsp;&nbsp;</td>"+
                        "<td>"+data.list[i].stu_name +"</td>"+
                        "<td>"+data.list[i].stu_major +"</td>"+
                        "<td>"+data.list[i].stu_class +"</td>"+
                        "<td>"+data.list[i].stu_grade +"</td>"+
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
			url:"toMember2",
			type:"get",
			data:{"stu_username":parseFloat($(".username").text()),"pagenum":parseFloat($("a.allAss").text())},
			dataType:"json",
			success:function(data){
				console.log('success')
				$("tbody tr").remove();
			console.log(data);
			for(var i=0;i<data.list.length;i++){
				var a="<tr>"+
				" <td>&nbsp;&nbsp;&nbsp;</td>"+
                "<td>"+data.list[i].stu_name +"</td>"+
                "<td>"+data.list[i].stu_major +"</td>"+
                "<td>"+data.list[i].stu_class +"</td>"+
                "<td>"+data.list[i].stu_grade +"</td>"+
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
