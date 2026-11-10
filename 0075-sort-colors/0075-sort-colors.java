class Solution {
    public void sortColors(int[] nums) {
        if(nums.length<=1) return;
        int i=0;
        int j=nums.length-1;
        int mid=0;
        while(mid<=j){
            if(nums[mid]==2){
                int temp=nums[mid];
                nums[mid]=nums[j];
                nums[j]=temp;
                
                j--;
            }
            else if(nums[mid]==1) mid++;
            else{
                int temp=nums[i];
                nums[i]=nums[mid];
                nums[mid]=temp;
                i++;
                mid++;
            }
        }
    }
}