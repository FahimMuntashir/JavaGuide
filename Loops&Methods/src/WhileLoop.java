import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");

        Scanner s1= new Scanner(System.in);
        int num=s1.nextInt();

        int i = 1;
        while (i<=num)
        {
            if (i%2==0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
