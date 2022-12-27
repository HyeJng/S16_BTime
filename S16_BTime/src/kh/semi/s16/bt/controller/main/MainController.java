package kh.semi.s16.bt.controller.main;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kh.semi.s16.bt.model.service.BookService;
import kh.semi.s16.bt.model.vo.BookVo;

/**
 * Servlet implementation class MainController
 */
@WebServlet("/main")
public class MainController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainController() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BookService service = new BookService();
		System.out.println("service.selectList()");
		
//		List<BookVo> volist = service.selectList();
//		request.setAttribute("booklist", volist);
		
		int max = 5;
		List<BookVo> volistBest = service.selectListBest(max);
		request.setAttribute("bestlist", volistBest);
		List<BookVo> volistEssay = service.selectListEssay(max);
		request.setAttribute("bookessay", volistEssay);
		System.out.println("setAtrribute()");
		
		String viewPage = "WEB-INF/view/index.jsp";
		request.getRequestDispatcher(viewPage).forward(request, response);
	}

}
