package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//cria o nome do oi mundo servlet para /oi
@WebServlet(urlPatterns="/oi")
public class OiMundoServlet extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {

//definir a resposta > usa o response
	
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("Oi mundo eu escrevi o primeiro servlet");
		out.println("</body>");
		out.println("</html>");
		
		System.out.println("o servlet OiMundoServlet foi chamado");
		
	}
	
}
