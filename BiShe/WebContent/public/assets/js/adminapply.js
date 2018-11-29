/**
 * 这里是申请审核的js
 */


//同意
	!(function(){
		var oA = document.getElementsByClassName("agree");
		var length = oA.length;
		for( var i = 0 ; i < length ;i++){
			oA[i].index = i; // 自定义属性
			oA[i].onclick = function(){
				var oTr = document.getElementsByClassName('tr')[this.index]; // 点击当前父父节点td
				
				var arr = [];// 存储文本内容
				var child = oTr.children; // // 获取 td 的全部子节点
				for (var i = 0 ;i < 4 ;i++ ){
					var text = child[i].innerText;
					arr.push( text );
				}
				console.log(arr[3]);
				
				$.ajax({
				url:"agreeAssApply",
				type:"get",
				data:{"ass_act_ass_id":arr[0],"ass_act_name":arr[1],"ass_act_time":arr[3],"ass_act_address":arr[2]},
				dataType:"json",
				});
			}
		}

	})()

//拒绝
	$(".refuse").on("click",function(){
		var act_ass_id = $(this).parent().next().text();
		console.log(act_ass_id)
		
		$.ajax({
			url:"refuseassApply",
			type:"get",
			data:{"ass_id":ass_id},
			dataType:"json",
	});
	})