package kh.semi.s16.bt.controller;

import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kh.semi.s16.bt.model.ReadingNowVo;
import kh.semi.s16.bt.service.ReadingNowService;

/**
 * Servlet implementation class ReadingNowInsertDoController
 */
@WebServlet("/ReadingNowInsertDoController")
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
		ReadingNowService service = new ReadingNowService();
		ReadingNowVo rn = new ReadingNowVo();
		
		int read_page = Integer.parseInt(request.getParameter("read_page"));
		Date readstr_date = null;
		
		String fmReadstr_date = request.getParameter("readstr_date");
		SimpleDateFormat fm = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
		try {
			readstr_date = (Date) fm.parse(fmReadstr_date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		rn.setRead_page(read_page);
		rn.setReadstr_date(readstr_date);
		
		int result = service.insert(rn);
		//TODO
	}

}
