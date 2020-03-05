import java.util.Scanner;

public class IfElseStatement {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter any number : ");
        Scanner s1 = new Scanner(System.in);
        num = s1.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
    }
}
