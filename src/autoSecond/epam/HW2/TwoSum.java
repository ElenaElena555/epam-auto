package autoSecond.epam.HW2;

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {
        //         Output: [0,1]

        int num[] = {2, 3, 7};
        int tar = 9;
        System.out.println(Arrays.toString(twoSum(num, tar)));
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
                for (int j = i + 1; j < nums.length; j++)
                    if (nums[j] == target - nums[i]) {
                        return new int[]{i, j};
                    }
        }

        return null;

    }
}

