class OuterClass
{
    static int a=10;
    static class InnerClass
    {
        public void f1(){
            System.out.println("Inner class function"+a);
        }
    }
}
public class InnerClass {
    public static void main(String[] args) {

        OuterClass.InnerClass o1 = new OuterClass.InnerClass();
        o1.f1();




    }
}
