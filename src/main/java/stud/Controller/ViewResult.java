package stud.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import stud.dao.StudentDao;
import stud.dao.StudentDaoImpl;
import stud.model.Result;

/**
 * Servlet implementation class ViewResult
 */
public class ViewResult extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewResult() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String studId=request.getParameter("studId");
		StudentDao vdao=new StudentDaoImpl();
		List<Result> lst=vdao.ViewResult(studId);
		Result r=lst.get(0);
		System.out.println(r.getStudName()+"\t"+r.getSub1()+"\t"+r.getSub2()+"\t"+r.getSub3()+"\t"+r.getGrades()+"\t");
		HttpSession session=request.getSession();
		session.setAttribute("data", r);
		response.sendRedirect("ViewResult.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
