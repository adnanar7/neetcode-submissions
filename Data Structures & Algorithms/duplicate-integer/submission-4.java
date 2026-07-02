class Solution {
    public boolean hasDuplicate(int[] nums) {

        // 1. Brute Force:

        // for(int i = 0; i < nums.length - 1; i++ ){
        //     for(int j = i+1; j < nums.length; j++){
        //         if(nums[i] == nums[j] ){
        //             return true;
        //         }
        //     }
        // }
        // return false;



        // 2. A little better Approach:
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 1;  i++){
            if(nums[i] == nums[i + 1]){
                return true;
            }
        }
        return false;


    }
}