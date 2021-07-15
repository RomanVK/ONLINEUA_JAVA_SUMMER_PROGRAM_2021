package ua.onlineua.homework.hw_interface;

public class Service {
    private CarService car;

    public Service(CarService car) {
        this.car = car;
    }

    public CarService getCar() {
        return car;
    }
}
