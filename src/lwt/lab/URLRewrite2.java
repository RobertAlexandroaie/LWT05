package lwt.lab;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lwt.lab.utils.Constants;
import lwt.lab.utils.ResponseUtils;

/**
 * Servlet implementation class URLRewrite2
 */
@WebServlet("/URLRewrite2")
public class URLRewrite2 extends HttpServlet {
    private static final String TITLE = "URLRewrite2";
    private static final String WEB_INF_CSS_PATH = "/WEB-INF/css/style.css";
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public URLRewrite2() {
	super();
	// TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	String username = request.getParameter(Constants.USERNAME);
	StringBuilder bodyBuilder = new StringBuilder();
	bodyBuilder.append(ResponseUtils.appendP("Hello, "+username));
	response.getWriter().append(ResponseUtils.titleBodyStyleHTML(TITLE, bodyBuilder.toString(), WEB_INF_CSS_PATH));
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	// TODO Auto-generated method stub
	doGet(request, response);
    }

}
