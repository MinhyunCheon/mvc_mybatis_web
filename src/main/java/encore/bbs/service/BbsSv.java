package encore.bbs.service;

import java.util.List;

public interface BbsSv {
	public List<Object> bbsListService();
	public int insertBbsService(Object obj);
	public Object selectBbsService(Object obj);
	public int updateBbsService(Object obj);
	public int deleteBbsService(Object obj);
	public List<Object> selectSearchBbsService(Object obj);
}
