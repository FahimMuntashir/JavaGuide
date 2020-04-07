import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int []arr = {1,5,8,3,9,7,22};

        Arrays.sort(arr);

        for (int a:arr){
            System.out.println(a);
        }
    }
}
