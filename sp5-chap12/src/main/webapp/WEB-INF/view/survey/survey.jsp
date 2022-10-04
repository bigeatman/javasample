<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>설문조사</title>
</head>
<body>
	<h2>설문조사</h2>
	<form method="post">
		<p>
			1. 당신의 역할은? <br /> <label><input type="radio" name="responses[0]" value="서버"></label> <label><input type="radio" name="responses[0]" value="프론트"></label> <label><input type="radio" name="responses[0]" value="풀스택"></label>
		</p>
		<p>
			2. 가장 많이 사용하는 개발 도구는? <br /> <label><input type="radio" name="responses[1]" value="Eclipse"></label> <label><input type="radio" name="responses[1]" value="Intelij"></label> <label><input type="radio" name="responses[1]"
				value="Sumblime"></label>
		</p>
		<p>
			3. 하고 싶은 말 <br /> <input type="text" name="response[2]">
		</p>
		<p>
			<label>응답자 위치: <br /></label> <input type="text" name="res.location">
		</p>
		<p>
			<label>응답자 나이: <br /></label> <input type="text" name="res.age">
		</p>
		<input type="submit" value="전송">
	</form>
</body>
</html>