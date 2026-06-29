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
        BFS1(root?.left)
        BFS2(root?.right)

        return bfs1 == bfs2
    }

    fun BFS1(root: TreeNode?): Unit {
        bfs1.add(root?.`val`)

        if(root != null) {
            BFS1(root.left)
            BFS1(root.right)
        }
    }

    fun BFS2(root: TreeNode?): Unit {
        bfs2.add(root?.`val`)

        if(root != null) {
            BFS2(root.right)
            BFS2(root.left)
        }
    }
 }