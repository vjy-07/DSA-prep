class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int res[] = new int[n];
        int pos=0, neg=1;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                res[pos]=(nums[i]);
                pos+=2;
            }
            else{
                res[neg]=(nums[i]);
                neg+=2;
            }
        }
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna