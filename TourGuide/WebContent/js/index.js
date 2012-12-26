$(function() {

	$.formValidator.initConfig({
		formID : "scoreForm",
		onError : function(msg, obj, errorlist) {
			$("#errorlist").empty();
			$.map(errorlist, function(msg) {
				$("#errorlist").append("<li>" + msg + "</li>");
			});
		},
		submitAfterAjaxPrompt : '正在查询，请稍等...'
	});

	$("#name").formValidator({
		onShow : "请输入用考生姓名",
		onFocus : "考生姓名不能为空",
		onCorrect : "完成"
	}).inputValidator({
		min : 1,
		onErrorMin : "考生姓名不能为空,请确认"
	});
	
	$("#examnum").formValidator({
		onShow : "请输入准考证号",
		onFocus : "准考证号不能为空",
		onCorrect : "完成"
	}).inputValidator({
		min : 1,
		onErrorMin : "准考证号不能为空,请确认"
	});
	
	$("#sfzh").formValidator({
		onShow : "请输入15或18位的身份证",
		onFocus : "输入15或18位的身份证",
		onCorrect : "完成"
	}).functionValidator({
		fun : isCardID
	});
	
	$('#verifycode').formValidator({
		onShow:"请输入验证码",
		onFocus:"请根据图片提示输入验证码",
		onCorrect : "完成"
	}).inputValidator({
		min:4,
		onErrorMin:"请输入4位验证码"
	});

});