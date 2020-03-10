class A {
    A() {
        System.out.println("Constructor of class A");
    }
}

class B extends A {
    B() {
        this(5);
        System.out.println("Constructor of class B");
    }

    B(int a) {
        System.out.println("Constructor 2 of class b");
    }
}

public class ConstructorChaining {
    public static void main(String[] args) {

        B b1 = new B();
    }
}

