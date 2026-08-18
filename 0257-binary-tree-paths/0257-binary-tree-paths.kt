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
    val list = mutableListOf<String>()

    fun binaryTreePaths(root: TreeNode?): List<String> {
        if(root?.left != null) {
            setLeafPath(root?.left, root?.`val`.toString())
        }

        if(root?.right != null) {
            setLeafPath(root?.right, root?.`val`.toString())
        }

        if(list.isEmpty()) {
            list.add(root?.`val`.toString())
        }

        return list
    }

    fun setLeafPath(root: TreeNode?, path: String): Unit {
        if(root?.left == null && root?.right == null) {
            list.add((path + "->" + root?.`val`))
        } else {
            if(root?.left != null) {
                setLeafPath(root?.left, (path + "->" + root?.`val`))
            } 
        
            if(root?.right != null) {
                setLeafPath(root?.right, (path + "->" + root?.`val`))
            }
        }
    }
}
