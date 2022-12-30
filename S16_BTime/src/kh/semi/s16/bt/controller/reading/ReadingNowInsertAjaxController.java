package kh.semi.s16.bt.controller.reading;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kh.semi.s16.bt.model.service.ReadingNowService;
import kh.semi.s16.bt.model.vo.ReadingNowVo;

/**
 * Servlet implementation class ReadingNowInsertAjaxController
 */
@WebServlet("/readingnow.ajax")
public class ReadingNowInsertAjaxController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ReadingNowInsertAjaxController() {
		super();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("reading insert ajax controller");

		ReadingNowService service = new ReadingNowService();
		ReadingNowVo rn = new ReadingNowVo();
		String id = (String) request.getSession().getAttribute("id");
		String isbn = request.getParameter("isbn");

		rn.setId(id);
		rn.setIsbn(isbn);

		int result = service.insert(rn);
		System.out.println(result);
	}

}
