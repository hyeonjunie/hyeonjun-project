package com.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAO.UserDAO;
import com.VO.UserVO;
import com.controller.Controller;

public class LoginController implements Controller{

	@Override
	
	public String handlerRequest(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("로그인 처리");
         
         // 1. 사용자 입력 정보 추출
         String userid = request.getParameter("userid");
         String userpassword = request.getParameter("userpassword");
         
         // 2. DB 연동 처리
         UserVO vo = new UserVO();
         vo.setUserid(userid);
         vo.setUserpassword(userpassword);
         UserDAO userDAO = new UserDAO();
         UserVO user = userDAO.getUser(vo);
         
         // 3. 화면 네비게이션
         if (user != null) {
            return "getBoardList.do";
         } else {
            return "login.jsp";
         }
	}

	
	}
	
	


