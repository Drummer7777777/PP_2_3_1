package web.service;

import web.models.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService{
    @Override
    public List<Car> getCars(List<Car> cars, int count) {
        if (count>5) {
            count = 5;
        }
        List<Car> response_car = new ArrayList<>();
        for (int i=0; i<count; i++) {
            response_car.add(cars.get(i));
        }
        return response_car;
    }
}
