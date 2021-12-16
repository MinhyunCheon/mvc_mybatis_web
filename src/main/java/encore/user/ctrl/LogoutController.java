package encore.user.ctrl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import encore.ctrl.util.Controller;
import encore.ctrl.view.View;

public class LogoutController implements Controller {

	@Override
	public View execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Logout Controller execute");
		HttpSession session = request.getSession(false); // 기존 세션을 가져옴
		session.invalidate();
		
		return new View("index.jsp", false);
	}

}
