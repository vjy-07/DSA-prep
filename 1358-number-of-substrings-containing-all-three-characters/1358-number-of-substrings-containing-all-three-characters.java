class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        int res=0, r=0;
        int a=-1, b=-1, c=-1;
        while(r<n){
            if(s.charAt(r)=='a'){
                a=r;
            }
            else if(s.charAt(r)=='b'){
                b=r;
            }
            else{
                c=r;
            }
            if(a!=-1 && b!=-1 && c!=-1){
                res=res+(1+Math.min(a, Math.min(b,c)));
            }
            r++;
        }
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna