import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SaveServlet")
public class SaveServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String nome = request.getParameter("nome");
		String senha = request.getParameter("senha");
		String email = request.getParameter("email");
		String pais = request.getParameter("pais");

		Emp e = new Emp();
		e.setName(nome);
		e.setPassword(senha);
		e.setEmail(email);
		e.setCountry(pais);

		int status = EmpDao.save(e);
		if (status > 0) {
			out.print("<p>Record saved successfully!</p>");
			request.getRequestDispatcher("index.html").include(request, response);
		} else {
			out.println("Sorry! unable to save record");
		}

		out.close();
	}

}