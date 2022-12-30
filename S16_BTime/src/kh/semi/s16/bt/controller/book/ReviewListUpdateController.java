package kh.semi.s16.bt.controller.book;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kh.semi.s16.bt.model.service.ReviewService;
import kh.semi.s16.bt.model.vo.ReviewVo;

/**
 * Servlet implementation class ReviewListUpdateController
 */
@WebServlet("/reviewlist.update")
public class ReviewListUpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReviewListUpdateController() {
        super();
    }
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ReviewService service = new ReviewService();
		String isbn = request.getParameter("isbn");
		List<ReviewVo> rlist = service.selectList(isbn);
		request.setAttribute("reviewlist", rlist);
		
		String viewPage = request.getContextPath()+"/detail?isbn=" +isbn;
		request.getRequestDispatcher(viewPage).forward(request, response);
	}

}
