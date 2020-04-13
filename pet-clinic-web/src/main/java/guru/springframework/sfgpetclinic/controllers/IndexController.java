package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Ken Butters on 3/21/2020
 */
@Controller
@RequestMapping({"",",","index","index.html"})
public class IndexController {
    //    public String index(){
//
    //       return "index";
//    }
    @RequestMapping(method = RequestMethod.GET)
    ModelAndView
    index() {

        ModelAndView mav = new ModelAndView("index");
        return mav;
    }
}
