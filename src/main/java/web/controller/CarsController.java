package web.controller;

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

    @GetMapping(value = "/cars")
    public String printCars(ModelMap model, @RequestParam(defaultValue = "5", name = "count") int count) {
        List<String> messages = new ArrayList<>();
        Car car1 = new Car("Lada", "Granta", 222);
        Car car2 = new Car("Lada", "Vesta", 333);
        Car car3 = new Car("Lada", "Largus", 444);
        Car car4 = new Car("Lada", "Niva", 555);
        Car car5 = new Car("Lada", "Xray", 666);
        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        CarService carService = new CarServiceImpl();
        List<Car> carsResponse = new ArrayList<>(carService.getCars(cars, count));
        model.addAttribute("cars" , carsResponse);
        return "cars";
    }

}
