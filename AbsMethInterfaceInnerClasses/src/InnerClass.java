class OuterClass
{
    class InnerClass
    {
        public void f1(){
            System.out.println("Inner class function");
        }
    }
}
public class InnerClass {
    public static void main(String[] args) {
        OuterClass out = new OuterClass();
        OuterClass.InnerClass in = out.new InnerClass(); //Object of the inner class


        in.f1();

    }
}
