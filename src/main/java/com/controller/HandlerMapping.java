package com.controller;

import java.util.HashMap;
import java.util.Map;

import com.spring.controller.DeleteBoardController;
import com.spring.controller.GetBoardController;
import com.spring.controller.GetBoardListController;
import com.spring.controller.InsertBoardController;
import com.spring.controller.LoginController;
import com.spring.controller.LogoutController;
import com.spring.controller.UpdateBoardController;

public class HandlerMapping {
	

	private Map<String, Controller> mappings;
	
	public  HandlerMapping() {
		mappings = new HashMap<String, Controller>();
		mappings.put("/login.do", 			new LoginController());
		mappings.put("/logout.do", 			new LogoutController());
		mappings.put("/getBoard.do", 		new GetBoardController());
		mappings.put("/getBoardList.do", 	new GetBoardListController());
		mappings.put("/insertBoard.do", 	new InsertBoardController());
		mappings.put("/deleteBoard.do", 	new DeleteBoardController());
		mappings.put("/updateBoard.do", 	new UpdateBoardController());
		
		
	}
	
	
	
	public Controller getController(String path) {
		return mappings.get(path);
	}

}
