package text;
import java.io.IOException;
import java.sql.*;
import java.util.*;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@SuppressWarnings("serial")
@WebServlet("/view")
public class ViewAllBookDetails extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		   
				ArrayList<BookBean> retrieve = new ViewAllBookDetailsDAO().retrieve();
				req.setAttribute("list", retrieve);
				RequestDispatcher rd=req.getRequestDispatcher("ViewBook.jsp");
				rd.forward(req, res);
	}
	
}
