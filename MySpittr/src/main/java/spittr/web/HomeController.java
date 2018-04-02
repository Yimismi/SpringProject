package spittr.web;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@Controller
@RequestMapping("/")
public class HomeController {

    @RequestMapping(method = GET)
    public String home() {
        return "home";
    }
}
