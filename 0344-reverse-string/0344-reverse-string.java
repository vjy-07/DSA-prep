class Solution {
    static void helper(char[] arr, int left, int right){
        if(left>=right) return;
        char temp = arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        helper(arr,left+1,right-1);
    }
    public void reverseString(char[] s) {
        helper(s,0,s.length-1);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna