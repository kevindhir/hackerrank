/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    
    public List<Integer> rightSideView(TreeNode root) {
        Map<Integer, Integer> values = new HashMap<Integer, Integer>();
        List<Integer> out = new ArrayList<Integer>();
        Queue<TreeNode> nodes = new LinkedList<TreeNode>();
        Queue<Integer> depths = new LinkedList<Integer>();
        
        if(root == null){
            return out;
        }

        values.put(0, root.val);
        nodes.add(root);
        depths.add(0);
        
        
        while(!nodes.isEmpty()){
            TreeNode curr = nodes.remove();
            Integer depth = depths.remove();
            values.put(depth, curr.val);
            
            if(curr.left != null){
                nodes.add(curr.left);
                depths.add(depth+1);
            }
            
            if(curr.right != null){
                nodes.add(curr.right);
                depths.add(depth+1);
            }
            
            
        }
        
        Integer deepest = Collections.max(values.keySet());
        
        for(int i = 0; i <= deepest; i++){
            int curr = values.get(i);
            out.add(curr);
        }
        
        return out;
        
    }
}
