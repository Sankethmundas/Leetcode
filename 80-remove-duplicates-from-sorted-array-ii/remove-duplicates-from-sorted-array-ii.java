class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 1;
        int j = 2;
        for (j = 2 ; j < nums.length ; j++){
            if(nums[j] != nums[i-1]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}