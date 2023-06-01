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

<form action="${pageContext.request.contextPath}/ex24/step2" method="post">
	<p> 아이디 : <input type="text" name="id"> </p>
	<p> 패스워드 : <input type="text" name="pwd"> </p>
	<p> 전화번호 : <input type="text" name="tel"> </p>
	<p>
		<button type="button" onclick="location.href='${pageContext.request.contextPath}/ex24/join';">이전단계</button>
		<button type="submit">회원가입</button>
	</p>
</form>

</body>
</html>