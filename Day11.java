/*Given a binary tree, you need to compute the length of the diameter of the tree. The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root. */
class Solution {
        int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
         if (root == null) {
            return 0;
        }

        maxHeight(root);

        return diameter;
    }

    private int maxHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = maxHeight(root.left);
        int rightHeight = maxHeight(root.right);

        diameter = Math.max(diameter, (leftHeight + rightHeight));

        return Math.max(leftHeight, rightHeight) + 1;
    }
    }
