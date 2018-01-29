import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class Users extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Users() {
        super();

    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		ServletContext ctx=getServletContext();
		int a=(Integer)ctx.getAttribute("total");
		int b=(Integer)ctx.getAttribute("count");
		out.print("The user are:"+a);
		out.print("The count is:"+b);
		
		
	}

}
