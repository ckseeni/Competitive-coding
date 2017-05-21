/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
int tilt = 0;
int Tilt(struct TreeNode *root){
    if(root==NULL)
        return 0;
    int l = Tilt(root->left);
    int r = Tilt(root->right);
    int diff = abs(l-r);
    tilt = tilt + diff;
    printf("%d",diff);
    return l+r+root->val;
}
int findTilt(struct TreeNode* root) {
    tilt=0;
    Tilt(root);
    return tilt;
}
/*Given a binary tree, return the tilt of the whole tree.

The tilt of a tree node is defined as the absolute difference between the sum of all left subtree node values and the sum of all right subtree node values. Null node has tilt 0.

The tilt of the whole tree is defined as the sum of all nodes' tilt.

Example:

Input: 
         1
       /   \
      2     3
Output: 1
Explanation: 
Tilt of node 2 : 0
Tilt of node 3 : 0
Tilt of node 1 : |2-3| = 1
Tilt of binary tree : 0 + 0 + 1 = 1
*/
