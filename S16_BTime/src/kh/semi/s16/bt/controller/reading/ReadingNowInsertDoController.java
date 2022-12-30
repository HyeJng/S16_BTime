package kh.semi.s16.bt.controller.reading;

import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kh.semi.s16.bt.model.service.ReadingNowService;
import kh.semi.s16.bt.model.vo.ReadingNowVo;

/**
 * Servlet implementation class ReadingNowInsertDoController
 */
@WebServlet("/reading.do")
public class ReadingNowInsertDoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReadingNowInsertDoController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		System.out.println("reading insert do controller");
		
		ReadingNowService service = new ReadingNowService();
		ReadingNowVo rn = new ReadingNowVo();
		
		String id = (String) request.getSession().getAttribute("id");
		String isbn = request.getParameter("isbn");
		int read_page = Integer.parseInt(request.getParameter("read_page"));
		
		rn.setId(id);
		rn.setIsbn(isbn);
		rn.setRead_page(read_page);
		
		int result = service.insert(rn);
		
		
	}

}
