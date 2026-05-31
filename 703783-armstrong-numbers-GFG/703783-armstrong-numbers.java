// User function Template for Java
class Solution {
    static int count(int n){
        int d = 0;
        while(n>0){
            d++;
            n/=10;
        }
        return d;
    }
    static boolean isArmstrong(int n){
        int d=count(n);
        int sum=0;
        int temp = n;
        while(n>0){
            int r=n%10;
            sum= sum+ (int)Math.pow(r,d);
            n/=10;
        }
        return temp==sum;
    }
    static boolean armstrongNumber(int n) {
        // code here
        if(isArmstrong(n)){
            return true;
        }
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna