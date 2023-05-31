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

<h3>@RequestMapping : url을 class 또는 메소드와 매핑</h3>

<p>
	${msg}
</p>
<hr>

<p>
	<a href="${pageContext.request.contextPath}/ex01/request">GET 요청</a>
</p>
<hr>

<form action="${pageContext.request.contextPath}/ex01/request" method="post">
	<button type="submit">POST 요청</button>
</form>

</body>
</html>