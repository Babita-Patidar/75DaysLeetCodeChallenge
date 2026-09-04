class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        int common =10;
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    common=Math.min(common,nums1[i]);
                   
                }
            }
        }
        if(common!=10) return common;
        int min1=nums1[0];
        int min2=nums2[0];
        for(int i=1;i<nums1.length;i++){
            min1=Math.min(min1,nums1[i]);
        }
        for(int j=1;j<nums2.length;j++){
            min2=Math.min(min2,nums2[j]);
        }
        return Math.min(min1,min2)*10+ Math.max(min1,min2);

        
    }
}