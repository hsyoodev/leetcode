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
    fun deleteDuplicates(head: ListNode?): ListNode? {
        var currNode: ListNode? = head

        while(currNode != null && currNode.next != null) {
            if(currNode.`val` == currNode.next?.`val`) {
                currNode.next = currNode.next?.next
            } else {
                currNode = currNode.next
            }
        }   

        return head     
    }
}
