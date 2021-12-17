package encore.bbs.ctrl;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import encore.bbs.service.BbsSv;
import encore.bbs.service.BbsSvImpl;
import encore.ctrl.util.Controller;
import encore.ctrl.view.View;

public class SelectBbsController implements Controller {
	private BbsSv service = new BbsSvImpl();

	@Override
	public View execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Select Bbs Controller");
		List<Object> list = service.BbsListService();
//		Iterator<Object> it = list.iterator();
//		
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		request.setAttribute("bbsList", list);
		
		return new View("bbsList.jsp", true);
	}
}
