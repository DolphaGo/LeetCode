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
        head?.next = removeElements(head?.next, `val`)
        return if(head?.`val` == `val`) head?.next else head
    }
}