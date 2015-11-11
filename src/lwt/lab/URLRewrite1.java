package lwt.lab;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.http.entity.ContentType;

import lwt.lab.utils.Constants;
import lwt.lab.utils.ResponseUtils;

/**
 * Servlet implementation class URLRewrite1
 */
@WebServlet("/URLRewrite1")
public class URLRewrite1 extends HttpServlet {
	private static final String TITLE = "URLRewrite1";
	private static final String WEB_INF_CSS_PATH = "/WEB-INF/css/styles.css";
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public URLRewrite1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    response.setContentType(ContentType.TEXT_HTML.getMimeType());
	    String username = request.getParameter(Constants.USERNAME);
	    StringBuilder bodyBuilder = new StringBuilder();
	    bodyBuilder.append(ResponseUtils.appendP("Hello "+ username));
	    Map<String, String> attributes = new HashMap<>();
	    attributes.put("href", "/URLRewrite2?"+Constants.USERNAME+"="+username);
	    bodyBuilder.append(ResponseUtils.appendA("visit",attributes));
	    response.getWriter().append(ResponseUtils.titleBodyStyleHTML(TITLE, bodyBuilder.toString(), WEB_INF_CSS_PATH));
	    response.getWriter().flush();
	    response.getWriter().close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
