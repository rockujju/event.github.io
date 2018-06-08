import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;  

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession; 
import bean.*;
import dao.*;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public login() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		//sending details to bean
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		loginbean lbobj=new loginbean();
		lbobj.setEmail(email);
		lbobj.setPassword(password);
		
		
	
		
		
		//sending details to dao
		logindao ld=new logindao();
		
		boolean status=ld.validate(lbobj);
		
		  if(status){  
			  String name1,address1,mobile1,eventname1,reg_fee1,prize1,event_date;
			  name1=lbobj.getName();
			  address1=lbobj.getAddress();
			  mobile1=lbobj.getMobile();
			  eventname1=lbobj.getEvent_name();
			  reg_fee1=lbobj.getReg_fee();
			  prize1=lbobj.getPrize_amount();
			  event_date=lbobj.getEvent_date();
		      HttpSession session=request.getSession();  
		      session.setAttribute("name",name1); 
		      session.setAttribute("address",address1);
		      session.setAttribute("mobile",mobile1);
		      session.setAttribute("eventname",eventname1); 
		      session.setAttribute("reg_fee",reg_fee1);
		      session.setAttribute("prize",prize1);
		      session.setAttribute("eventdate",event_date);
		      response.sendRedirect("index_dashboard.jsp");
		        //out.print("else ");
		       //out.print(name1);
		        
		        
		        }  
		        else { 
		        	
		        	//response.sendRedirect("index.jsp"); 
		        	out.print("else 1");
		        }  
		
		
		
	}


		// TODO Auto-generated method stub
		
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
