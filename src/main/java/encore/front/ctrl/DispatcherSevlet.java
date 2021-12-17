package encore.front.ctrl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import encore.ctrl.util.Controller;
import encore.ctrl.view.View;
import encore.factory.BeanFactory;

@WebServlet("*.encore")
public class DispatcherSevlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	protected void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("front controller");
		String uri = request.getRequestURI();
		System.out.println("client request : " + uri);
		
		// Factory를 통한 Controller와 관계 형성 및 화면 분기
		BeanFactory factory = BeanFactory.getInstence();
		Controller ctrl = factory.GetBean(uri);
		View view = ctrl.execute(request, response);
		
		
		
		if(view.isSend()) {
			RequestDispatcher rd = request.getRequestDispatcher(view.getPath());
			rd.forward(request, response);
		}
		
		else {
			response.sendRedirect(view.getPath());
		}
	}

}
