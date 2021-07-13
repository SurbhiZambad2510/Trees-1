//Time Complexity : O(N)
//Space Complexity : O(H)

class Solution {
    public boolean isValidBST(TreeNode root) {
        TreeNode prev = null;
        if(root == null)
            return false;
        Stack<TreeNode> tree = new Stack<>();
        while(root!=null ||!tree.isEmpty())
        {      //Left node
            while(root!=null)
            {
                tree.push(root);
                root = root.left;
            }
            //Root node
            root = tree.pop();
            if(prev!=null && prev.val >= root.val)
                return false;
           // System.out.println(root.val);
            prev = root;
            //Right Node
            root = root.right;
        }
        return true;
    }

}