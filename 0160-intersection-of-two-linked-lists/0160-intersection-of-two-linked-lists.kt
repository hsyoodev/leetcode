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

    fun getIntersectionNode(headA:ListNode?, headB:ListNode?):ListNode? {
        var nodeA = headA
        while(true) {
            if(nodeA == null) {
                break
            }

            set.add(nodeA)
            nodeA = nodeA.next
        }

        var nodeB = headB
        while(true) {
            if(nodeB == null) {
                break
            }

            if(set.contains(nodeB)) {
                return nodeB
            }
            
            nodeB = nodeB.next
        }

        return null
    }
}
