package com.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAO.BoardDAO;
import com.VO.BoardVO;
import com.controller.Controller;

public class UpdateBoardController implements Controller {
	
	@Override
	public String handlerRequest(HttpServletRequest request, HttpServletResponse response) {
	       
        // 1. 사용자 입력 정보 추출
        
        String title = request.getParameter("title");
        String cont = request.getParameter("cont");
        String b_no = request.getParameter("b_no");
        if(b_no == null) {
        	b_no= "0";
        }
        

        // 2. DB 연동 처리
        BoardVO vo = new BoardVO();
        vo.setTitle(title);
        vo.setCont(cont);
        vo.setB_no(Integer.parseInt(b_no));
        BoardDAO boardDAO = new BoardDAO();
        boardDAO.updateBoard(vo);

        // 3. 화면 네비게이션
        return "getBoardList.do";
	}


}
