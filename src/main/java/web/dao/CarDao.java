package web.dao;

import web.controller.Car;

import java.util.List;

public interface CarDao {
    public List<Car> getCars(int count);
}