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

public class InsertPostController implements Controller {
	private BbsSv service = new BbsSvImpl();

	@Override
	public View execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Post Insert Controller execute");
		BbsVO bv = new BbsVO();
		bv.setWriter(request.getParameter("name"));
		bv.setSubject(request.getParameter("subject"));
		bv.setContent(request.getParameter("content"));
		
		View view = new View();
		if(service.insertBbsService(bv) == 1) {
			view.setPath("/bbs/list.encore");
			view.setSend(false);
		} else {
			view.setPath("/bbs/post.encore");
			view.setSend(false);
		}
		
		return view;
	}

}
