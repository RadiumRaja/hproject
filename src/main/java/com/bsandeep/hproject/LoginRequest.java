package com.bsandeep.hproject;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginRequest
 */
@WebServlet({ "/LoginRequest", "/lr" })
public class LoginRequest extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginRequest() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String oReturnStr = null;
//		JSONObject oReturnStr = new JSONObject();
		
		String oSessionKey = request.getParameter("key");
		
		if(oSessionKey.equals("MTIzNDU2")) {
			oReturnStr = "{\"status\":1,";
			oReturnStr += "\"userId\":1}";
//			oReturnStr = oReturnStr.append("status","1");
//			oReturnStr = oReturnStr.append("userId","1"); 
		} else {
//			oReturnStr = oReturnStr.append("status","0");
			oReturnStr = "{\"status\":0,";
			oReturnStr += "\"userId\":0}";
		}
		
		response.getWriter().append(""+oReturnStr);
	}
}
