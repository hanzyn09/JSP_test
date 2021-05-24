package com.the.service;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.the.dao.BoardDao;
import com.the.domain.dto.BoardDto;

public class BoardSeviceImpl implements BoardService {
	BoardDao boardDao = new BoardDao();
	
	@Override
	public String getList(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		List<BoardDto> result = boardDao.getList();
		
		request.setAttribute("list", result);
		return "/WEB-INF/views/board/list.jsp";
	}

}
