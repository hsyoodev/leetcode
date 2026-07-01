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
    fun sortedArrayToBST(nums: IntArray): TreeNode? {
        return build(nums, 0, nums.size - 1)
    }

    fun build(nums: IntArray, left: Int, right: Int): TreeNode? {
        if(left > right) {
            return null
        }

        val center = (left + right) / 2
        val root = TreeNode(nums[center])
        root.left = build(nums, left, center - 1)
        root.right = build(nums, center + 1, right)

        return root
    }
}
