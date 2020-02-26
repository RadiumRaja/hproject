package com.bsandeep.hproject;

import java.io.IOException;
import java.util.Base64;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreateSession
 */
@WebServlet({ "/CreateSession", "/cs" })
public class CreateSession extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private String getSessionKey(String username, String password) {
		
		String returnStr = null;
		
		returnStr = Base64.getEncoder().encodeToString((username+password).getBytes());
		
		return returnStr;
		
	}
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateSession() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("This servlet only accepts post request").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String username = request.getParameter("uname");
		String password = request.getParameter("pass");
		
		response.getWriter().append("SessionKey:"+getSessionKey(username, password));
		
	}

}
