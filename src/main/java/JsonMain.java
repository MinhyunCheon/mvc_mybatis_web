import org.json.JSONObject;

import encore.bbs.model.vo.BbsVO;

public class JsonMain {
	public static void main(String args[]) {
		BbsVO bv = new BbsVO(1, "test", "test1", "user01", "2021-12-21", 0);
		JSONObject jobj = new JSONObject(bv);
		System.out.println(jobj.toString());
	}
}
