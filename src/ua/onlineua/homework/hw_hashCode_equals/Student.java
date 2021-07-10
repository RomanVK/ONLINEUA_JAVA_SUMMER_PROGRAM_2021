package ua.onlineua.homework.hw_hashCode_equals;

public class Student{
    String name;
    int age;
    String group;

    public Student(String name, int age, String group) {
        this.name = name;
        this.age = age;
        this.group = group;
    }

    public boolean equals(Object obj) {
        if(obj == null) {
            return false;
        }
        if(this == obj) {
            return true;
        }
        if(this.getClass().equals(obj.getClass())) {
            Student student = (Student) obj;
            return this.name.equals(student.name)
                    && this.age == student.age
                    && this.group.equals(student.group);
        }
        return false;
    }

    public int hashCode() {
        int hashName =
                this.name == null
                        ? 0
                        : this.name.hashCode();
        int hashAge = age;
        int hashGroup =
                this.group == null
                        ? 0
                        : this.group.hashCode();
        return (hashName * 31 + hashAge) * 31 + hashGroup;
    }

    public String toString(){
        return "Student [name = "+ this.name
                + ", age = " + this.age
                + ", group = " + this.group+ ", ]";
    }

    public static void main(String[] args) {
        Student firstStudent = new Student("Ivan", 20, "EPG");
        Student secondStudent = new Student("Ivan", 20, "EPG");
        Student thirdStudent = new Student("Petr", 21, "AT");

        System.out.println("firstStudent is " + firstStudent);
        System.out.println("secondStudent is " + secondStudent);
        System.out.println("Is they equals?");
        System.out.println(firstStudent.equals(secondStudent));
        System.out.println("Their hashCodes is ");
        System.out.println(firstStudent.hashCode() + " and " + secondStudent.hashCode());
        System.out.println("firstStudent " + firstStudent);
        System.out.println("thirdStudent " + thirdStudent);
        System.out.println("Is they equals?");
        System.out.println(firstStudent.equals(thirdStudent));
        System.out.println("Their hashCodes is ");
        System.out.println(firstStudent.hashCode() + " and  " + thirdStudent.hashCode());
    }

}
