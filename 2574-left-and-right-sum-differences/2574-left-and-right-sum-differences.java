class Solution {
    public int[] leftRightDifference(int[] nums) {
        int lsum=0, rsum=0, n=nums.length;
        for(int el: nums) rsum+=el;
        for(int i=0;i<n;i++){
            int val= nums[i];
            rsum-=val;
            nums[i]=Math.abs(lsum-rsum);
            lsum+=val;
        }
        return nums;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna