class Solution {
    public int[] sortedSquares(int[] nums) { 
        int n=nums.length;
        int[] arr=new int[n];
        // for(int i=0;i<n;i++){
        //     arr[i]=nums[i]*nums[i];
        // }                                //tc o(nlogn)
        // Arrays.sort(arr);
        // return arr;


        int i=0;
        int j=n-1;
        for(int x=n-1; x>=0; x--){
            if(Math.abs(nums[i]) > Math.abs(nums[j])){
                arr[x]=nums[i]*nums[i];
                i++;
            }
            else{
                arr[x]=nums[j]*nums[j];
                j--;
            }
                                           //tc=o(n)
        }
        return arr;



        
    }
}