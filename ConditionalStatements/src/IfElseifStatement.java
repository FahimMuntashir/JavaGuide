import java.util.Scanner;

public class IfElseifStatement {
    public static void main(String[] args) {
        System.out.println("Enter the speed");
        int speed;
        Scanner s1 = new Scanner(System.in);
        speed = s1.nextInt();

        if (speed >= 100) {
            System.out.println("Car is fast");
        } else if (speed >= 70 && speed <= 90) {
            System.out.println("Car is medium");
        } else {
            System.out.println("Car is slow");
        }
    }
}
