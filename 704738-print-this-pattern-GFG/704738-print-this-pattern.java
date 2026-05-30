// User function Template for Java//User function Template for Java
class Solution {
    void printPattern(int n) {
        // code here
        int size = (2*n-1)-1;
        for(int i=0;i<=size;i++){
            for(int j=0;j<=size;j++){
                int top = i;
                int left = j;
                int right = size-j;
                int bottom = size-i;
                
                int val= n- Math.min(Math.min(top,bottom),Math.min(left,right));
                System.out.print(val);
            }
            System.out.println();
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna