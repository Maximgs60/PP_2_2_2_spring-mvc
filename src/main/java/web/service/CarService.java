package web.service;

import web.controller.Car;

import java.util.List;

public interface CarService {

    public List<Car> getCars(int count);
}
