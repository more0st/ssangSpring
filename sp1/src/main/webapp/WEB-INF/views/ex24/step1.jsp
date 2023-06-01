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

<form action="${pageContext.request.contextPath}/ex24/step1" method="post">
	<p> 이름 : <input type="text" name="name" value="${user.name}"> </p>
	<p> 이메일 : <input type="text" name="email" value="${user.email}"> </p>
	<p> <button type="submit"> 다음 단계 </button> </p>
	<p> ${msg} </p>
</form>

</body>
</html>