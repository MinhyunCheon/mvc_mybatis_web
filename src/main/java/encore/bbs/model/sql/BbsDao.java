package encore.bbs.model.sql;

import java.util.List;

public interface BbsDao {
	public List<Object> selectBbsAll();
	public int insertBbs(Object obj);
	public Object selectBbs(Object obj);
	public int updateViewCnt(Object obj);
	public int updateBbs(Object obj);
	public int deleteBbs(Object obj);
	public List<Object> selectSearchBbs(Object obj);
}
