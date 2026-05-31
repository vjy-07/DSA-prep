class Solution {
    public static int countDigits(int n) {
        // Code here
        int d=0;
        while(n>0){
            d++;
            n/=10;
        }
        return d;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna