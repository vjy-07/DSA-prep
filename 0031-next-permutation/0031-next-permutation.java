class Solution {
    void reverse(int[] nums, int l, int r){
        while(l<r){
            nums[l]=nums[l]+nums[r]-(nums[r]=nums[l]);
            l++;
            r--;
        }
    }
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int ind=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ind=i;
                break;
            }
        }
        if(ind==-1){
            reverse(nums, 0, n-1);
            return;
        }
        for(int i=n-1;i>ind;i--){
            if(nums[i]>nums[ind]){
                nums[i]=nums[i]+nums[ind]-(nums[ind]=nums[i]);
                break;
            }
        }
        reverse(nums, ind+1, n-1);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna