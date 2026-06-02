class Solution {
    int missingNum(int arr[]) {
        // code here
        int n = arr.length+1;
        int xor1=0;
        int xor2=0;
        for(int i=1;i<=n;i++){
            xor1^=i;
        }
        for(int j=0;j<n-1;j++){
            xor2^=arr[j];
        }
        return xor1^xor2;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna