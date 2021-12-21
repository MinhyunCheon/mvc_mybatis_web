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

	@Override
	public Object selectBbsService(Object obj) {
		System.out.println("BbsSvImpl selectBbsService");
		dao.updateViewCnt(obj);
		return dao.selectBbs(obj);
	}

	@Override
	public int updateBbsService(Object obj) {
		System.out.println("BbsSvImpl updateBbsService");
		return dao.updateBbs(obj);
	}

	@Override
	public int deleteBbsService(Object obj) {
		return dao.deleteBbs(obj);
	}

}
