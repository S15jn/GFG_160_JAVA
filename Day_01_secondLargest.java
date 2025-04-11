import java.util.Arrays;

public class Day_01_secondLargest {
    public static int getSecondLargest(int[] arr) {
        // code here
        int max = Integer.MIN_VALUE;
        int sec_Max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                sec_Max = max;
                max = arr[i];
            } else if (arr[i] > sec_Max && arr[i] != max) {
                sec_Max = arr[i];
            }
        }

        return (sec_Max == Integer.MIN_VALUE) ? -1 : sec_Max;

    }

    public static void main(String[] args) {
        int[] arr = { 10, 5, 10 };
        System.out.println(getSecondLargest(arr));

    }
}