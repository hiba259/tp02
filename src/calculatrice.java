package calc;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class calcserv
 */
@WebServlet("/calcserv")
public class calcserv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public calcserv() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String o1=request.getParameter("o1");
		String o2=request.getParameter("o2");
		String o=request.getParameter("o");
		String page="";
		if(((o1.equals("")||o2.equals("")))
		  ||(!(o1.matches("[0-9]*"))||!(o2.matches("[0-9]*")))
		  ||(o == null))
		{page="erreur.html";}
		else
		{page="response.jsp";}
		RequestDispatcher disp = request.getRequestDispatcher(page) ;
		disp.forward(request, response) ;
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}