import java.util.Arrays;
public class ArraySearch {
    public static void main(String[] args) {

        int []arr = {10,8,3,100,82,65};

        Arrays.sort(arr);
        for (int n:arr){
            System.out.println(n);
        }
        int res = Arrays.binarySearch(arr, 165);
        System.out.println("\n\nBinary Search"+res);
    }
}
