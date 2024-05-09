package web.controller;

import jdk.jfr.DataAmount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import web.models.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class CarsController {
    CarService carService;

    @GetMapping(value = "/cars")
    public String printCars(ModelMap model, @RequestParam(defaultValue = "5", name = "count") int count) {
        carService = new CarServiceImpl();
        List<Car> carsResponse = new ArrayList<>(carService.getCars(count));
        model.addAttribute("cars" , carsResponse);
        return "cars";
    }

}
