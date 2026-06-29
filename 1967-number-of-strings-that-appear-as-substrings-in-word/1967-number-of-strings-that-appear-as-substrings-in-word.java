class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int n= patterns.length;
        int res=0;
        for(int i=0;i<n;i++){
            if(word.contains(patterns[i])){
                res++;
            }
        }
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna