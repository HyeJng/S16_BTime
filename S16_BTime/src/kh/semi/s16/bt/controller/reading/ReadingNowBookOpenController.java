package kh.semi.s16.bt.controller.reading;

import java.io.IOException;
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
 * Servlet implementation class ReadingNowInsertController
 */
@WebServlet("/reading")
public class ReadingNowBookOpenController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReadingNowBookOpenController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("reading doGet");
		
		String id = (String) request.getSession().getAttribute("id");
		String isbn = request.getParameter("isbn");
		ReadingNowService rservice = new ReadingNowService();
		ReadingNowVo rn = rservice.selectOne(id, isbn);
		request.setAttribute("readingInfo", rn);
		
		BookService bservice = new BookService();
		BookVo b = bservice.selectOne(isbn);
		request.setAttribute("bookRead", b);
		
		String viewPath = "WEB-INF/view/reading.jsp";
		request.getRequestDispatcher(viewPath).forward(request, response);
	}

}
