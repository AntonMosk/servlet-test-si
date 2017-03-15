package SL;

import SL.controller.Controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by anton on 3/11/17.
 */
public class MainServlet extends HttpServlet {

    private final Map<Request, Controller> controllerMap = new HashMap<>();

    final public static String HOME_PAGE = "home";

    @Override
    public void init() {
        controllerMap.put(new Request("GET","/"), Factory.getHomeController());
        controllerMap.put(new Request("GET","/"), Factory.getHomeController());

    }

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
        try {
            requestHandler(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        try {
            requestHandler(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    private void requestHandler(HttpServletRequest servletRequest, HttpServletResponse servlerResponse) throws ServletException, IOException {

        Request request = new Request(servletRequest.getMethod(), servletRequest.getRequestURI());

        Controller controller = controllerMap.get(request);

        try {
            servletRequest.getRequestDispatcher(getView(controller.process(servletRequest, servlerResponse))).forward(servletRequest, servlerResponse);

        } catch (NullPointerException e) {
            servletRequest.getRequestDispatcher(getView(new ViewModel("error"))).forward(servletRequest, servlerResponse);
        }

//        String view = null;
//
//        if (request.getRequestURI().equals("/servlet-test-si-1.0-SNAPSHOT/")) {
//            view = "home";
//        }
//
//        if (request.getRequestURI().equals("/servlet-test-si-1.0-SNAPSHOT/login")) {
//            view = "login";
//        }
//
//        RequestDispatcher dispatcher = request.getRequestDispatcher(getView(view));
//        try {
//            dispatcher.forward(request, response);
//        } catch (IOException | ServletException e) {
//
//        }
    }

    private String getView(ViewModel vm) {
        String prefix = "/WEB-INF/views/";
        String suffix = ".jsp";
        return prefix + vm.getView() + suffix;
    }

}
