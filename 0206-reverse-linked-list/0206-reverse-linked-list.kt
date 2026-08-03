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
    fun reverseList(head: ListNode?): ListNode? {
        val list = mutableListOf<Int>()
        var node = head
        while(node != null) {
            list.add(node.`val`)
            node = node.next
        }

        val reverseList = ListNode(0)
        var node2 = reverseList
        for(i in (list.size - 1) downTo 0) {
            node2.next = ListNode(list[i])
            node2 = node2.next
        }

        return reverseList.next
    }
}
