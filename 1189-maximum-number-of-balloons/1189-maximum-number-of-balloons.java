class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> mpp = new HashMap<>();
        for(char ch: text.toCharArray()){
            if(ch=='b' || ch=='a' || ch=='l' || ch=='o' || ch=='n'){
                mpp.put(ch, mpp.getOrDefault(ch,0)+1);
            }
        }
        int temp1 = Math.min(mpp.getOrDefault('b',0), Math.min(mpp.getOrDefault('a',0), mpp.getOrDefault('n',0)));
        int temp2 = Math.min(mpp.getOrDefault('l',0), mpp.getOrDefault('o',0));
        int res = Math.min(temp1, temp2/2);
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna