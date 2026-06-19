/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

class Solution {
    static boolean helper(Node left, Node right){
        if(left==null || right==null) return left==right;
        if(left.data!=right.data) return false;
        return helper(left.left, right.right) && 
                helper(left.right, right.left);
    }
    public boolean isSymmetric(Node root) {
        // code here
        if(root ==null) return false;
        return helper(root.left, root.right);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna