package kh.semi.s16.bt.controller.book;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kh.semi.s16.bt.model.service.BookService;
import kh.semi.s16.bt.model.service.LoveAddService;
import kh.semi.s16.bt.model.service.ReviewService;
import kh.semi.s16.bt.model.vo.BookVo;
import kh.semi.s16.bt.model.vo.LoveAddVo;
import kh.semi.s16.bt.model.vo.ReviewVo;

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
		System.out.println("detail controller!!");
		String id = (String)(request.getSession().getAttribute("id"));
		if(id == null) {
			response.sendRedirect(request.getContextPath()+"/login");
			return;
		}
		//String id = request.getParameter("id");
		String isbn = request.getParameter("isbn");
		System.out.println(id); //null
		System.out.println(isbn);
		
		BookService bservice = new BookService();
		BookVo b = bservice.selectOne(isbn);
		request.setAttribute("bookdetail", b);
		
		LoveAddService laservice = new LoveAddService();
		LoveAddVo lavo = laservice.selectOne(id, isbn);
		request.setAttribute("addChk", lavo);
		System.out.println(lavo);
		
		ReviewService rservice = new ReviewService();
		List<ReviewVo> rlist = rservice.selectList(isbn);
		request.setAttribute("reviewlist", rlist);
		
		String viewPage = "/WEB-INF/view/detail.jsp";
		request.getRequestDispatcher(viewPage).forward(request, response);
	}
}
