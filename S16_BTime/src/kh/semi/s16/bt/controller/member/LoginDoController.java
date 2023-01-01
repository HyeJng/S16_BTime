package kh.semi.s16.bt.controller.member;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kh.semi.s16.bt.model.service.MemberService;
import kh.semi.s16.bt.model.vo.MemberVo;

/**
 * Servlet implementation class LoginDoController
 */
@WebServlet("/login.do")
public class LoginDoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginDoController() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("login.do doPost");
		response.setContentType("application/json;charset=UTF-8");
		MemberService service = new MemberService();
		
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		MemberVo m = service.login(id, pwd);
		if(m != null) {
			HttpSession session = request.getSession();
			session.setAttribute("loginInfo", m);
			session.setAttribute("id", id);
			System.out.println(id);
			response.sendRedirect(request.getContextPath() + "/main");
		}else {
			response.sendRedirect(request.getContextPath() + "/alertlogin");
		}
	}

}
