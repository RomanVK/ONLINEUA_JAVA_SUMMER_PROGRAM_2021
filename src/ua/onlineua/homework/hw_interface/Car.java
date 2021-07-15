package ua.onlineua.homework.hw_interface;

public class Car implements CarService, CarGasStation {

    @Override
    public void repair() {
        System.out.println("Repair car");
    }

    @Override
    public void refueling() {
        System.out.println("Refueling car");
    }


}
