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
    val nodes = mutableListOf<Int>()

    fun preorderTraversal(root: TreeNode?): List<Int> {
        DFS(root)

        return nodes
    }

    fun DFS(root: TreeNode?): Unit {
        if(root == null) {
            return
        }

        nodes.add(root.`val`)

        DFS(root.left)
        DFS(root.right)
    }
}
