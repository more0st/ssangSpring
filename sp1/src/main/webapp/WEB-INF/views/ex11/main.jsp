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

<h3> 파라미터 : @RequestParam </h3>

<p> <a href="${pageContext.request.contextPath}/ex11/request">확인1</a> </p>
<p> <a href="${pageContext.request.contextPath}/ex11/request?name=spring">확인2</a> </p>
<p> <a href="${pageContext.request.contextPath}/ex11/request?age=10">확인3</a> </p>
<p> <a href="${pageContext.request.contextPath}/ex11/request?name=java&age=15">확인4</a> </p>



</body>
</html>