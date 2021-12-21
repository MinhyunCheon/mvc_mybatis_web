package encore.factory;

import java.util.HashMap;
import java.util.Map;

import encore.bbs.ctrl.PostController;
import encore.bbs.ctrl.ReadController;
import encore.bbs.ctrl.DeleteBbsController;
import encore.bbs.ctrl.InsertPostController;
import encore.bbs.ctrl.SelectBbsController;
import encore.bbs.ctrl.UpdateBbsController;
import encore.bbs.ctrl.UpdateController;
import encore.ctrl.util.Controller;
import encore.intro.ctrl.IndexController;
import encore.user.ctrl.JoinController;
import encore.user.ctrl.LoginController;
import encore.user.ctrl.LogoutController;
import encore.user.ctrl.RegisterController;

public class BeanFactory {
	private static BeanFactory instance;
	private Map<String, Controller> map;
	
	private BeanFactory() {
		map = new HashMap<>();
		map.put("/index.encore", new IndexController());
		map.put("/login.encore", new LoginController());
		map.put("/logout.encore", new LogoutController());
		map.put("/registerForm.encore", new RegisterController());
		map.put("/join.encore", new JoinController());
		map.put("/bbs/list.encore", new SelectBbsController());
		map.put("/bbs/post.encore", new PostController());
		map.put("/bbs/postInsert.encore", new InsertPostController());
		map.put("/bbs/read.encore", new ReadController());
		map.put("/bbs/update.encore", new UpdateController());
		map.put("/bbs/updateBbs.encore", new UpdateBbsController());
		map.put("/bbs/deleteBbs.encore", new DeleteBbsController());
	}
	
	public synchronized static BeanFactory getInstence() {
		if(instance == null) instance = new BeanFactory();
		return instance;
	}
	
	public Controller GetBean(String uri) {
		return map.get(uri);
	}
}
