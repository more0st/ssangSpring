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

<div>
	<p> ${vo.id} </p>
	<p> ${vo.pwd} </p>
	<p> ${vo.name} </p>
	<p> ${vo.memberType} </p>
	<p> ${vo.hak} </p>
	<p> ${vo.age} </p>
	<p> ${vo.tel} </p>
</div>

<hr>
<c:forEach var="type" items="${memberTypes}">
	<p> ${type} </p>
</c:forEach>
<hr>

<c:forEach var="h" items="${hakList}">
	<p> ${h} </p>
</c:forEach>
<hr>


</body>
</html>