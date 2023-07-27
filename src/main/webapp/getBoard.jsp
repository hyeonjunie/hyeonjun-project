<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
 <%@ page import="com.VO.BoardVO" %>
 <%@ page import="com.DAO.BoardDAO" %>
   
    <%

	BoardVO board = (BoardVO) session.getAttribute("board");	

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<center>
		<h1>�� ��</h1>
		<a href="logout.do">Log-out</a>
		<hr>
		<form action="updateBoard.do" method="post">
			<input name="b_no" type="hidden" value="<%=board.getB_no()%>" />
			<table border="1" cellpadding="0" cellspacing="0">
				<tr>
					<td bgcolor="orange" width="70">����</td>
					<td align="left"><input name="title" type="text"
						value="<%=board.getTitle()%>" /></td>
				</tr>
				<tr>
					<td bgcolor="orange">�ۼ���</td>
					<td align="left"><%=board.getWriter()%></td>
				</tr>
				<tr>
					<td bgcolor="orange">����</td>
					<td align="left"><textarea name="cont" cols="40" rows="10">
						<%=board.getCont()%></textarea></td>
				</tr>
				<tr>
					<td bgcolor="orange">�����</td>
					<td align="left"><%=board.getRegdate()%></td>
				</tr>
				<tr>
					<td bgcolor="orange">��ȸ��</td>
					<td align="left"><%=board.getCnt()%></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="�� ����" /></td>
				</tr>
			</table>
		</form>
		<hr>
		<a href="insertBoard.jsp">�۵��</a>&nbsp;&nbsp;&nbsp; 
		<a href="deleteBoard.do?b_no=<%=board.getB_no()%>">�ۻ���</a>&nbsp;&nbsp;&nbsp;
		<a href="getBoardList.do">�۸��</a>
	</center>
</body>
</html>