package SL;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by anton on 3/11/17.
 */
public class MainServlet extends HttpServlet {

    final public static String HOME_PAGE = "home";

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) {
//        PrintWriter write = response.getWriter();
//        write.println("<html>");
//        write.println("<head>");
//        write.println("</head>");
//        write.println("<body");
//        write.println("<h1>Hello from Servlet! "+request.getRequestURL()+" "+request.getRequestURI()+"</h1>");
//        write.println("</body>");
//        write.println("</html>");
//        System.out.println("request: "+ request);
        requestHandler(request, response);
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        requestHandler(request, response);
    }

    private void requestHandler(HttpServletRequest request, HttpServletResponse response) {
        String view = null;

        if (request.getRequestURI().equals("/servlet-test-si-1.0-SNAPSHOT/")) {
            view = "home";
        }

        if (request.getRequestURI().equals("/servlet-test-si-1.0-SNAPSHOT/login")) {
            view = "login";
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher(getView(view));
        try {
            dispatcher.forward(request, response);
        } catch (IOException | ServletException e) {

        }
    }

    private String getView(String view) {
        String prefix = "/WEB-INF/views/";
        String suffix = ".jsp";
        return prefix + view + suffix;
    }

}
