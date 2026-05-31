class Solution {
    public static int gcd(int a, int b) {
        // code here
        while(b!=0){
            int rem = b;
            b=a%b;
            a=rem;
        }
        return a;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna