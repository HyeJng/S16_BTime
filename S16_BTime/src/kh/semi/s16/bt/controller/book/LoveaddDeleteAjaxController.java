package kh.semi.s16.bt.controller.book;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kh.semi.s16.bt.model.service.LoveAddService;

/**
 * Servlet implementation class LoveaddDeleteDoController
 */
@WebServlet("/lovedelete.ajax")
public class LoveaddDeleteAjaxController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoveaddDeleteAjaxController() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("love add delete do controller");
		
		LoveAddService service = new LoveAddService();
		String id = request.getParameter("id");
		String isbn = request.getParameter("isbn");
		int result = service.delete(id, isbn);
		if(result > 0) {
			String viewPage = "/WEB-INF/view/detail";
			response.sendRedirect(viewPage);
		}else {
			//TODO
		}
	}

}
