class Solution {
    boolean helper(String s, int left, int right){
        if(left>=right) return true;
        if(!Character.isLetterOrDigit(s.charAt(left))){
            return helper(s,left+1,right);
        }
        if(!Character.isLetterOrDigit(s.charAt(right))){
            return helper(s,left,right-1);
        }
        if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
            return false;
        }
        return helper(s,left+1,right-1);
    }
    public boolean isPalindrome(String s) {
        return helper(s, 0, s.length()-1);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna