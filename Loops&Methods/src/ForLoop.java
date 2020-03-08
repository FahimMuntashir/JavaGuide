import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        System.out.println("Enter rows: ");
        Scanner s1 = new Scanner(System.in);
        int rows = s1.nextInt();
        int space = rows-1;

        int j,i;
        for (j=1; j<=rows;j++)
        {
            for (i=1; i<=space;i++)
            {
                System.out.println(" ");
            }
            space--;
            for (i=1;i<=2*j-1;i++)
            {
                System.out.println("*");
            }
            System.out.println("");
        }
    }
}
