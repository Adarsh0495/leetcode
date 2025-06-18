class Solution {
    public int maximumDifference(int[] nums) {

        int min=nums[0];
        int maxDif=-1;

        for(int i=1;i<nums.length;i++){
            if(min>=nums[i]){
                min=nums[i];
            }else{
                maxDif=Math.max(maxDif,nums[i]-min);
            }

        }
        return maxDif;
        
    }
}