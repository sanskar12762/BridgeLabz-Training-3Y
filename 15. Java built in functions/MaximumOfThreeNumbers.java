import java.util.Scanner;

public class MaximumOfThreeNumbers {

    public static int[] inputThreeNumbers(Scanner sc) {
        int[] nums = new int[3];
        for(int i=0; i<3; i++) {
            System.out.print("Enter number " + (i+1) + ": ");
            nums[i] = sc.nextInt();
        }
        return nums;
    }

    public static int findMaximum(int[] nums) {
        int max = nums[0];
        for(int i=1; i<nums.length; i++)
            if(nums[i] > max) max = nums[i];
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = inputThreeNumbers(sc);
        int max = findMaximum(nums);
        System.out.println("Maximum value: " + max);
    }
}
