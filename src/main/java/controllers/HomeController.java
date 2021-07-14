package controllers;

import model.Converter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/converter")
@Controller
public class HomeController {
    @GetMapping("")
    public ModelAndView showHome() {
        return new ModelAndView("form", "converter", new Converter());
    }

    @PostMapping("")
    public ModelAndView showResult(@ModelAttribute Converter converter) {
        return new ModelAndView("form", "result", converter.convertToVND());
    }
}
