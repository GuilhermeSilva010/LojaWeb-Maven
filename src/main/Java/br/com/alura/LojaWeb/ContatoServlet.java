package br.com.alura.LojaWeb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.maven.Produtos;

@WebServlet(urlPatterns = {"/contato"})
public class ContatoServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Produtos p = new Produtos("Bala", 10.0);
		PrintWriter writer = resp.getWriter();
		writer.println("<html><h2>Tudo está ocorrendo legal</h2></html>");
		writer.close();
	}
	
}
