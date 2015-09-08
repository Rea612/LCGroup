public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length < 3){
            return nums.length;
        }
        int j = 1;
        for (int i = 2; i < nums.length; i++){
            if (nums[j - 1] != nums[i]){
                j++;
                nums[j] = nums[i];
            }
        }
        return j + 1;
    }
}