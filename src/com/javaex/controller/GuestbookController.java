package com.javaex.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javaex.dao.GuestbookDao;
import com.javaex.vo.GuestbookVo;


@WebServlet("/gbc")
public class GuestbookController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//System.out.println("PhonebookController"); //콘솔에서 실행되는 거 확인 가능
		
		//입력한 파라미터에 따라 꺼내줘야 함 
		String act = request.getParameter("action");
		
		//test
		System.out.println(act);
		
		if("addList".equals(act)) {
			
			System.out.println("action=addList");
			
			List<GuestbookVo> gbList = new GuestbookDao().getList();
			
			request.setAttribute("gList", gbList );
			
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/addList.jsp");
				
		}else if("deleteForm".equals(act)) {
			System.out.println("action=deleteForm");
			System.out.println("게스트 삭제 폼");
			
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/deleteForm.jsp");
			rd.forward(request, response);
		
		}else if("add".equals(act)) {
			System.out.println("action=add");
			
			
		}
		
		
		
		
		
		
		
		
	}

	
	
	
	
	
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
