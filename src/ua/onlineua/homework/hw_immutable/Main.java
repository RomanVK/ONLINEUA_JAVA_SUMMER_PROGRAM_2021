package ua.onlineua.homework.hw_immutable;

public class Main {
    public static void main(String[] args) {
        System.out.println("Make a new car TOYOTA DIESEL 3500");
        Car car = new Car("TOYOTA", new Engine(Fuels.DIESEL, 3500));
        System.out.println(car);
        System.out.println("Change model to BMW");
        car = car.setModel("BMW");
        System.out.println(car);
        System.out.println("Change engine to 1500 and gasoline");
        car = car.setEngine(new Engine(Fuels.GASOLINE, 1500));
        System.out.println(car);
        System.out.println("Change fuel to diesel");
        car = car.setEngine(new Engine(Fuels.DIESEL, car.getEngine().getVolume()));
        System.out.println(car);
    }
}
