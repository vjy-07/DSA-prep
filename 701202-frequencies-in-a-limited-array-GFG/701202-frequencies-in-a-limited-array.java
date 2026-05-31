class Solution {
    public List<Integer> frequencyCount(int[] arr) {
        // code here
        int n =arr.length;
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int nums: arr){
            mp.put(nums, mp.getOrDefault(nums,0)+1);
        }
        List<Integer> res = new ArrayList<>();
        for(int i=1;i<=n;i++){
            res.add(mp.getOrDefault(i,0));
        }
        return res;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna