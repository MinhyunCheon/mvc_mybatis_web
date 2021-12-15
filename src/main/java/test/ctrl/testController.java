package test.ctrl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * servlet life cycle
 * init - (doGet() | doPost()) - destroy
 */

// 3.0 이상 버전에서만 web.xml 대신 어노테이션으로 선언
@WebServlet("/test")
public class testController extends HttpServlet {
	@Override
	public void init() throws ServletException {
		System.out.println("servlet init");
	}
	
	@Override
	public void destroy() {
		// 코드를 수정해 reload 하는 경우 호출
		System.out.println("servlet destroy");
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	protected void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("servlet sv");
		
//		response.sendRedirect("test.jsp");
		
		RequestDispatcher view = request.getRequestDispatcher("/test.jsp");
		view.forward(request, response);
	}
}
