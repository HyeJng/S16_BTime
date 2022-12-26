package kh.semi.s16.bt.controller.book;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kh.semi.s16.bt.model.service.LoveAddService;

/**
 * Servlet implementation class LoveaddInsertDoController
 */
@WebServlet("/loveadd.ajax")
public class LoveaddInsertAjaxController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoveaddInsertAjaxController() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("love add insert do controller");
		
		LoveAddService service = new LoveAddService();
		String id = request.getParameter("id");
		String isbn = request.getParameter("isbn");
		int result = service.insert(id, isbn);
		
		if(result > 0) {
			String viewPage = "/WEB-INF/view/detail";
			response.sendRedirect(viewPage);
		}else {
			//TODO
		}
	}

}
