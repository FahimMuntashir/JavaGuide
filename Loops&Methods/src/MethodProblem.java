import java.util.Scanner;

public class MethodProblem {
    public static int length = 10;

    public static boolean password_isValid(String password) {
        if (password.length() < length)
            return false;
        int digit_lenght = 0, letter_lenght = 0;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (char_isNumber(ch)) {
                digit_lenght++;
            } else if (char_isLetter(ch)) {
                letter_lenght++;
            } else {
                return false;
            }
        }
        return (digit_lenght >= 2 && letter_lenght >= 2);
    }

    public static boolean char_isLetter(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }

    public static boolean char_isNumber(char ch) {
        return (ch >= '0' && ch <= '9');
    }

    public static void main(String[] args) {
        System.out.println("Rules of password\n" +
                "1. Password must have atleast 10 charecter\n" +
                "2. A password consist of letter and digit\n" +
                "A password must contain at least two digit\n\n " +
                "Enter password: ");

        Scanner pass = new Scanner(System.in);
        String password = pass.nextLine();

        if (password_isValid(password)) {
            System.out.println("Your password is strong");
        } else {
            System.out.println("Your password is weak");
        }
    }
}
