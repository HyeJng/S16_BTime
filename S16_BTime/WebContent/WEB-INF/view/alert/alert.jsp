<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>오류</title>
<script src='./js/jquery-3.6.1.js'></script>
</head>
<body>
	<h3>${msg }</h3>
	<button type="button" id="btn_alert_prev">이전 페이지</button>
	<button type="button" id="btn_alert_main">메인 페이지</button>
	
	<script>
		$(loadAlert);
		function loadAlert(){
			$("#btn_alert_prev").on("click", alertPrevClickHandler);
			$("#btn_alert_main").on("click", alertMainClickHandler);
		}
		function alertPrevClickHandler(){
			console.log("alertPrevClickHandler");
			history.back();
		}
		function alertMainClickHandler(){
			console.log("alertMainClickHandler");
			location.href = "<%=request.getContextPath()%>/main";
		}
	</script>
</body>
</html>