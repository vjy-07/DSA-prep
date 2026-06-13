class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        int n=words.length;
        char revAlp[] = new char[26];
        int t=0;
        String res="";
        for(char ch='z';ch>='a';ch--){
            revAlp[t++]=ch;
        }
        for(int i=0;i<n;i++){
            int sum=0;
            String curr = words[i];
            for(int j=0;j<curr.length();j++){
                int ch = curr.charAt(j)-'a';
                sum+=weights[ch];
            }
            sum=sum%26;
            res+=revAlp[sum];
        }
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna