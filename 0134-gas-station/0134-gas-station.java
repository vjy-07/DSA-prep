class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int maxGas=0;
        int maxCost=0;
        for(int i=0;i<n;i++){
            maxGas+=gas[i];
            maxCost+=cost[i];
        }
        if(maxCost>maxGas){
            return -1;
        }
        int st=0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=gas[i]-cost[i];
            if(sum<0){
                sum=0;
                st=i+1;
            }
        }
        return st;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna