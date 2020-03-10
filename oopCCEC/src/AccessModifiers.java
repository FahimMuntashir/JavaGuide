
class Example
{
   protected void Fun() // public,protected, private
    {
        System.out.println("function");
    }
}

public class AccessModifiers {
    public static void main(String[] args) {
        Example e=new Example();
        e.Fun();
    }


    }
