import java.util.Scanner;

public class SwitchStateMCQ {
    public static void main(String[] args) {
        System.out.println("Which of the following is not a high level language : ");
        System.out.println("1.Java\n2.PHP\n3.Python\n4.Machine Language");
        Scanner s1 = new Scanner(System.in);
        int choice = s1.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Wrong");
                break;
            case 2:
                System.out.println("Wrong");
                break;
            case 3:
                System.out.println("Wrong");
                break;
            case 4:
                System.out.println("True");
                break;

            default:
                System.out.println("Enter correct choice.");
        }

    }
}
