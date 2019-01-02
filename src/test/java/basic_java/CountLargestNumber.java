package basic_java;
import java.util.Arrays;

public class CountLargestNumber {
    public static void main(String[] args) {

        int arr[] = {10, 30, 45, 90, 100};
        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println("Smallest in given array is " + min);
        System.out.println("Largest in given array is " + max);
    }

   public static void find3largest(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int check = 0, count = 1;

        for (int i = 1; i <= n; i++) {

            if (count < 4) {
                if (check != arr[n - i]) {
                    // to handle duplicate values
                    System.out.print(arr[n - i] + " ");
                    check = arr[n - i];
                    count++;
                }
            } else
                break;
        }
    }
}
