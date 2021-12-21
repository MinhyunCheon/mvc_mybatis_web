package encore.bbs.ctrl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import encore.bbs.model.vo.BbsVO;
import encore.bbs.service.BbsSv;
import encore.bbs.service.BbsSvImpl;
import encore.ctrl.util.Controller;
import encore.ctrl.view.View;

public class DeleteBbsController implements Controller {
	private BbsSv service = new BbsSvImpl();

	@Override
	public View execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BbsVO bv = new BbsVO();
		bv.setSeq(Integer.parseInt(request.getParameter("seq")));
		
		View view = new View();
		
		if(service.deleteBbsService(bv) == 1) {
			view.setPath("list.encore");
			view.setSend(false);
		} else {
		}
		
		return view;
	}

}
