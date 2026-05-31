class Solution {
    void selectionSort(int[] arr) {
        // code here
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int minIdx=i;
            for(int j=i;j<n;j++){
                if(arr[j]<arr[minIdx]){
                    minIdx=j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[minIdx];
            arr[minIdx]=temp;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna