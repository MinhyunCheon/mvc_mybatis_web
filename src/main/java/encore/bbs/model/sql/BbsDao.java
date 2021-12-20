package encore.bbs.model.sql;

import java.util.List;

public interface BbsDao {
	public List<Object> selectBbsAll();
	public int insertBbs(Object obj);
}
