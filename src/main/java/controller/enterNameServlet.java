package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.usersName;


@WebServlet("/enterNameServlet")
public class enterNameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public enterNameServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		
		
		usersName userNM = new usersName(firstName, lastName);
		
		
		
	
		
		PrintWriter writer = response.getWriter();
		writer.println(userNM.toString());
		
		 
		writer.close();
	}

}
