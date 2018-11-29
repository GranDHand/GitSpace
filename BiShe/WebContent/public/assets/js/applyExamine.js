/**
 * 这里是申请审核的js
 */


	//同意
	$(".agree").on("click",function(){
		var username = $(this).parent().next().text();
		console.log('111')
		console.log($(".ass_id").text())
		$.ajax({
			url:"toUpdate",
			type:"get",
			data:{"stu_username":username,"stu_assocition_id":parseFloat($(".ass_id").text())},
			dataType:"json",
	});
})

//拒绝
	$(".refuse").on("click",function(){
		var username = $(this).parent().next().text();
		console.log(username)
		
		$.ajax({
			url:"toDel",
			type:"get",
			data:{"stu_username":username},
			dataType:"json",
	});
	})
