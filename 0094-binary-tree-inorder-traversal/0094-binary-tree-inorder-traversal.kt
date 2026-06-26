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
    val answer: MutableList<Int> = mutableListOf()

    fun inorderTraversal(root: TreeNode?): List<Int> {
        DFS(root)

        return answer
    }

    fun DFS(root: TreeNode?): Unit {
        if(root != null) {
            DFS(root.left)
            answer.add(root.`val`)
            DFS(root.right)   
        }
    }
}
