import java.util.Scanner;

public class NestedIfStatement {
    public static void main(String[] args) {
        int n1, n2, n3, largestnumber;
        System.out.println("Enter the first number: ");
        Scanner s1 = new Scanner(System.in);
        n1 = s1.nextInt();

        System.out.println("Enter the second number: ");
        Scanner s2 = new Scanner(System.in);
        n2 = s2.nextInt();

        System.out.println("Enter the third number: ");
        Scanner s3 = new Scanner(System.in);
        n3 = s3.nextInt();

        if (n1 > n2) {
            if (n1 > n3) {
                largestnumber = n1;
            } else {
                largestnumber = n3;
            }
        } else {
            if (n2 > n3) {
                largestnumber = n2;
            } else {
                largestnumber = n3;
            }
        }

        System.out.println("The largest number is: " + largestnumber);
    }
}
