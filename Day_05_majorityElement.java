import java.util.ArrayList;
import java.util.Arrays;

public class Day_05_majorityElement {

    public static List<Integer> findMajority(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        Arrays.sort(nums);

        int count = 1;
        int n = nums.length;

        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                if (count > n / 3 && !arr.contains(nums[i - 1])) {
                    arr.add(nums[i - 1]);
                }
                count = 1;
            }
        }

        if (count > n / 3 && !arr.contains(nums[n - 1])) {
            arr.add(nums[n - 1]);
        }

        return arr;
    }

    public static void main(String[] args) {

    }

}
