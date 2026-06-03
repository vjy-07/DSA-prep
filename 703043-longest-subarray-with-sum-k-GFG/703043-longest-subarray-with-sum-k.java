// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        int n = arr.length;
        int maxLen=0;
        int sum=0;
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==k){
                maxLen=i+1;
            }
            int rem=sum-k;
            if(mp.containsKey(rem)){
               int val = i - mp.get(rem);
               maxLen = Math.max(val,maxLen);
            }
            if(!mp.containsKey(sum)){
                mp.put(sum,i);
            }
        }
        return maxLen;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna