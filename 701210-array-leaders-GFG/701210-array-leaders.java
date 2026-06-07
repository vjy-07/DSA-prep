class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        int n=arr.length;
        ArrayList<Integer> res = new ArrayList<>();
        res.add(arr[n-1]);
        int maxi=arr[n-1];
        for(int i=n-2;i>=0;i--){
            maxi=Math.max(arr[i],maxi);
            if(arr[i]>=maxi){
                res.add(arr[i]);
            }
        }
        Collections.reverse(res);
        return res;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna