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
import stud.model.FeePayment;

/**
 * Servlet implementation class FeePaymentController
 */
public class FeePaymentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FeePaymentController() {
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
		String course=request.getParameter("course");
		String feeAmt=request.getParameter("feeAmt");
		
		

		FeePayment Aobj=new FeePayment(studId, studName, course, feeAmt);
		List<FeePayment> lst=new ArrayList<FeePayment>();
		lst.add(Aobj);

		PrintWriter pw=response.getWriter();
		StudentDao rdao=new StudentDaoImpl();
		int i=rdao.FeePayment(lst);
		if(i>0)
		{
			pw.println("Payment Done Successfully....");
		}
		else
		{
			pw.println("Payment Not Inserted...");
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
