

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Types;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ProcedureCalling")
public class ProcedureCalling extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int product_id=Integer.parseInt(request.getParameter("txtpid"));
		
		try {
			//Call Connection Method
				Connection con=DatabaseConnection.getMyConnection();
			//Write sql command
				CallableStatement stmt=con.prepareCall("{call getRecord2(?,?,?)}");
			    
			    
			    stmt.setInt(1,product_id);
			    stmt.registerOutParameter(2, Types.VARCHAR);
			    stmt.registerOutParameter(3, Types.INTEGER);
			    stmt.execute();
			     
				
			    PrintWriter out=response.getWriter();
			    out.println("<table border=2>");
				out.println("<tr><th>Product_id</th><th>Product_Name</th><th>Product_Price</th></tr>");
				out.println("<tr>");
				out.print("<td>"+product_id+"</td>");
				out.print("<td>"+stmt.getString(2)+"</td>");
				out.print("<td>"+stmt.getInt(3)+"</td>");
				out.println("</tr>");
			
			out.println("</table>");
					
					
				con.close();
			
			}catch(Exception e) {
				e.printStackTrace();
			}
	}

	
}
/*delimiter $$
create  procedure getRecord2(in p_rollno int,out p_name  varchar(20), out p_marks int)
begin
     select product_name, product_price into p_name,p_marks from product_details where product_id=p_rollno;
end$$
delimiter ;
call getRecord2(2,@p_name, @p_marks);
select @p_name, @p_marks;
*/
