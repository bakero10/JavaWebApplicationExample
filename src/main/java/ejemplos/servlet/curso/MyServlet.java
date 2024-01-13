package ejemplos.servlet.curso;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/myServlet")
public class MyServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		// send HTML page to client
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Ejercicio optativo Servlet</title>");

		// Aplicamos nuestros etilos
		out.println("<style>");
			out.println("body { background-color: #f0f0f0; font-family: Arial, sans-serif; }");
			out.println(".container { width: 50%; margin: auto; text-align: center; background-color: #fff; padding: 20px; border-radius: 10px; }");
			out.println("h1 { color: #333; }");
		out.println("</style>");

		out.println("</head>");
		out.println("<body>");
		out.println("<div class=\"container\">");
		out.println("<h1>Ejercicio</h1>");
		out.println("<form action=\"/myServlet2\">");
			out.println("<p>Introduce tu nombre.</p>");
			out.println("<input type=\"text\" id=\"nombre\" name=\"nombre\" value=\"\"><br><br>");
			out.println("<input type=\"submit\" value=\"Guardar\">");
		out.println("</form>");
		out.println("</div>");
		out.println("</body></html>");

	}

}