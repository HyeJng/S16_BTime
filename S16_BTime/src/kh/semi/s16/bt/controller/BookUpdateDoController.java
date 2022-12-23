package kh.semi.s16.bt.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kh.semi.s16.bt.model.BookVo;
import kh.semi.s16.bt.service.BookService;

/**
 * Servlet implementation class BookUpdateDoController
 */
@WebServlet("/BookUpdateDoController")
public class BookUpdateDoController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public BookUpdateDoController() {
		super();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		BookVo vo = (BookVo) session.getAttribute("BookVo");

		BookService service = new BookService();

		String isbn = request.getParameter("isbn");
		String thum_img = request.getParameter("thum_img");
		String book_name = request.getParameter("book_name");
		String author = request.getParameter("author");
		String publisher = request.getParameter("publisher");
		String category = request.getParameter("category");
		String book_intro = request.getParameter("book_intro");
		String auth_intro = request.getParameter("auth_intro");
		String pub_intro = request.getParameter("pub_intro");
		int book_page = Integer.parseInt(request.getParameter("book_page"));
		double total_grade = Double.parseDouble(request.getParameter("total_grade"));
		int grade_peo = Integer.parseInt(request.getParameter("grade_peo"));
		
		//TODO
	}

}
