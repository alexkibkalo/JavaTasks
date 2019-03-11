package ee.task2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/calculator")
public class Task2 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();

        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));

        String operator = request.getParameter("operation");

        int result = -1;

        switch (operator) {
            case "+":
                result = num1 + num2;
                out.print(result);
                break;
            case "-":
                result = num1 - num2;
                out.print(result);
                break;
            case "*":
                result = num1 * num2;
                out.print(result);
                break;
            case "/":
                result = num1 / num2;
                out.print(result);
                break;
            default:
                out.print("not found");
        }
    }
}
