package encore.user.ctrl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import encore.ctrl.util.Controller;
import encore.ctrl.view.View;
import encore.user.model.vo.UserVO;
import encore.user.service.UserSv;
import encore.user.service.UserSvImpl;

public class JoinController implements Controller {
	private UserSv service = new UserSvImpl();

	@Override
	public View execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Join Controller");
		
		UserVO user = new UserVO(request.getParameter("id")
				, request.getParameter("pwd")
				, request.getParameter("name")
				, Integer.parseInt(request.getParameter("point")));
		
		int num = service.joinService(user);
		View view = new View();
		
		if(num == 1) {
			view.setPath("index.jsp");
			view.setSend(false);
		}
		
		else {
			view.setPath("registerForm.encore");
			view.setSend(false);
		}
		
		return view;
	}

}
