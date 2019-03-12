package ee.task4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class SpringController {

    @RequestMapping(value = "/spring", method = RequestMethod.POST)
    @ResponseBody
    public void validation(@RequestParam(value = "name") String name, HttpServletResponse response) throws IOException {
        System.out.println(name);
        response.sendRedirect("jsp/hello.jsp");
    }

}
