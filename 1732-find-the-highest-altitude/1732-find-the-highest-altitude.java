class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int res[] = new int[n+1];
        res[0]=0;
        int ans=0;
        for(int i=0;i<n;i++){
            res[i+1]=res[i]+gain[i];
            ans=Math.max(ans,res[i+1]);
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna