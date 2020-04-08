public class ExceptionHandling {
    public static void main(String[] args) {
        System.out.println("First line of the program");
        try
        {
            System.out.println(15/0);
        }catch (ArithmeticException e)
        {
            System.out.println("Our catch block"+e.getMessage());
        }
        System.out.println("End of the program");
    }
}
