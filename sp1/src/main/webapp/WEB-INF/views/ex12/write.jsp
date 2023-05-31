<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/ex12/write" method="post">
	<p> 이름 : <input type="text" name="name"> </p>
	<p> 나이 : <input type="text" name="age"> </p>
	<p>
		좋아하는 과목 : 
		<input type="checkbox" name="subject" value="java"> 자바
		<input type="checkbox" name="subject" value="spring"> 스프링
		<input type="checkbox" name="subject" value="html"> HTML
		<input type="checkbox" name="subject" value="css"> CSS
		<input type="checkbox" name="subject" value="js"> 자바스크립트
	</p>
	<p>
		<button type="submit"> 등록 </button>
	</p>
</form>

</body>
</html>