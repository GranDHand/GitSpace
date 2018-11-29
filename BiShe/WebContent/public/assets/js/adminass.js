/**
 * 这里是全部社团分页的js
 */

//首页
$("#u_li .pagination a.homepage").on("click",function() {
		if(parseFloat($("#cur_page").text()) == 1){
			return;
		}
		console.log('111')
		$.ajax({
			url:"toAdminAll2",
			type:"get",
			data:{"pagenum":1},
			dataType:"json",
			success:function(data){
				console.log('success')
				$("tbody tr").remove();
				console.log(data);
				for(var i=0;i<data.list.length;i++){
				var a="<tr>"+
                        "<td id='ass_id>'>"+data.list[i].ass_id +"</td>"+
                        "<td>"+data.list[i].ass_name +"</td>"+
                        "<td>"+data.list[i].ass_presidentName +"</td>"+
                        "<td>"+data.list[i].ass_memberNum +"</td>"+
                        "<td>"+"<button id='del' onclick='delclick(this)' class='btn btn-danger'>删除</button></td></br>"+
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
	
	//上一页
	$("#u_li .pagination a.prepage").on("click",function(){
		if(parseFloat($("#cur_page").text()) == 1){
			return;
		}
		$.ajax({
			url:"toAdminAll2",
			type:"get",
			data:{"pagenum":parseFloat($("#cur_page").text())-1},
			dataType:"json",
			success:function(data){
				console.log('success')
				$("tbody tr").remove();
				console.log(data.list[1]);
				for(var i=0;i<data.list.length;i++){
					  
				var a="<tr>"+
                        "<td id='ass_id>'>"+data.list[i].ass_id +"</td>"+
                        "<td>"+data.list[i].ass_name +"</td>"+
                        "<td>"+data.list[i].ass_presidentName +"</td>"+
                        "<td>"+data.list[i].ass_memberNum +"</td>"+
                        "<td>"+"<button id='del' onclick='delclick(this)' class='btn btn-danger'>删除</button></td></br>"+
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
	//下一页
	console.log($("#u_li .pagination a.nextpage"));

	$("#u_li .pagination a.nextpage").on("click",function(){
		
		if(parseFloat($("#cur_page").text()) == parseFloat($("#totalPage").text())){
			return;
		}
		$.ajax({
			url:"toAdminAll2",
			type:"get",
			data:{"pagenum":parseFloat($("#cur_page").text())+1},
			dataType:"json",
			success:function(data){
				console.log('success')
				$("tbody tr").remove();
				console.log(data);
				for(var i=0;i<data.list.length;i++){
				var a="<tr>"+
                        "<td id='ass_id>'>"+data.list[i].ass_id +"</td>"+
                        "<td>"+data.list[i].ass_name +"</td>"+
                        "<td>"+data.list[i].ass_presidentName +"</td>"+
                        "<td>"+data.list[i].ass_memberNum +"</td>"+
                        "<td>"+"<button id='del'  onclick='delclick(this)' class='btn btn-danger'>删除</button></td></br>"+
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
			url:"toAdminAll2",
			type:"get",
			data:{"pagenum":parseFloat($("a.allAss").text())},
			dataType:"json",
			success:function(data){
				console.log('success')
				$("tbody tr").remove();
			console.log(data);
			for(var i=0;i<data.list.length;i++){
			var a="<tr>"+
                    "<td id='ass_id>'"+data.list[i].ass_id +"</td>"+
                    "<td>"+data.list[i].ass_name +"</td>"+
                    "<td>"+data.list[i].ass_presidentName +"</td>"+
                    "<td>"+data.list[i].ass_memberNum +"</td>"+
                    "<td>"+"<button id='del' onclick='delclick(this)' class='btn btn-danger'>删除</button></td></br>"+
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
	
	
	//删除点击事件
$(document).on("click","tbody td #del",function() {
	var ass_id = $(this).parent().next().text();
	console.log()
	console.log('111')
	$.ajax({
		url:"del",
		type:"get",
		data:{"ass_id":ass_id},
		dataType:"json",
	});
})


