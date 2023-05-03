import java.util.Arrays;

public class Solution {
    public int findPeakElement(int[] nums) {
        int elementIndex = 0;
        int[] numsCopy ;
        numsCopy = nums;
        Arrays.sort(numsCopy);


        //get the index of the final number in the sorted array in the nonsorted array
        for (int i = 0; i < numsCopy.length; i++) {
            if (numsCopy[numsCopy.length - 1] == nums[i]) {
                elementIndex = i;
            }
        }


        return elementIndex;
    }
}
