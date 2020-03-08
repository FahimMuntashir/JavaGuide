import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        int i = 1;

        do {
            System.out.println("Enter username:");
            Scanner s1 = new Scanner(System.in);
            String username = s1.next();

            System.out.println("Enter password:");
            Scanner s2 = new Scanner(System.in);
            String password = s2.next();

            if (username.contains("java") && password.contains("programming")) {
                System.out.println("You have been logged in");
                break;
            }
            System.out.println("Please enter correct username and password");
        } while (i <= 3);
    }
}
