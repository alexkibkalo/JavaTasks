package ee.task4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SpringController {

    @ResponseBody
    @RequestMapping(value = "/spring", method = RequestMethod.POST)
    public void validation(@RequestParam(value = "name") String name) {
        System.out.println(name);
    }

}
