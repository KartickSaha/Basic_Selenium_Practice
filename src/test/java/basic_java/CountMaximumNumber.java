package basic_java;

import java.util.Scanner;

public class CountMaximumNumber {
    static int arr[] = {10,324,45,90,16000,9808,10000};
    public static int largest() {

            // Initialize maximum element
            int max = arr[0];
        // Traverse array elements from second and
        // compare every element with current max
        for (int i = 0; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];

        return max;
    }

    public static void main(String[] args) {
        System.out.println(largest());

    }
}
