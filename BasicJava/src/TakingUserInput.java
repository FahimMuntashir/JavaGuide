
import java.util.Scanner;
public class TakingUserInput {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int num  = s1.nextInt();
        String str= s1.next();

        System.out.println("Number:"+num);
        System.out.println("String method:"+str);

    }
}
