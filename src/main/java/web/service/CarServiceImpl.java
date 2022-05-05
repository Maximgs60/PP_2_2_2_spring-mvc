package web.service;

import web.controller.Car;
import web.dao.CarDaoImpl;

import java.util.List;

public class CarServiceImpl implements CarService {
    CarDaoImpl carDao = new CarDaoImpl();

    @Override
    public List<Car> getCars(int count) {
        return carDao.getCars(count);
    }
}
