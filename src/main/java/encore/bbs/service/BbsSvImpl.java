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
	public List<Object> bbsListService() {
		System.out.println("BbsSvImpl BbsListService");
		return dao.selectBbsAll();
	}

	@Override
	public int insertBbsService(Object obj) {
		System.out.println("BbsSvImpl BbsInsertService");
		return dao.insertBbs(obj);
	}

}
