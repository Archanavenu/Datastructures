package datastructures;

import java.util.Scanner;


    public class TwoSum {

        private static int[] findTwoSum(int[] nums, int target) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        return new int[] { i, j };
                    }
                }
            }
            return new int[] {};
        }


        public static void main(String[] args) {

            Scanner keyboard = new Scanner(System.in);

            int n = keyboard.nextInt();
            int[] nums = new int[n];

            for(int i = 0; i < n; i++) {
                nums[i] = keyboard.nextInt();
            }
            int target = keyboard.nextInt();

            keyboard.close();

            int[] indices = findTwoSum(nums, target);

            if (indices.length == 2) {
                System.out.println(indices[0] + " " + indices[1]);
            } else {
                System.out.println("No solution found!");
            }
        }
    }



