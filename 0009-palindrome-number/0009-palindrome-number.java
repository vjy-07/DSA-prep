class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        int rev=0;
        while(x>0){
            int r = x%10;
            rev=rev*10+r;
            x/=10;
        }
        return rev==temp;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna