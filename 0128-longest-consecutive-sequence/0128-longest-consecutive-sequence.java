class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> st = new HashSet<>();
        int cnt=0, longest=0;
        for(int el: nums){
            st.add(el);
        }
        for(int el: st){
            if(!st.contains(el-1)){
                cnt = 1;
                int val = el;
                while(st.contains(val+1)){
                    cnt++;
                    val++;
                }
            }
            longest= Math.max(longest,cnt);
        }
        return longest;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna