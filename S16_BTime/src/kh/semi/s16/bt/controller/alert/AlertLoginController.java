package kh.semi.s16.bt.controller.alert;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AlertController
 */
@WebServlet("/alertlogin")
public class AlertLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AlertLoginController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("alert controller!!");
		request.setAttribute("msg", "유효하지 않은 계정입니다.");
		String viewPath = "WEB-INF/view/alert/alert.jsp";
		request.getRequestDispatcher(viewPath).forward(request, response);
	}
}
