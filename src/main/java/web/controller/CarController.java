package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import web.service.CarServiceImpl;

import javax.servlet.http.HttpServletRequest;

@Controller
public class CarController {

    @GetMapping("/cars")
    public String helloPage(HttpServletRequest request, Model model) {
        int count = 5;
        CarServiceImpl carService = new CarServiceImpl();

        if (request.getParameterMap().containsKey("count")) {
            count = Integer.parseInt(request.getParameter("count"));
        }
        model.addAttribute("something", "Car table");
        model.addAttribute("cars", carService.getCars(count));
        return "cars";
    }

}
