package kh.semi.s16.bt.controller.book;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kh.semi.s16.bt.model.service.BookService;
import kh.semi.s16.bt.model.vo.BookVo;

/**
 * Servlet implementation class DetailController
 */
@WebServlet("/detail")
public class BookDetailController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookDetailController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BookService service = new BookService();
		String isbn = request.getParameter("isbn");
		BookVo vo = service.selectOne(isbn);
		String viewPage = "/WEB-INF/view/detail.jsp";
		request.getRequestDispatcher(viewPage).forward(request, response);
	}
}
