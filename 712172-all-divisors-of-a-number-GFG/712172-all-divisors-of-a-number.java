class Solution {
    public ArrayList<Integer> getDivisors(int n) {
        // code here
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                arr.add(i);
                if(n/i!=i){
                    arr.add(n/i);
                }
            }
        }
        arr.sort(null);
        return arr;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna