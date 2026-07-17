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
    val list = mutableListOf<Int>()

    fun postorderTraversal(root: TreeNode?): List<Int> {
        DFS(root)

        return list
    }

    fun DFS(root: TreeNode?): Unit {
        if(root == null) {
            return
        }

        postorderTraversal(root.left)
        postorderTraversal(root.right)
        list.add(root.`val`)
    }
}
