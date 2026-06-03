class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n =nums.length;
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<n;i++){
            int rem = target-nums[i];
            if(mp.containsKey(rem)){
                return new int[] {i, mp.get(rem)};
            }
            mp.put(nums[i],i);
        }
        return new int[]{-1,-1}; 
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna