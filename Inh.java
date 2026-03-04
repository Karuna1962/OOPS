class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println(name + " earns " + salary);
    }
}

class Manager extends Employee {
    Manager(String name, double salary) {
        super(name, salary);
    }
}

public class Inh {
    public static void main(String[] args) {
        Manager m = new Manager("Rahul", 50000);
        m.display();
    }
}