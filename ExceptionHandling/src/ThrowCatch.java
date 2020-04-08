public class ThrowCatch {
    public static void main(String[] args) {
        System.out.println("First line of program");
        String str = null;

        try {
            System.out.println(15/0);
            System.out.println(str.length());
        }catch (ArithmeticException e){
            System.out.println("Our catch block. "+e.getMessage());
        }
        catch (NullPointerException e)
        {
            System.out.println("our 2nd block catch "+e.getMessage());
        }
        System.out.println("End of the program");
    }
}
