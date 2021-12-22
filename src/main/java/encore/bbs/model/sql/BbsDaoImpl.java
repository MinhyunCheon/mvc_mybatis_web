package encore.bbs.model.sql;

import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class BbsDaoImpl implements BbsDao {
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
	
	public BbsDaoImpl() {
		session = factory.openSession(true);
		System.out.println("dao session " + session);
	}

	@Override
	public List<Object> selectBbsAll() {
		System.out.println("BbsDaoImpl Select Bbs All");
		return session.selectList("encore.bbs.selectListAll");
	}

	@Override
	public int insertBbs(Object obj) {
		System.out.println("BbsDaoImpl Insert Bbs");
		return session.insert("encore.bbs.insertBbs", obj);
	}

	@Override
	public Object selectBbs(Object obj) {
		System.out.println("BbsDaoImpl Select Bbs");
		return session.selectOne("encore.bbs.selectBbs", obj);
	}

	@Override
	public int updateViewCnt(Object obj) {
		return session.update("encore.bbs.updateViewCnt", obj);
	}

	@Override
	public int updateBbs(Object obj) {
		return session.update("encore.bbs.updateBbs", obj);
	}

	@Override
	public int deleteBbs(Object obj) {
		return session.delete("encore.bbs.deleteBbs", obj);
	}

	@Override
	public List<Object> selectSearchBbs(Object obj) {
		System.out.println("BbsDaoImpl Select Search Bbs");
		return session.selectList("encore.bbs.selectSearchBbs", obj);
	}

}
