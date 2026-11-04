class Solution {
    public int dominantIndex(int[] nums) {
        int max =Integer.MIN_VALUE;
        int index=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                index=i;
            }
        }
        int smax =Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(i!=index){
                smax = Math.max(smax, nums[i]);

            }                       
        }
        if(max>=2*smax) return index;
        else return -1;
        
    }
}