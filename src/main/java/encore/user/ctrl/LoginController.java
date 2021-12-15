package encore.user.ctrl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import encore.ctrl.util.Controller;
import encore.ctrl.view.View;
import encore.user.model.vo.UserDTO;
import encore.user.model.vo.UserVO;
import encore.user.service.UserSv;
import encore.user.service.UserSvImpl;

public class LoginController implements Controller {
	private UserSv service = new UserSvImpl();

	@Override
	public View execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		System.out.println("user param id : " + id + " pwd : " + pwd);
		
		// param 값을 dto 객체에 담는다
		UserDTO param = new UserDTO(id, pwd);
		UserVO user = service.loginService(param);
		
		return new View("test.jsp", true);
	}
	
}
