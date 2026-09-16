class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int ans = 0 ;
        HashSet<Integer> seen = new HashSet<>();
        for(int i = 0 ; i < nums.length ; i++){
            if(seen.contains(nums[i]))
                ans = ans ^ nums[i] ;
            else
                seen.add(nums[i]);
        }
        return ans;

    }
}