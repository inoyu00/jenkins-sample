package la.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SampleServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		String val1 = request.getParameter("val1");
		String val2 = request.getParameter("val2");

		response.setContentType("text/html;charset=UTF-8");
		response.getWriter().println("入力値は「" + val1 + "」、「" + val2 + "」です。");
	}
}
