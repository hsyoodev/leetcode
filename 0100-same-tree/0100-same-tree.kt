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
    var isSame = true

    fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
        BFS(p, q)

        return isSame
    }

    fun BFS(p: TreeNode?, q: TreeNode?): Unit {
        if(p?.`val` != q?.`val`) {
            isSame = false

            return
        }

        if(p != null && q != null) {
            BFS(p.left, q.left)
            BFS(p.right, q.right)
        }
    }
}
