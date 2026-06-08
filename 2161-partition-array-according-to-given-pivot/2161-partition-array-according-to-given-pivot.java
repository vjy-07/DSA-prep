class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n= nums.length;
        int res[] = new int[n];
        int left=0, right=n-1;
        int l=0, r=n-1;
        while(left<n){
            if(nums[left]<pivot){
                res[l++]=nums[left];
            }
            if(nums[right]>pivot){
                res[r--]=nums[right];
            }
            left++; right--;
        }
        while(l<=r){
            res[l++]=pivot;
        }
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna