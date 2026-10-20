class Solution {
    public int differenceOfSum(int[] nums) {
        int elesum=0;
        int digitsum=0;
        for(int i=0;i<nums.length;i++){
            elesum+=nums[i];
            int n=nums[i];
            while(n>0){
                   int digit=n%10;
                   digitsum+=digit;
                   n/=10;
                }
            
        }           
        return Math.abs(elesum-digitsum);    
    }
}