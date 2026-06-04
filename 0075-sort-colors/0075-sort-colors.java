class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int l=0,m=0,h=n-1;
        while(m<=h){
            if(nums[m]==0){
                nums[l]=nums[l]+nums[m]-(nums[m]=nums[l]);
                l++;
                m++;
            }
            else if(nums[m]==1) m++;
            else{
                nums[m]=nums[m]+nums[h]-(nums[h]=nums[m]);
                h--;
            }
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna