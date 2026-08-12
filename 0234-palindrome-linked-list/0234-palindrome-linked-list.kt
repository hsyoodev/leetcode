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
    fun isPalindrome(head: ListNode?): Boolean {
        val arrayDeque1 = ArrayDeque<Int>()
        val arrayDeque2 = ArrayDeque<Int>()
        var node = head

        while(node != null) {
            arrayDeque1.addFirst(node.`val`)
            arrayDeque2.addLast(node.`val`)
            node = node.next
        }          

        return arrayDeque1 == arrayDeque2
    }
}
