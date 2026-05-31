class Solution {
    public void quickSort(int[] arr, int low, int high) {
        // code here
        if(low<high){
            int pIdx= partition(arr, low, high);
            quickSort(arr, low, pIdx-1);
            quickSort(arr,pIdx+1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j=high;
        
        while(i<j){
            while(arr[i]<=pivot && i<high) i++;
            while(arr[j]>pivot && j>low) j--;
            if(i<j){
                int temp= arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp = arr[j];
        arr[j]=arr[low];
        arr[low]=temp;
        return j;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna