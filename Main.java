
class Calculator
{
    public int add(int a, int b)
    {
        return a + b;
    }

    protected void display()
    {
        System.out.println("This is Calculator class display method");
    }

    private void show()
    {
        System.out.println("This is private show() method of Calculator");
    }

    public void accessPrivate()
    {
        show();
    }
}

class AdvancedCalculator extends Calculator
{
    public int add(int a, int b)
    {
        return a + b + 10;
    }

    protected void display()
    {
        System.out.println("This is AdvancedCalculator class display method");
    }

    public void show()
    {
        System.out.println("This is show() method of AdvancedCalculator");
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Calculator obj1 = new Calculator();
        System.out.println("Addition (Calculator): " + obj1.add(5, 3));
        obj1.display();
        obj1.accessPrivate();

        AdvancedCalculator obj2 = new AdvancedCalculator();
        System.out.println("Addition (AdvancedCalculator): " + obj2.add(5, 3));
        obj2.display();
        obj2.show();

        Calculator obj3 = new AdvancedCalculator();
        System.out.println("Addition (Runtime Polymorphism): " + obj3.add(5, 3));
        obj3.display();
    }
}
