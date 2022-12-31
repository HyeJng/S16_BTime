package kh.semi.s16.bt.controller.reading;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kh.semi.s16.bt.model.service.BookService;
import kh.semi.s16.bt.model.service.ReadingNowService;
import kh.semi.s16.bt.model.vo.BookVo;
import kh.semi.s16.bt.model.vo.ReadingNowVo;

/**
 * Servlet implementation class ReadingNowMyPageController
 */
@WebServlet("/readingnow")
public class ReadingNowMyPageController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReadingNowMyPageController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("readingnow mypage controller");
		String id = (String) request.getSession().getAttribute("id");
		
		BookService bservice = new BookService();
		List<BookVo> blist = bservice.selectListBook(id);
		request.setAttribute("brnlist", blist);
		
		ReadingNowService rnservice = new ReadingNowService();
		List<ReadingNowVo> rnlist = rnservice.selectListBook(id);
		request.setAttribute("rnlist", rnlist);
		
		String viewPath = "WEB-INF/view/MyPage/readingnow.jsp";
		request.getRequestDispatcher(viewPath).forward(request, response);
	}
}
