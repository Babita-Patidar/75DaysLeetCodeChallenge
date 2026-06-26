class Solution {
    public int majorityElement(int[] nums) {
        //  Arrays.sort(nums);
        //  int n=nums.length;
        //  return nums[n/2];
        int ele=0;
        int count=0;
        for(int num:nums){
            if(count==0){
                ele=num;
            }
            if(num==ele) count++;
            else count--;
        }
        return ele;
    }
}