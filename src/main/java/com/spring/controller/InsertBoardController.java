package com.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAO.BoardDAO;
import com.VO.BoardVO;
import com.controller.Controller;


public class InsertBoardController implements Controller {
	@Override
	public String handlerRequest(HttpServletRequest request, HttpServletResponse response) {
	    System.out.println("글 삽입 기능 처리");
        // 1. 사용자 입력 정보 추출
     
        String title = request.getParameter("title");
        String writer = request.getParameter("writer");
        String cont = request.getParameter("cont");
        
        // 2. DB 연동 처리
        BoardVO vo = new BoardVO();
        vo.setTitle(title);
        vo.setWriter(writer);
        vo.setCont(cont);
        BoardDAO boardDAO = new BoardDAO();
        boardDAO.insertBoard(vo);
        
        // 3. 화면 네비게이션
       return "getBoardList.do";
	
	}


}
