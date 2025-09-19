// Time Complexity : O(n)
// Space Complexity : O(h)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
We use DFS and perform level order traversal
When the size of list is same as level it means no nodes have been added yet so create a new list 
When the size of list isnt same as level we add the element into that left and then perform recursion on left and right childs until the root becomes null
*/
 class Solution {
    List<List<Integer>> result;
    public List<List<Integer>> levelOrder(TreeNode root) {
        this.result = new ArrayList<>();
        dfs(root, 0);
        return result;
    }

    private void dfs(TreeNode root, int level) {
        //base
        if (root == null) return;
        //logic
        if(result.size() == level) {
            //create new array list at this level
            result.add(new ArrayList<>());
        }
        result.get(level).add(root.val); //nodes already exists in that level add other nodes
        //traverse left
        dfs(root.left, level+1);
        //process right
        dfs(root.right, level+1);
    }
    
}
