abstract class Homo
{
    void example()
    {
        System.out.println("This is abstract class");
    }

}

class Test extends Homo
{

}
public class Abstraction {
    public static void main(String[] args) {

        Test t1 = new Test();
        t1.example();
    }
}
