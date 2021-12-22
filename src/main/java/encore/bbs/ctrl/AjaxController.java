package encore.bbs.ctrl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;

import encore.bbs.model.vo.FilterVO;
import encore.bbs.service.BbsSv;
import encore.bbs.service.BbsSvImpl;

@WebServlet("/search.ajax")
public class AjaxController extends HttpServlet {
	private BbsSv service = new BbsSvImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}
	
	public void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("ajax controller");
		
		FilterVO fv = new FilterVO();
		fv.setSearchCondition(request.getParameter("condition"));
		fv.setSearchKeyword(request.getParameter("keyword"));
		
		List<Object> list = new ArrayList();
		list = service.selectSearchBbsService(fv);
		
		System.out.println(list);
		JSONArray jArr = new JSONArray(list);
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print(jArr.toString());
	}

}
