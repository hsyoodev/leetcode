/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    val set = mutableSetOf<ListNode>()

    fun hasCycle(head: ListNode?): Boolean {
        if(head == null) {
            return false
        }

        if(!set.add(head)) {
            return true
        }

        return true && hasCycle(head.next)
    }
}
