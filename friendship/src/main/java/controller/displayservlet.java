package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/display")
public class displayservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public displayservlet() {
        super();
      
    }

	
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String username1=request.getParameter("username1");
		
		System.out.println(username);
		System.out.println(username1);
		
		request.setAttribute("name",username);
		request.setAttribute("name1",username1);
		float i=findSumMethod(username,username1);
		request.setAttribute("sum",(int)i);
		RequestDispatcher rd= this.getServletContext().getRequestDispatcher("/index.jsp");
		rd.forward(request, response);
	}
	
	public static float findSumMethod(String a,String b)
	{
		String str = a + b;


		
		int ans = 0,answer=0;
		str = str.toUpperCase();

		String str1="friendship";
		str1 = str1.toUpperCase();
		for(int i=0;i<str1.length();i++) {
			answer=alphabetToNumber(str1.charAt(i));
		}
		for (int i = 0; i < str.length(); i++) {
		ans = ans + alphabetToNumber(str.charAt(i));
		}
		
		return (float)ans/(ans+(answer))*100;
	}
	
		static int alphabetToNumber(char a) {
		return a-64;
		}
}