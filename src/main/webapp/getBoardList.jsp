<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.util.List"%>
<%@ page import="com.VO.BoardVO" %>
<%@ page import="com.DAO.BoardDAO" %>
<% 
List<BoardVO> boardList = (List) session.getAttribute("boardList");	
	

	
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<center>
		<h1>글 목록</h1>
		<h3>
			테스트님 환영합니다...<a href="logout.do">Log-out</a>
		</h3>
		<!-- 검색 시작 -->
		<form action="getBoardList.jsp" method="post">
			<table border="1" cellpadding="0" cellspacing="0" width="700">
				<tr>
					<td align="right"><select name="searchCondition">
							<option value="TITLE">제목
							<option value="CONT">내용
					</select> <input name="searchKeyword" type="text" /> <input type="submit"
						value="검색" /></td>
				</tr>
			</table>
		</form>
		<!-- 검색 종료 -->
		<table border="1" cellpadding="0" cellspacing="0" width="700">
			<tr>
				<th bgcolor="orange" width="100">번호</th>
				<th bgcolor="orange" width="200">제목</th>
				<th bgcolor="orange" width="150">작성자</th>
				<th bgcolor="orange" width="150">등록일</th>
				<th bgcolor="orange" width="100">조회수</th>
			</tr>
			<%
			for (BoardVO board : boardList) {
			%>
			<tr>
				<td><%=board.getB_no()%></td>
				<td align="left"><a href="getBoard.do?b_no=<%=board.getB_no()%>"><%=board.getTitle()%></a></td>
				<td><%=board.getWriter()%></td>
				<td><%=board.getRegdate()%></td>
				<td><%=board.getCnt()%></td>
			</tr>
			<%
				}
			%>
		</table>
		<br> <a href="insertBoard.jsp">새글 등록</a>
	</center>

</body>
</html>