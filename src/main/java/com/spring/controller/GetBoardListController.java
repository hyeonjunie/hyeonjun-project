package com.spring.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAO.BoardDAO;
import com.VO.BoardVO;
import com.controller.Controller;

public class GetBoardListController implements Controller{
	@Override
	public String handlerRequest(HttpServletRequest request, HttpServletResponse response) {
		  System.out.println("글 목록보기 기능 처리");
	         
	         // 1. 사용자 입력 정보 추출(검색 기능은 나중에 구현)
	         // 2. DB 연동 처리
	         BoardVO vo = new BoardVO();
	         BoardDAO boardDAO = new BoardDAO();
	         List<BoardVO> boardList = boardDAO.getBoardList(vo);
	         
	         // 3. 응답 화면 구성
	         HttpSession session = request.getSession();
	         session.setAttribute("boardList", boardList);
	         return "getBoardList.jsp";
	
	}
}
