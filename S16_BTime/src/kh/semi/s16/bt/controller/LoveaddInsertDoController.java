package kh.semi.s16.bt.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kh.semi.s16.bt.model.LoveAddVo;
import kh.semi.s16.bt.service.LoveAddService;

/**
 * Servlet implementation class LoveaddInsertDoController
 */
@WebServlet("/LoveaddInsertDoController")
public class LoveaddInsertDoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoveaddInsertDoController() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LoveAddService service = new LoveAddService();
		String id = request.getParameter("id");
		String isbn = request.getParameter("isbn");
		int result = service.insert(id, isbn);
		
		if(result > 0) {
			
		}else {
			
		}
	}

}
