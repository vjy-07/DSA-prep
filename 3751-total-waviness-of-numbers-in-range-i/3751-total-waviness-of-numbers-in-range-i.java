class Solution {
    public int totalWaviness(int num1, int num2) {
        int res=0;
        for(int i=num1;i<=num2;i++){
            String val = Integer.toString(i);
            int cnt=0;
            for(int j=1;j<val.length()-1;j++){
                int x=val.charAt(j-1) - '0';
                int y=val.charAt(j)-'0';
                int z=val.charAt(j+1)-'0';
                if((x<y && z<y)||(y<x && y<z)){
                    cnt++;
                }
            }
            res+=cnt;
        }
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna