package com.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.controller.Controller;

public class LogoutController implements Controller{
	@Override
	public String handlerRequest(HttpServletRequest request, HttpServletResponse response) {
	     System.out.println("로그아웃 처리");
         HttpSession session = request.getSession();
         // 1. 브라우저와 연결된 세션 객체를 강제 종료한다.
         session.invalidate();
         // 2. 세션 종료 후, 메인 화면으로 이동한다.
       return  "login.jsp";
	}
}
