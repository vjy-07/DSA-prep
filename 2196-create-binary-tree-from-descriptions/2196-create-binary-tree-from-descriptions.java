/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode createBinaryTree(int[][] descriptions) {
        HashMap<Integer, TreeNode> mp = new HashMap<>();
        HashSet<Integer> st = new HashSet<>();

        for(int[] val: descriptions){
            int parent = val[0];
            int child = val[1];
            int isLeft = val[2];

            mp.putIfAbsent(parent, new TreeNode(parent));
            mp.putIfAbsent(child, new TreeNode(child));
            if(isLeft==1){
                mp.get(parent).left = mp.get(child);
            }
            else{
                mp.get(parent).right = mp.get(child);
            }
            st.add(child);
        }
        for(int[] val: descriptions){
            int parent = val[0];
            if(!st.contains(parent)){
                return mp.get(parent);
            }
        }
        return null;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna