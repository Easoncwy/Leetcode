package InvertBinaryTree;

import apple.laf.JRSUIUtils;

/**
 * Created by supreme on 16/8/9.
 */
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        val = x;
    }
}

public class Solution1 {
    public TreeNode invertTree(TreeNode root){
        if (root == null)
            return root;

        TreeNode left = root.left;
        TreeNode right = root.right;
        left = invertTree(right);
        right = invertTree(left);

        return root;
    }
}
