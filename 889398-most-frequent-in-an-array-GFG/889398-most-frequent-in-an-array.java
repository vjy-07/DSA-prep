class Solution {
    public int mostFreqEle(int[] arr) {
        // code here
        int maxF = 0;
        int val =0;
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int num: arr){
            mp.put(num, mp.getOrDefault(num,0)+1);
        }
        for(int key: mp.keySet()){
            if(maxF<mp.get(key) || (mp.get(key)==maxF && key>val)){
                maxF = mp.get(key);
                val = key;
            }
        }
        return val;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna