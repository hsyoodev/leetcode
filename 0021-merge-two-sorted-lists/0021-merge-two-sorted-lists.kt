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
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        val items: MutableList<Int> = mutableListOf()

        list1?.let {
            var nextNode: ListNode? = list1.next
            items.add(it.`val`)

            while(nextNode != null) {
                items.add(nextNode.`val`)
                nextNode = nextNode.next
            }            
        }

        list2?.let {
            var nextNode: ListNode? = list2.next
            items.add(it.`val`)

            while(nextNode != null) {
                items.add(nextNode.`val`)
                nextNode = nextNode.next
            }
        }

        if(items.isNotEmpty()) {
            items.sort()

            val answer = ListNode(items[0])
            var nextNode: ListNode? = null

            items.forEachIndexed {index, item -> 
                if(index == 1) {
                    answer.next = ListNode(item)
                    nextNode = answer.next
                } else if(index >= 2) {
                    nextNode?.next = ListNode(item)
                    nextNode = nextNode?.next
                }
            }

            return answer
        }

        return null
    }
}