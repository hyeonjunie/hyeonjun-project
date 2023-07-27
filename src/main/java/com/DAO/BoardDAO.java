package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.VO.BoardVO;

import JDBCUtil.JDBCUtil;

public class BoardDAO {
	
	private Connection conn = null;
	private PreparedStatement stmt = null;
	private ResultSet rs = null;
	
	private final String BOARDINSERT = "INSERT INTO BOARD(b_no, title, writer, cont) VALUES ((select nvl(max(b_no),0)+1 from board), ?, ?, ?)";
	private final String BOARDUPDATE = "UPDATE BOARD SET title=?, cont=?  where b_no=?";
	private final String BOARDDELETE = "DELETE FROM BOARD where b_no=?";
	private final String BOARDGET = "SELECT * FROM BOARD where b_no=?";
	private final String BOARDLIST = "SELECT * FROM BOARD order by b_no desc";
	
	public void insertBoard(BoardVO vo) {
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(BOARDINSERT);
			stmt.setString(1, vo.getTitle());
			stmt.setString(2, vo.getWriter());
			stmt.setString(3, vo.getCont());
			stmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(stmt, conn);
		}
	}
		public void updateBoard(BoardVO vo) {
			try {
				conn = JDBCUtil.getConnection();
				stmt = conn.prepareStatement(BOARDUPDATE);
				stmt.setString(1, vo.getTitle());
				stmt.setString(2, vo.getCont());
				stmt.setInt(3, vo.getB_no());
				stmt.executeUpdate();
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				JDBCUtil.close(stmt, conn );
			}
		}
		public void deleteBoard(BoardVO vo) {
			try {
				conn = JDBCUtil.getConnection();
				stmt = conn.prepareStatement(BOARDDELETE);
				stmt.setInt(1, vo.getB_no());
				stmt.executeUpdate();
			}catch(Exception e) {
					e.printStackTrace();
			}finally {
				JDBCUtil.close(stmt, conn);
			}
		}
		public BoardVO getBoard(BoardVO vo) {
			BoardVO board =null;
			try {
				conn = JDBCUtil.getConnection();
				stmt = conn.prepareStatement(BOARDGET);
				stmt.setInt(1, vo.getB_no());
				rs = stmt.executeQuery();
				if(rs.next()) {
					board = new BoardVO();
					board.setB_no(rs.getInt("B_NO"));
					board.setTitle(rs.getString("TITLE"));
					board.setCont(rs.getString("WRITER"));
					board.setWriter(rs.getString("CONT"));
					board.setRegdate(rs.getDate("REGDATE"));
					board.setCnt(rs.getInt("CNT"));
					
				}
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				JDBCUtil.close(stmt, conn, rs);
			}
			return board;
		}
		public List<BoardVO> getBoardList(BoardVO vo) {
			List<BoardVO> boardList = new ArrayList<BoardVO>();
			try {
				conn = JDBCUtil.getConnection();
				stmt = conn.prepareStatement(BOARDLIST);
				
				rs = stmt.executeQuery();
				while(rs.next()) {
					BoardVO board = new BoardVO();
					board.setB_no(rs.getInt("B_NO"));
					board.setTitle(rs.getString("TITLE"));
					board.setCont(rs.getString("WRITER"));
					board.setWriter(rs.getString("CONT"));
					board.setRegdate(rs.getDate("REGDATE"));
					board.setCnt(rs.getInt("CNT"));
					boardList.add(board);
				}
				
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				JDBCUtil.close(stmt, conn, rs);
			}
			return boardList;
}
	}





