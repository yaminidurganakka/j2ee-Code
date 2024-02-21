package text;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@SuppressWarnings("serial")
@WebServlet("/v")
public class BookDetailsByCodeServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
	{
		String code=req.getParameter("code");
		ArrayList<BookBean> retrieve = new BookDetailsByCode().retrieve(code);
		req.setAttribute("list", retrieve);
		RequestDispatcher rd=req.getRequestDispatcher("BookCode.jsp");
		rd.forward(req, res);
		
		
	}

}
