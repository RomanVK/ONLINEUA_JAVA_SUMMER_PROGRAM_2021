package ua.onlineua.homework.hw_interface;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        Service service = new Service(car);
        service.getCar().repair();

        GasStation gasStation = new GasStation(car);
        gasStation.getCar().refueling();

    }
}
