package auto.epam;

public class TwoSum {

    public static void main(String[] args) {
        //         Output: [0,1]

        int num[] = {2, 7, 3};
        int tar = 9;
        System.out.println(twoSum(num, tar));
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] + nums[i + 1] == target)
                for (int j = i + 1; j < nums.length; j++)
                    if (nums[j] == target - nums[i]) {
                        return new int[]{i, j};
                    }
        }

        return null;

    }
}

