import java.util.Scanner;

public class IfStatements {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter your age: ");
        Scanner s1 = new Scanner(System.in);
        age = s1.nextInt();

        if (age >= 18) {
            System.out.println("You are 18 years old");
        }
        System.out.println("Statements outside of if blocks");

    }
}
