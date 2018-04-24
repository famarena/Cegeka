package MyPack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class TestServ
 */
@WebServlet("/TestServ")
public class TestServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	
    /**
     * Default constructor. 
     */
    public TestServ() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher;
		//disp avviare una jsp 
		getServletContext().setAttribute("x", "Ciao ciao");
		
		//SCOPE APPLICATION -> getServlet context la variabile perdurerà per tutte le sessioni di tutti gli utenti
		
		//SCOPE SESSION -> con httpsession la variabile perdura per il tempo della sessione
		//servlet-> HttpSession session = request.getSession(); 
		//file .jsp ->session.setAttribute("x","Ciao ciao"); -> <%= session.getAttribute("x") %>

		//SCOPE REQUEST -> La viariabile perdura per il tempo della req. 
		// servlet-> request.setAttribute("x","Ciao ciao"); 
		//file .jsp -> <%= request.getAttribute("x") %>
		
		dispatcher = getServletContext().getRequestDispatcher("/JSP/NewFile.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
