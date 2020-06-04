<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring Boot Test</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
function testAjax(){
	$.ajax({
		type: "GET",
		url: "/valueTest",
		success: (data) => {
			//console.log(data);
			$('#contents').html(data);
		}
	});
}

function getUsers(){
	$.ajax({
		type: "GET",
		url: "/users",
		success: (data) => {
			var resultHtml = "";
			resultHtml += "유저 목록</br>"
			resultHtml += "<table>"
			for(var i = 0; i < data.length; i++){
				
				var user_id = data[i]['user_id'];
				var name = data[i]['name'];
				var id = data[i]['id'];
				var password = data[i]['password'];
				
				resultHtml += "<tr>"
				resultHtml += "<td>" + user_id + "</td>"
				resultHtml += "<td>" + name + "</td>"
				resultHtml += "<td>" + id + "</td>"
				resultHtml += "<td>" + password + "</td>"
				resultHtml += "</tr>"	
				
			}
			resultHtml += "</table>";
			$('#contents').html(resultHtml);
		}
	});
}

</script>
</head>
<body>

<hr>
Hello World! - 스프링부트 테스트
<hr>

<input type="button" onClick="testAjax()" value="ajax 테스트"></input>
<input type="button" onClick="getUsers()" value="user 가져오기"></input>
<br>
<div id="contents"> </div>

</body>
</html>