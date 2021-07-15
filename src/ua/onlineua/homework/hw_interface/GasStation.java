package ua.onlineua.homework.hw_interface;

public class GasStation {

    private CarGasStation car;

    public GasStation(CarGasStation car) {
        this.car = car;
    }
    public CarGasStation getCar() {
        return car;
    }

}
