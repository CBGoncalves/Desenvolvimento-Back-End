import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EditServlet2")
public class EditServlet2 extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String sidusuario = request.getParameter("idusuario");
		int idusuario = Integer.parseInt(sidusuario);
		String nome = request.getParameter("nome");
		String senha = request.getParameter("senha");
		String email = request.getParameter("email");
		String pais = request.getParameter("pais");

		Emp e = new Emp();
		e.setId(idusuario);
		e.setName(nome);
		e.setPassword(senha);
		e.setEmail(email);
		e.setCountry(pais);

		int status = EmpDao.update(e);
		if (status > 0) {
			response.sendRedirect("ViewServlet");
		} else {
			out.println("Sorry! unable to update record");
		}

		out.close();
	}

}