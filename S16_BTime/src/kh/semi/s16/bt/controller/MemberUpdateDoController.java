package kh.semi.s16.bt.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kh.semi.s16.bt.model.MemberVo;
import kh.semi.s16.bt.service.MemberService;

/**
 * Servlet implementation class MemberUpdateDoController
 */
@WebServlet("/MemberUpdateDoController")
public class MemberUpdateDoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberUpdateDoController() {
        super();
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		MemberService service = new MemberService();
		
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String issub = request.getParameter("issub");
		
		MemberVo m = new MemberVo();
		int result = service.update(m);
		//TODO
	}

}
