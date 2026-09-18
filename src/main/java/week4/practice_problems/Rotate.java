package week4.class_problems;

import java.util.Arrays;

public class Rotate {

    static int[] rotateArray(int[] nums, int k) {

        k = k % nums.length;

        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {

            int newIndex = (i + k) % nums.length;

            result[newIndex] = nums[i];
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6, 7};

        System.out.println(
                Arrays.toString(rotateArray(nums, 3))
        );
    }
}