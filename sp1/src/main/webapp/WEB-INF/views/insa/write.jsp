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
<form action="${pageContext.request.contextPath}/insa/write" method="post">
	<table>
		<tr>
			<td>이름</td>
			<td> <input type="text" name="name" required="required"> </td>
		</tr>
		<tr>
			<td>생년월일</td>
			<td> <input type="text" name="birth" required="required"> </td>
		</tr>
		<tr>
			<td>전화번호</td>
			<td> <input type="text" name="tel" required="required"> </td>
		</tr>
		<tr>
			<td>기본급</td>
			<td> <input type="text" name="salary" required="required"> </td>
		</tr>
		<tr>
			<td>수당</td>
			<td> <input type="text" name="bonus" required="required"> </td>
		</tr>
	</table>
	
	<button type="submit"> 등록하기 </button>
</form>
</div>

</body>
</html>