package web.dao;

import org.springframework.stereotype.Repository;
import web.controller.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {
    @Override
    public List<Car> getCars(int count) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("BMW", "Blue", 1000));
        carList.add(new Car("AUDI", "Black", 1200));
        carList.add(new Car("GEELY", "Yellow", 700));
        carList.add(new Car("FORD", "Red", 500));
        carList.add(new Car("DAEWOO", "Grey", 1000));
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
