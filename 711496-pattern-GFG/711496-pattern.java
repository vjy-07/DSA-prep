class Solution {
    public void printDiamond(int n) {
        // code here
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j<=n-i) System.out.print(" ");
                else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j<i) System.out.print(" ");
                else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna