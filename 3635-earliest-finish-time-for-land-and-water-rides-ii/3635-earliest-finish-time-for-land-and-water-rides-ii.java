class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int n = landStartTime.length;
        int m = waterStartTime.length;
        int l=Integer.MAX_VALUE,w=Integer.MAX_VALUE;
        int l_w=Integer.MAX_VALUE, w_l = Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            l=Math.min(l, landStartTime[i]+landDuration[i]);
        }
        for(int i=0;i<m;i++){
            w=Math.min(w, waterStartTime[i]+waterDuration[i]);
            l_w=Math.min(l_w, Math.max(l, waterStartTime[i])+waterDuration[i]);
        }
        for(int i=0;i<n;i++){
            w_l=Math.min(w_l, Math.max(w, landStartTime[i])+landDuration[i]);
        }
        return Math.min(l_w,w_l);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna