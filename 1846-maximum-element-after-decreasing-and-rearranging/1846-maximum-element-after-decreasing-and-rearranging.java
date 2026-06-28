class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);

        int res=-1;
        for(int i=0;i<n;i++){
            if(i==0){
                arr[i]=1;
            }
            else if(arr[i]-arr[i-1]>1){
                arr[i]=arr[i-1]+1;
            }
            res=Math.max(res,arr[i]);
        }
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna