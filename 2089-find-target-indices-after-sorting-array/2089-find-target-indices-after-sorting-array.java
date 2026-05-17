class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<>();
        int lo=0;
        int hi=nums.length-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(nums[mid]>=target) {
                hi=mid-1;
            }
            else{
                lo=mid+1;

            }

        }
        while(lo<nums.length && nums[lo]==target){
            ans.add(lo);
            lo++;
        }
        return ans;


    }
}