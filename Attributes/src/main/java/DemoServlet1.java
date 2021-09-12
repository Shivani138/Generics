import java.io.*;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;  
public class DemoServlet1 extends HttpServlet{  
public void doGet(HttpServletRequest req,HttpServletResponse res)  
{  
try{  
  
res.setContentType("text/html");  
PrintWriter out=res.getWriter();  
  
ServletContext context=getServletContext();  
context.setAttribute("company","IBM");  
  
out.println("Welcome to first servlet");  
out.println("<a href='servlet2'>visit</a>");  
out.close();  
  
}catch(Exception e){PrintWriter out = null;
out.println(e);}  
  
}}  