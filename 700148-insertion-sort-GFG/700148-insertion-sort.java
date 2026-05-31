class Solution {
    // Please change the array in-place
    public void insertionSort(int arr[]) {
        // code here
        int n =arr.length;
        for(int i=1;i<n;i++){
            int elm = arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>elm){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=elm;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna