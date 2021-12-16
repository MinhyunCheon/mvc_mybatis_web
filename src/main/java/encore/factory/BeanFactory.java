package encore.factory;

import java.util.HashMap;
import java.util.Map;

import encore.ctrl.util.Controller;
import encore.intro.ctrl.IndexController;
import encore.user.ctrl.LoginController;
import encore.user.ctrl.LogoutController;

public class BeanFactory {
	private static BeanFactory instance;
	private Map<String, Controller> map;
	
	private BeanFactory() {
		map = new HashMap<>();
		map.put("/index.encore", new IndexController());
		map.put("/login.encore", new LoginController());
		map.put("/logout.encore", new LogoutController());
	}
	
	public synchronized static BeanFactory getInstence() {
		if(instance == null) instance = new BeanFactory();
		return instance;
	}
	
	public Controller GetBean(String uri) {
		return map.get(uri);
	}
}
