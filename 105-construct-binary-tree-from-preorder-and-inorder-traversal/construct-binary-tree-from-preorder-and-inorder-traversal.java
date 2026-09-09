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
    int index=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder,inorder,0,inorder.length-1);
    }
    private TreeNode build(int[] preorder, int[] inorder,int left,int right){
        if( left > right){
            return null ;
        }       

        TreeNode root = new TreeNode(preorder[index++]);
            int pos = left;

        while(inorder[pos] != root.val){
            pos++;
        }
        root.left = build(preorder,inorder,left,pos-1);
        root.right = build(preorder,inorder,pos+1,right);
    return root;
    }
}