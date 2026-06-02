class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int res=0;
        int sum=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                sum++;
            }
            res=Math.max(res,sum);
            if(nums[i]==0){
                sum=0;
            }
        }
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna