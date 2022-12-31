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
import kh.semi.s16.bt.model.service.MemberService;
import kh.semi.s16.bt.model.vo.BookVo;
import kh.semi.s16.bt.model.vo.LoveAddVo;
import kh.semi.s16.bt.model.vo.MemberVo;

/**
 * Servlet implementation class LoveAddMyPageController
 */
@WebServlet("/love")
public class LoveAddMyPageController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoveAddMyPageController() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("loveadd doGet");
		
		String id = (String) request.getSession().getAttribute("id");
		BookService service = new BookService();
		List<BookVo> lalist = service.selectListLove(id);
		request.setAttribute("lovelist", lalist);
		
		String viewPath = "WEB-INF/view/MyPage/love.jsp";
		request.getRequestDispatcher(viewPath).forward(request, response);
	}
}
