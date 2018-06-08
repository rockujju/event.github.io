package dao;
import java.sql.*;  
import bean.*;
import java.io.*;

public class logindao {
	
	public boolean validate(loginbean lbobj)
	{
		
		String email,password;
		email=lbobj.getEmail();
		password=lbobj.getPassword();
		
		//PrintWriter out=request.getWriter();
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/events","root","root");
			//Statement st = con.createStatement();
			
			Statement stmt1=con.createStatement();
			Statement stmt2=con.createStatement();
			Statement stmt3=con.createStatement();
			String sql="select * from users where email='"+email+"' and password='"+password+"'" ;
			ResultSet rs=stmt1.executeQuery(sql);
			
			String sql1="select * from participants";
			ResultSet rs1=stmt2.executeQuery(sql1);
			
			String sql2="select * from events";
			ResultSet rs2=stmt3.executeQuery(sql2);
		
			rs1.next();rs2.next();
			
				
			if(rs.next())
			{
				
				lbobj.setName(rs.getString(2));
				lbobj.setAddress(rs1.getString(2));
				lbobj.setMobile(rs1.getString(3));
				lbobj.setEvent_name(rs2.getString(2));
				lbobj.setReg_fee(rs2.getString(4));
				lbobj.setPrize_amount(rs2.getString(5));
				lbobj.setEvent_date(rs2.getString(3));
				
							
				return true;
			}
			else
			{
				return true;
			}
		}
		catch(Exception e)
		{
			
			return false;
		}
	}

	
}
