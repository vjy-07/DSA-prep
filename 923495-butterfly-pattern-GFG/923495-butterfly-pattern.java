class Solution {
    public void printButterfly(int n) {

        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            for (int j = 1; j < 2 * (n - i); j++)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
        for(int i=1;i<2*n;i++){
            System.out.print("*");
        }
        System.out.println();
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            for (int j = 1; j < 2 * (n - i); j++)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna