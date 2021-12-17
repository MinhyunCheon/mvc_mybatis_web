package encore.user.service;

import java.util.List;

import encore.user.model.sql.UserDao;
import encore.user.model.sql.UserDaoImpl;
import encore.user.model.vo.UserDTO;
import encore.user.model.vo.UserVO;

public class UserSvImpl implements UserSv {
	private UserDao dao;
	
	public UserSvImpl() {
		dao = new UserDaoImpl();
	}

	@Override
	public Object loginService(Object obj) {
		System.out.println("user service login");
		return dao.loginRow(obj);
	}

	@Override
	public int joinService(Object obj) {
		System.out.println("user service join");
		return dao.joinRow(obj);
	}

}
