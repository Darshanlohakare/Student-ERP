package stud.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import stud.dao.StudentDao;
import stud.dao.StudentDaoImpl;
import stud.model.Result;

/**
 * Servlet implementation class UpdateResult
 */
public class UpdateResult extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateResult() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String studId=request.getParameter("studId");
        String sub1=request.getParameter("sub1");
        String sub2=request.getParameter("sub2");
        String sub3=request.getParameter("sub3");

        StudentDao rdao=new StudentDaoImpl();
        List<Result> lst=rdao.UpdateResult(studId, sub1, sub2, sub3);
        if (lst.size() > 0) {
            Result r=lst.get(0);
            System.out.println(r.getStudId()+"\t"+r.getSub1()+"\t"+r.getSub2()+"\t"+r.getSub3()+"\t");
            response.getWriter().println("Update Successful");
        } else {
            response.getWriter().println("Update Failed");
        }

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
