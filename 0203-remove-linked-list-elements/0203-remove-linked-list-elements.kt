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
    fun removeElements(head: ListNode?, `val`: Int): ListNode? {
        var root = ListNode(0)
        root.next = head
        var nextHead1 = root
        var nextHead2 = head

        while(nextHead2 != null) {
            if(nextHead2?.`val` == `val`) {
                nextHead1?.next = nextHead2?.next
                nextHead2 = nextHead2?.next
            } else {
                nextHead1 = nextHead2
                nextHead2 = nextHead2?.next
            }
        }

        return root.next
    }
}
