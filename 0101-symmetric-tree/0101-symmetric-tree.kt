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
    val bfs1: MutableList<Int?> = mutableListOf()
    val bfs2: MutableList<Int?> = mutableListOf()

    fun isSymmetric(root: TreeNode?): Boolean {
        return isSame(root?.left, root?.right)
    }

    fun isSame(left: TreeNode?, right: TreeNode?): Boolean {
        if (left == null && right == null) {
            return true
        }
        if (left == null || right == null) {
            return false
        }
        return left.`val` == right.`val` && isSame(left.left, right.right) && isSame(right.left, left.right)
    }
 }
 