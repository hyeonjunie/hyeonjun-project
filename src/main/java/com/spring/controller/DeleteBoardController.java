package com.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAO.BoardDAO;
import com.VO.BoardVO;
import com.controller.Controller;

public class DeleteBoardController implements Controller {
	
	@Override
	public String handlerRequest(HttpServletRequest request, HttpServletResponse response) {
	       System.out.println("글 삭제 기능 처리");
	         
	         // 1. 사용자 입력 정보 추출
	         String b_no = request.getParameter("b_no");

	         // 2. DB 연동 처리
	         BoardVO vo = new BoardVO();
	         vo.setB_no(Integer.parseInt(b_no));
	         BoardDAO boardDAO = new BoardDAO();
	         boardDAO.deleteBoard(vo);

	         // 3. 화면 네비게이션
	         return "getBoardList.do";
	}
}
