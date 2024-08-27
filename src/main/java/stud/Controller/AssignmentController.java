package stud.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import stud.dao.StudentDao;
import stud.dao.StudentDaoImpl;
import stud.model.Assignment;

/**
 * Servlet implementation class AssignmentController
 */
public class AssignmentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AssignmentController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
				String studId=request.getParameter("studId");
				String studName=request.getParameter("studName");
				String sub1=request.getParameter("sub1");
				String sub2=request.getParameter("sub2");
				String sub3=request.getParameter("sub3");
				

				Assignment Aobj=new Assignment(studId, studName, sub1, sub2, sub3);
				List<Assignment> lst=new ArrayList<Assignment>();
				lst.add(Aobj);

				PrintWriter pw=response.getWriter();
				StudentDao rdao=new StudentDaoImpl();
				int i=rdao.Assignment(lst);
				if(i>0)
				{
					pw.println("Assignment Inserted....");
				}
				else
				{
					pw.println("Assignment Not Inserted...");
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
