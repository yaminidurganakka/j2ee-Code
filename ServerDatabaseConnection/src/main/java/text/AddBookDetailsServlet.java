package text;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/add")
@SuppressWarnings("serial")
public class AddBookDetailsServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		BookBean bb=new BookBean();
		bb.setCode(req.getParameter("code"));
		bb.setName(req.getParameter("name"));
		bb.setAuthor(req.getParameter("author"));
		bb.setPrice(Float.parseFloat(req.getParameter("price")));
		bb.setQty(Integer.parseInt(req.getParameter("qty")));
		int k=new AddBookDetailsDAO().insert(bb);
		if(k>0) 
		{
			RequestDispatcher rd=req.getRequestDispatcher("AddBook.jsp");
			rd.forward(req, res);
		}
	}

}
