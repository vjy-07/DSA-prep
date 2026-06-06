class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n =nums.length;
        int larr[] = new int[n];
        int rarr[] = new int[n];
        int ans[] = new int[n];
        int lsum=0, rsum=0;
        for(int i=0;i<n;i++){
            if(i==0) larr[i]=0;
            else{
                lsum+=nums[i-1];
            }
            larr[i]=lsum;
        }
        for(int i=n-1;i>=0;i--){
            if(i==n-1) rarr[i]=0;
            else{
                rsum+=nums[i+1];
            }
            rarr[i]=rsum;
        }
        for(int i=0;i<n;i++){
            ans[i]=Math.abs(larr[i]-rarr[i]);
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna