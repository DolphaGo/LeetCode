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
    fun preorderTraversal(root: TreeNode?): List<Int> {
            val result = ArrayList<Int>()
            go(root, result)
            return result
        }

    fun go(node: TreeNode?, result: ArrayList<Int>): Unit {
        if (node == null) {
            return
        }
        result.add(node.`val`)
        go(node.left, result)
        go(node.right, result)
    }
}