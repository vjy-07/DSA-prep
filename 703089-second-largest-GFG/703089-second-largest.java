class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int fL=-1;
        int sL=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>fL){
                sL=fL;
                fL=arr[i];
            }
            else if(arr[i]>sL && arr[i]<fL){
                sL=arr[i];
            }
        }
        return sL;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna