public class Day_04_rotateArray {
    public static void rotateArray(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        int n = arr.length;
        if (n == 0)
            return;
        d = ((d % n) + n) % n;

        // add your code here
        rotateArray(arr, 0, n - 1);
        rotateArray(arr, 0, n - d - 1);
        rotateArray(arr, n - d, n - 1);

    }

    public static void main(String[] args) {

    }
}
