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
    fun hasPathSum(root: TreeNode?, targetSum: Int): Boolean {
        if(root == null) {
            return false
        }

        val sum = targetSum - root.`val`
        if(root.left == null && root.right == null && sum == 0) {
            return true
        }

        return hasPathSum(root.left, sum) || hasPathSum(root.right, sum)
    }
}
