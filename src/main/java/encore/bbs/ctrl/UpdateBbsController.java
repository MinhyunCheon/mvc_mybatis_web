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

public class UpdateBbsController implements Controller {
	private BbsSv service = new BbsSvImpl();

	@Override
	public View execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BbsVO bv = new BbsVO();
		bv.setSeq(Integer.parseInt(request.getParameter("seq")));
		bv.setSubject(request.getParameter("subject"));
		bv.setContent(request.getParameter("content"));
		
		View view = new View();
		
		service.updateBbsService(bv);
		view.setPath("read.encore?seq=" + request.getParameter("seq"));
		view.setSend(false);

		return view;
	}

}
