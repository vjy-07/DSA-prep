// User function Template for Java

class Solution {
    static int helper(int n, int sum){
        if(n==0) return sum;
        sum+=n;
        return helper(n-1,sum);
    }
    static int sumOfNaturals(int n) {
        // code here
        int sum=0;
        return helper(n,sum);
    }
};

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna