class Plants
{
    void eat()
    {
        System.out.println("All animal eat something.");
    }
}
class Flowers extends Plants
{
    @Override
    void eat()
    {
        System.out.println("Lion eat meat");
    }
}

class Vegetables extends Plants
{
    @Override
    void eat()
    {
        System.out.println("Vegetables are good for health");
    }
}

class Fruits extends Plants
{
    @Override
    void eat()
    {
        System.out.println("Everybody should eat fruits");
    }
}
class Unknown extends Plants
{

}

public class DynamicPolymorphism {
    public static void main(String[] args) {

        Plants p;
        p= new Vegetables();
        p.eat();
        p=new Flowers();
        p.eat();
        p=new Fruits();
        p.eat();
        p=new Unknown();
        p.eat();
    }
}
