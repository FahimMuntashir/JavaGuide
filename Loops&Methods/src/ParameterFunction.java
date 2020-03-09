import java.util.Scanner;

public class ParameterFunction {
    public static int greatestNumber(int number1, int number2, int number3) {
        if (number1 > number2 && number1 > number3) {
            return number1;
        } else if (number2 > number3 && number2 > number1) {
            return number2;
        } else {
            return number3;
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter first number : ");
        Scanner s1 = new Scanner(System.in);
        int num1 = s1.nextInt();

        System.out.println("Enter second number :");
        Scanner s2 = new Scanner(System.in);
        int num2 = s2.nextInt();

        System.out.println("Enter third number :");
        Scanner s3 = new Scanner(System.in);
        int num3 = s3.nextInt();
        System.out.println("The greatest number is : " + greatestNumber(num1, num2, num3));


    }
}
