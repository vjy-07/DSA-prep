class Solution {
    public static int largest(int[] arr) {
        // code here
        int n=arr.length;
        int largest = 0;
        for(int el: arr){
            if(el>largest) largest=el;
        }
        return largest;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna