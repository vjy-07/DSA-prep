class Solution {
    // Function to calculate factorial of a number.
    static int helper(int n, int res){
        if(n==1) return res;
        res*=n;
        return helper(n-1,res);
    }
    int factorial(int n) {
        // code here
        int res=1;
        return helper(n,res);
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna