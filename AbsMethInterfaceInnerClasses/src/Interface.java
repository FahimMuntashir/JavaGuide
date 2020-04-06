interface Animal
{
    void eat();
    void color();
    void weight();
}

class Lion implements Animal
{
    @Override
    public void eat()
    {
        System.out.println("Lion eats meat");
    }

    @Override
    public void color()
    {
        System.out.println("color of lion is orange");
    }
    @Override
    public void weight()
    {
        System.out.println("The lion of weight is 100KG");
    }

}

public class Interface {
    public static void main(String[] args) {

        Lion l = new Lion();
        l.eat();
        l.color();
        l.weight();

    }
}
