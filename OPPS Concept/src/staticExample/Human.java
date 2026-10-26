package staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long popolution;

    public Human(int age, String name, int salary, boolean married) { //Constructor for the above one...
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.popolution += 1;
    }
}
