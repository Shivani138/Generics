import java.io.*;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;  

public class DemoServlet2 extends HttpServlet{  
public void doGet(HttpServletRequest req,HttpServletResponse res)  
{  
try{  
  
res.setContentType("text/html");  
PrintWriter out=res.getWriter();  
  
ServletContext context=getServletContext();  
String n=(String)context.getAttribute("company");  
  
out.println("Welcome to "+n);  
out.close();  
  
}catch(Exception e){PrintWriter out = null;
out.println(e);}  
}}  