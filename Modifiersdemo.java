abstract class Person {
    protected String name;
    final int age = 18;

    Person(String name) {
        this.name = name;
    }

    abstract void showRole();

    protected void showName() {
        System.out.println("Name: " + name);
    }
}

public class ModifiersDemo extends Person {

    private int id;
    static String school = "ABC School";

    ModifiersDemo(String name, int id) {
        super(name);
        this.id = id;
    }

    public void showRole() {
        System.out.println("Role: Student");
    }

    private void showId() {
        System.out.println("ID: " + id);
    }

        static void showSchool() {
        System.out.println("School: " + school);
    }

    public static void main(String[] args) {

        ModifiersDemo obj = new ModifiersDemo("Karuna", 101);

        obj.showName();
        obj.showRole();
        obj.showId();
        System.out.println("Age: " + obj.age);

        ModifiersDemo.showSchool();
    }
}
s