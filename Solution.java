import java.util.Arrays;

public class Solution {
    public int findPeakElement(int[] nums) {
        int elementIndex = 0;
        int[] numsCopy =Arrays.copyOf(nums, nums.length);;
        Arrays.sort(numsCopy);
        int max = numsCopy[numsCopy.length - 1];


        //get the index of the final number in the sorted array in the nonsorted array
        for (int i = 0; i < numsCopy.length; i++) {
            if (max == nums[i]) {
                elementIndex = i;
                break;
            }
        }


        return elementIndex;
    }
}
