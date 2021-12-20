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

public class ReadController implements Controller {
	private BbsSv service = new BbsSvImpl();

	@Override
	public View execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("ReadController execute");
		
		BbsVO bv = new BbsVO();
		bv.setSeq(Integer.parseInt(request.getParameter("seq")));
		
		request.setAttribute("bbs", service.selectBbsService(bv));
		
		return new View("read.jsp", true);
	}

}
