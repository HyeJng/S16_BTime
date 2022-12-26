package kh.semi.s16.bt.controller.reading;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kh.semi.s16.bt.model.service.ReadingNowService;

/**
 * Servlet implementation class ReadingNowDeleteDoController
 */
@WebServlet("/readingnowdelete.do")
public class ReadingNowDeleteDoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReadingNowDeleteDoController() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("readingnow delete do controller");
		
		ReadingNowService service = new ReadingNowService();
		String id = request.getParameter("id");
		String isbn = request.getParameter("isbn");
		int result = service.delete(id, isbn);
		
		if(result > 0) {
			String viewPage = "/WEB-INF/view/MyPage/readingnow.jsp";
			response.sendRedirect(viewPage);
		}else {
			//TODO
		}
	}

}
