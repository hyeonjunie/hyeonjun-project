package com.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAO.BoardDAO;
import com.VO.BoardVO;
import com.controller.Controller;

public class GetBoardController implements Controller{
	@Override
	public String handlerRequest(HttpServletRequest request, HttpServletResponse response) {
	    System.out.println("글 상세 보기 처리");
        // 1. 검색할 게시글 번호 추출
        String b_no = request.getParameter("b_no");

        // 2. DB 연동 처리
        BoardVO vo = new BoardVO();
        vo.setB_no(Integer.parseInt(b_no));
        BoardDAO boardDAO = new BoardDAO();
        BoardVO board = boardDAO.getBoard(vo);

        
        // 3. 응답 화면 구성
              
        HttpSession session = request.getSession();
        session.setAttribute("board", board);
        
        
        return "getBoard.jsp";
	}

}
