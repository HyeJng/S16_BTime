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
 * Servlet implementation class BookInsertDoController
 */
@WebServlet("/BookInsertDoController")
public class BookInsertDoController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public BookInsertDoController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
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

		BookVo b = new BookVo();
		b.setIsbn(isbn);
		b.setThum_img(thum_img);
		b.setBook_name(book_name);
		b.setAuthor(author);
		b.setPublisher(publisher);
		b.setCategory(category);
		b.setBook_intro(book_intro);
		b.setAuth_intro(auth_intro);
		b.setPub_intro(pub_intro);
		b.setBook_page(book_page);
		b.setTotal_grade(total_grade);
		b.setGrade_peo(grade_peo);
		
		int result = service.insert(b);
		if(result > 0) {
			response.sendRedirect(request.getContextPath()+"/main");
		}else {
			//TODO
		}
	}
}
