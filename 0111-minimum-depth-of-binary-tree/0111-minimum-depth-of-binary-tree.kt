/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun minDepth(root: TreeNode?): Int {
        if(root == null) {
            return 0
        }

        val left = minDepth(root.left)
        val right = minDepth(root.right)

        return when {
            root.left == null   -> 1 + right
            root.right == null  -> 1 + left
            else                -> 1 + minOf(left, right) 
        }
    }
}
