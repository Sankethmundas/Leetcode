class Solution {
    public int findUnsortedSubarray(int[] nums) {

        int n = nums.length;
        int left = -1;
        int right = -1;


        for (int i = 0 ; i < n - 1 ; i++){
            if(nums[i] > nums[i+1]){
                left = i;  
                break;  
            }    
        }

        for ( int i = n-1 ; i > 0 ; i--){
            if( nums[i] < nums [i - 1]){
                right = i;
                break;
            }
        }

        if ( left == -1)
            return 0;
            
        int max = nums[left];
        int min = nums[left];
        
        for(int i = left; i <= right; i++){
            if (nums[i] > max)
                max = nums[i];

            if(nums[i] < min)
                min = nums[i];
        }

        for ( int i = 0; i < left; i++){
            if(nums[i] > min){
                left = i;
                break;
            }
        }

        for( int i = n-1 ; i >= right; i--){
            if(nums[i] < max){
                right = i;
                break;
            }
        }

        return right - left + 1;

    }
}