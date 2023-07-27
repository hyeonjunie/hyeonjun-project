package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class DispatcherServlet extends HttpServlet {

	  private static final long serialVersionUID = 1L;
	  
	    public DispatcherServlet() {
	       System.out.println("-------DispatcherServlet 객체생성");
	      
	       
	    }

	   
	   protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      // TODO Auto-generated method stub
	      System.out.println("service() 실행");
	      request.setCharacterEncoding("EUC-KR");
	      
	      String uri = request.getRequestURI();
	      String path = uri.substring(uri.lastIndexOf("/"));
	      System.out.println(path);
	      
	      
	      //2. 추출된 path에 따른 Controller 를 검색한다.
	      HandlerMapping mapper = new HandlerMapping();
	      Controller ctrl = mapper.getController(path);
	      
	      
	      //3.검색한 Controller를 실행한다.
	      String viewPage = ctrl.handlerRequest(request, response);
	      
	      //4.Controller기 리턴한 화면으로 이동한다.
	      response.sendRedirect(viewPage);
	      
	      
	   }
	      

}
