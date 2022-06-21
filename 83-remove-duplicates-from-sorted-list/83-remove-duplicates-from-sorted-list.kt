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
        var current = head
        while (current != null) {
            if (current.`val` == current?.next?.`val`) {
                current.next = current.next?.next
            }
            else current = current.next
        }
        return head
    }
}