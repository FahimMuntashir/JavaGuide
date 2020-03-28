class Calculator
{
    void add(int a,int b)
    {

        System.out.println("Addition"+(a+b));

    }

    void add(int a, int b,int c)
    {
        System.out.println("Addition"+(a+b+c));

    }
    void add(double a,int b)
    {
        System.out.println("Addition"+(a+b));

    }
    void add(int a, double b)
    {
        System.out.println("Addition"+(a+b));
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.add(5,5);
        c1.add(5.00,5);
        c1.add(5,6.00);
        c1.add(5,5,5);

    }
}
