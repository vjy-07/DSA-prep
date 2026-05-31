class Solution {
    void merge(int arr[], int l, int mid, int r){
        int temp[] = new int[r-l+1];
        int t=0;
        int left = l;
        int right = mid+1;
        
        while(left<=mid && right<=r){
            if(arr[left]<=arr[right]){
                temp[t++]=arr[left++];
            }
            else{
                temp[t++]=arr[right++];
            }
        }
        while(left<=mid){
            temp[t++]=arr[left++];
        }
        while(right<=r){
            temp[t++]=arr[right++];
        }
        for(int i=l;i<=r;i++){
            arr[i]=temp[i-l];
        }
    }
    void mergeSort(int arr[], int l, int r) {
        // code here
        if(l>=r) return;
        int mid=(l+r)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna