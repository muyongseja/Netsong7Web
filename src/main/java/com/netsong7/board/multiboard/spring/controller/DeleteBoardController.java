package com.netsong7.board.multiboard.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.netsong7.board.multiboard.spring.service.Service;

@Component
@Controller
public class DeleteBoardController {
	@Autowired
	private Service service;
	
	@RequestMapping("/deleteBoard.spr")
	public String pageHandler(@RequestParam("board_num") int board_num){
		service.removeBoard(board_num);
		return "createBoard";
	}
}
