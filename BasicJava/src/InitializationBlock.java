import java.lang.reflect.Constructor;

class Test {
    int a;

    //initialization block

    {
        a = 5;
        System.out.println("initialization block of parent class");
    }

    Test() {
        System.out.println("Constructor of parent class");
    }
}

class Test2 extends Test {
    {
        System.out.println("initialization block of child class");
    }

    Test2() {
        super();
        System.out.println("Constructor of child class");
    }
}

public class InitializationBlock {
    public static void main(String[] args) {
        Test2 t = new Test2();

    }
}
