package hiber.service;

import hiber.model.Car;
import hiber.model.User;

import java.util.List;

public interface UserService {
    void add(User user, Car car);

    User getUserByCar(String model, int series);

    List<User> listUsers();
}
