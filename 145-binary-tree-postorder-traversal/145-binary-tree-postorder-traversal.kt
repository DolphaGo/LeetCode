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
    fun postorderTraversal(root: TreeNode?): List<Int> {
        val result: ArrayList<Int> = ArrayList()
        postOrder(root, result)
        return result
    }

    private fun postOrder(node: TreeNode?, result: ArrayList<Int>) {
        if (node == null) {
            return
        }
        postOrder(node.left, result)
        postOrder(node.right, result)
        result.add(node.`val`)
    }
}