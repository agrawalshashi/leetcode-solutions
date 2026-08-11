import java.util.Arrays;
class Solution {
    public int missingInteger(int[] nums) {
        int sum = nums[0];
        //sequential number 
        for(int i=1; i< nums.length; i++){
            if(nums[i]==nums[i-1]+1){
                sum += nums[i];
            } else{
                break;
            }
        }
        //sum
        Arrays.sort(nums);
        for(int num : nums){
            if(num == sum){
                sum++;
            }
        }
        return sum;
    }
}
