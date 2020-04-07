import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int []num = new int[10];

       // int []arr = {1,5,6,8,10};

        for (int i = 0; i<num.length;i++){
            System.out.println("Enter "+(i+1)+" Number: ");
            Scanner s1 = new Scanner(System.in);
            int number = s1.nextInt();
            num[i]=number;
        }


        for (int i:num){
            System.out.println(i);
        }

    }
}
