import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        System.out.println("Enter Alphabet it is vowel or consonant: ");
        Scanner s1 = new Scanner(System.in);
        char alpha = s1.next().charAt(0);

        switch (alpha) {
            case 'a':
                System.out.println("This is a vowel");
                break;
            case 'e':
                System.out.println("This is a vowel");
                break;
            case 'i':
                System.out.println("This is a vowel");
                break;
            case 'o':
                System.out.println("This is a vowel");
                break;
            case 'u':
                System.out.println("This is a vowel");
                break;
            default:
                System.out.println("This is consonant");
        }
    }
}
