<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
 <%@ page import="com.VO.UserVO" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<center>
		<h1>로그인</h1>
		<hr>
		<form action="login.do" method="post">
			<table border="1" cellpadding="0" cellspacing="0">
				<tr>
					<td bgcolor="orange">아이디</td>
					<td><input type="text" name="userid" value="park"/></td>
				</tr>
				<tr>
					<td bgcolor="orange">비밀번호</td>
					<td><input type="password" name="userpassword" value="1234"/></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="로그인" /></td>
				</tr>
			</table>
		</form>
		<hr>
	</center>

</body>
</html>