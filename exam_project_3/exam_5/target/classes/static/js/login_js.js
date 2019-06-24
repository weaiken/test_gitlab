
$(function(){
	$("li").click(
		function(){
			var index = $(this).index();
			$(this).addClass("choosed").siblings().removeClass("choosed");
			$(".infor").eq(index).show().siblings().hide();
		}
	)
})

$(function(){
	$("#account").blur(function(){
		var value = $("#account").val();
		if(value==""){
			$("#sss").html("用户名不能为空");
		}else{
			$("#sss").html("");
		}
	})
})

$(function(){
	$("#password").blur(function(){
		var value = $("#password").val();
		if(value==""){
			$("#aaa").html("密码不能为空");
		}else{
			$("#aaa").html("");
		}
	})
})
//$("#subaction").click(function() {
//			var value1 = $("#account").val();
//			var value2 = $("#password").val();
//				$.ajax({
//					url: "loginServlet",
//					type: "post",
//					dataType: "text",
//					data: {
//						"account": value1,
//						"password": value2
//					},
//					success: function(data) {
//						if(data=="a") {
//							$("#kkk").html("密码不正确");
//						} else if(data=="b"){
//							$("#kkk").html("用户名不能为空");
//						}else{
//							$("#kkk").html("");
//						}
//					},
//				});
//});
//$(function(){
//	$("#account1").blur(function(){
//		var value = $("#account1").val();
//		if(value==""){
//			$("#bbb").html("用户名不能为空");
//		}
//	})
//})
//
//$(function(){
//	$("#password1").blur(function(){
//		var value = $("#password1").val();
//		if(value==""){
//			$("#ccc").html("密码不能为空");
//		}
//	})
//})
//
//$(function(){
//	$("#subaction1").click(function(){
//		var value1 = $("#account1").val();
//		var value2 = $("#password1").val();
//		if(""==value1){
//			$("#bbb").html("用户名不能为空");
//		}
//		else if(""==value2){
//			$("#ccc").html("密码不能为空");
//			}
//			else{
//				$("#eee").html("注册成功");
//			}
//	})
//})