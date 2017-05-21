 Given a binary tree, you need to compute the length of the diameter of the tree. The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.

Example:
Given a binary tree

          1
         / \
        2   3
       / \     
      4   5    

Return 3, which is the length of the path [4,2,1,3] or [5,2,1,3].

Note: The length of path between two nodes is represented by the number of edges between them. 



For every node, length of longest path which pass it = MaxDepth of its left subtree + MaxDepth of its right subtree.

public class Solution {
    int max = 0;
    
    public int diameterOfBinaryTree(TreeNode root) {
        maxDepth(root);
        return max;
    }
    
    private int maxDepth(TreeNode root) {
        if (root == null) return 0;
        
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        
        max = Math.max(max, left + right);
        
        return Math.max(left, right) + 1;
    }
}



/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
int max=0;
int maximum(int a,int b){
    return a>b?a:b;
}
int diameterOfBinaryTree(struct TreeNode* root) {
    max = 0;
    if(root==NULL)
        return 0;
    dia(root);
    return max;
}
int dia(struct TreeNode *root){
    if(root==NULL)
        return 0;
    int l = dia(root->left);
    int r = dia(root->right);
    max = maximum(max,l+r);
    printf("%d ",max);
    return maximum(l,r)+1;
}

