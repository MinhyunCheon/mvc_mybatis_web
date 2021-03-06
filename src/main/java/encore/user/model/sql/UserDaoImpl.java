package encore.user.model.sql;

import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class UserDaoImpl implements UserDao {
	private static SqlSessionFactory factory;
	SqlSession session;
	
	static {
		System.out.println("------------------- mybatis loading --------------------"); 
		try{
			factory = new SqlSessionFactoryBuilder().build(
		Resources.getResourceAsReader("resource/config/configuration.xml"));
		}catch(Exception e) {
			e.printStackTrace() ;
		}
	}
	
	public UserDaoImpl() {
		session = factory.openSession(true);
		System.out.println("dao session " + session);
	}

	@Override
	public Object loginRow(Object obj) {
		System.out.println("UserDaoImpl loginRow");
		
		return session.selectOne("encore.user.loginRow", obj);
	}

	@Override
	public int joinRow(Object obj) {
		System.out.println("UserDaoImpl joinRow");
		System.out.println(obj);
		return session.insert("encore.user.joinRow", obj);
//		return 0;
	}

}
