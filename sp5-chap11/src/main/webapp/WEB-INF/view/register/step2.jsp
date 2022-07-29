<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title>회원가입</title>
</head>
<body>
	<h2>회원 정보 입력</h2>
	<form:form action="step3" modelAttribute="req">
		<p>
			<label>이메일: <form:input path="email" /> <br>
			</label>
		</p>
		<p>
			<label>이름: <form:input path="name" /></label>
		</p>
		<p>
			<label>비밀번호: <form:input path="password" /></label>
		</p>
		<p>
			<label>비밀번호 확인:` <form:input path="confirmPassword" /></label>
		</p>
		<input type="submit" value="가입 완료">
	</form:form>
</body>
</html>