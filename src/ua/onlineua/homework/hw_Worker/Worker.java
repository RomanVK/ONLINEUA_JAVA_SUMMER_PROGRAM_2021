package ua.onlineua.homework.hw_Worker;

import java.util.Objects;

public class Worker {
    private String name;
    private int age;
    private int range;

    public Worker(String name, int age, int range) {
        this.name = name;
        this.age = age;
        this.range = range;
    }

    public Worker() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRange() {
        return this.range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    @Override
    public String toString() {
        return "ua.onlineua.homework.hw_Worker.Worker ("
                + "name = " + name
                + "age = " + age
                + "range = " + range
                + ")";
    }

//    @Override
//    public boolean equals(Object obj) {
//        if(obj == null) {
//            return false;
//        }
//        if(this == obj) {
//            return true;
//        }
//        if(this.getClass().equals(obj.getClass())) {
//            ua.onlineua.homework.hw_Worker.Worker worker = (ua.onlineua.homework.hw_Worker.Worker) obj;
//            return (this.name == null ?
//                    false
//                    : this.name.equals(worker.name))
//                    && this.age == worker.age
//                    && this.range == worker.range;
//        }
//        return false;
//    }

//    @Override
//    public int hashCode() {
//        return (name == null ? 0 : name.hashCode()
//                *31 + age) * 31 + range;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker = (Worker) o;
        return age == worker.age && range == worker.range && name.equals(worker.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, range);
    }
}
