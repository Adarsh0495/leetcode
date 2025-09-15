class Solution {
    public int findGCD(int[] nums) {
        
        int small=nums[0];
        int large=nums[0];
        int gcd=0;

        for(int i=0;i<nums.length;i++){
            small=Math.min(small,nums[i]);
            large=Math.max(large,nums[i]);

        }

        for(int i=1;i<=large;i++){
            if(small%i==0&&large%i==0){
                gcd=Math.max(gcd,i);

            }
        }
return gcd;

        
    }
}