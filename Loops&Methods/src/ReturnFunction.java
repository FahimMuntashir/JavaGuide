import java.util.Scanner;

public class ReturnFunction {
    public static int Addition()
    {

        System.out.println("Enter first number: ");
        Scanner s1= new Scanner(System.in);
        int number1 = s1.nextInt();

        System.out.println("Enter second number: ");
        Scanner s2 = new Scanner(System.in);
        int number2 = s2.nextInt();

        return number1+number2;
    }
    public static void main(String[] args) {
        System.out.println("Addition"+Addition());
        System.out.println("Addition"+Addition());

    }
}
