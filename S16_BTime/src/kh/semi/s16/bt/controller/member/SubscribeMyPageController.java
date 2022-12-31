package kh.semi.s16.bt.controller.member;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kh.semi.s16.bt.model.service.MemberService;
import kh.semi.s16.bt.model.vo.MemberVo;


/**
 * Servlet implementation class SubscribeMyPageController
 */
@WebServlet("/subscribeinfo")
public class SubscribeMyPageController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SubscribeMyPageController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("subInfo mypage controller");
		
		String id = (String) request.getSession().getAttribute("id");
		MemberService service = new MemberService();
		MemberVo m = service.selectOne(id);
		request.setAttribute("subinfo", m);
		
		String viewPath = "WEB-INF/view/MyPage/subscribeinfo.jsp";
		request.getRequestDispatcher(viewPath).forward(request, response);
	}
}
