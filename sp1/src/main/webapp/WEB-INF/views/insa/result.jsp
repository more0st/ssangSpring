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
	<table>
		<tr>
			<td>이름</td>
			<td> ${dto.name} </td>
		</tr>
		<tr>
			<td>생년월일</td>
			<td> ${dto.birth} </td>
		</tr>
		<tr>
			<td>띠</td>
			<td> ${dto.belt} </td>
		</tr>
		<tr>
			<td>나이</td>
			<td> ${dto.age} </td>
		</tr>
		<tr>
			<td>전화번호</td>
			<td> ${dto.tel} </td>
		</tr>
		<tr>
			<td>기본급</td>
			<td> <fmt:formatNumber type="currency" value="${dto.salary}"/> </td>
		</tr>
		<tr>
			<td>수당</td>
			<td>  <fmt:formatNumber type="currency" value="${dto.bonus}"/> </td>
		</tr>
		<tr>
			<td>세금</td>
			<td> <fmt:formatNumber type="currency" value="${dto.tax}"/> </td>
		</tr>
		<tr>
			<td>실급여</td>
			<td> <fmt:formatNumber type="currency" value="${dto.rSal}"/> </td>
		</tr>
	</table>

</div>

</body>
</html>