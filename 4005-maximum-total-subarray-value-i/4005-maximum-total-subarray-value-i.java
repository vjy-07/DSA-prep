class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int maxEl=Integer.MIN_VALUE;
        int minEl=Integer.MAX_VALUE;
        for(int el: nums){
            maxEl = Math.max(el,maxEl);
            minEl = Math.min(el,minEl);
        }
        return 1L * k * (maxEl-minEl);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna