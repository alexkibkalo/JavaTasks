package ee.task1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/task1")
public class Task1 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.getWriter().print("<html>");
        resp.getWriter().print("<head>");
        resp.getWriter().print("<title>Test</title>");
        resp.getWriter().print("</head>");
        resp.getWriter().print("<body>");
        resp.getWriter().print("<h1>Hello world!</h1>");
        resp.getWriter().print("</body>");
        resp.getWriter().print("</html>");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}
