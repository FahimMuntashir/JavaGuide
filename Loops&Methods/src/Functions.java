import java.util.Scanner;

public class Functions {
    public static void Addition()
    {

        System.out.println("Enter first number: ");
        Scanner s1= new Scanner(System.in);
        int number1 = s1.nextInt();

        System.out.println("Enter second number: ");
        Scanner s2 = new Scanner(System.in);
        int number2 = s2.nextInt();

        System.out.println("Addition is: "+(number1+number2));
    }
    public static void main(String[] args) {
        Addition();

    }
}
