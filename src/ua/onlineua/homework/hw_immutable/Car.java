package ua.onlineua.homework.hw_immutable;

public final class Car{
    private final String model;
    private final Engine engine;

    public Car(String model, Engine engine) {
        this.model = model;
        //this.engine = new Engine(
        //	engine.getTypeOfFuel,
        //	engine.getVolume
        //	)
        this.engine = (Engine)engine.clone();
    }

    public String getModel() {
        return this.model;
    }

    public Car setModel(String model) {
        return new Car(model, this.engine);
    }

    public Engine getEngine() {
        return this.engine;
    }

    public Car setEngine(Engine engine) {
        return new Car(this.model, engine);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", engine=" + engine +
                '}';
    }
}

class Engine implements Cloneable {
    private Fuels typeOfFuel;
    private int volume;

    public Engine(Fuels typeOfFuel, int volume) {
        this.typeOfFuel = typeOfFuel;
        this.volume = volume;
    }

    public Fuels getTypeOfFuel() {
        return this.typeOfFuel;
    }

    public int getVolume() {
        return this.volume;
    }

    public void setTypeOfFuel(Fuels typeOfFuel) {
        this.typeOfFuel = typeOfFuel;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public Object clone() {
        try{
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("This object cannot cloned!");
        }
    }

    @Override
    public String toString() {
        return "Engine{" +
                "typeOfFuel=" + typeOfFuel +
                ", volume=" + volume +
                '}';
    }
}

enum Fuels {
    DIESEL, GASOLINE
}
