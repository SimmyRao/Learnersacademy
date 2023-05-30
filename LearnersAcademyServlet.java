package LA;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LearnersAcademyServlet
 */
@WebServlet("/LearnersAcademyServlet")
public class LearnersAcademyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverLearners.getConnection("jdbc:mysql://localhost:2285/rao","rao","rao2285")
		    String n=request.getParameter("txtName");
			String p=request.getParameter("txtPwd");
			PreparedStatement ps=con.prepareStatement
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		};
	}

}
