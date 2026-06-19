/*
Definition for Node
class Node {
    int data;
    Node left, right;

    Node(int val)
    {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    static int helper(Node root){
        if(root == null) return -1;
        int lh = helper(root.left);
        int rh = helper(root.right);
        return 1+ Math.max(lh,rh);
    }
    public int height(Node root) {
        // code here
        int res = helper(root);
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna