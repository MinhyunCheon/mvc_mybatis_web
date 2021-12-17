package encore.bbs.service;

import java.util.List;

import encore.bbs.model.sql.BbsDao;
import encore.bbs.model.sql.BbsDaoImpl;

public class BbsSvImpl implements BbsSv {
	private BbsDao dao;
	
	public BbsSvImpl() {
		dao = new BbsDaoImpl();
	}

	@Override
	public List<Object> BbsListService() {
		System.out.println("BbsSvImpl BbsListService");
		return dao.selectBbsAll();
	}

}
