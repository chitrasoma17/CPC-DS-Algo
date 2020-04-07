/* A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
} */

class MaximumWidthBinaryTree
{
    // /* Function to get the maximum width of a binary tree*/
    void getMaxWidthUtility(Node root, Map<Integer, Integer>m, int level){
        
        if(root==null){
            return;
        }
        if(m.containsKey(level)){
            m.put(level, m.get(level)+1);
        }
        else if(!m.containsKey(level)){
            m.put(level, 1);
        }
        if(root.left!=null)
            getMaxWidthUtility(root.left, m, level+1);
        if(root.right!=null)
            getMaxWidthUtility(root.right, m, level+1);
            
    }
    
    int getMaxWidth(Node root)
    {
        if(root==null)
            return 0;
        Map<Integer, Integer> m = new TreeMap<>();
        int max = Integer.MIN_VALUE;
        
        getMaxWidthUtility(root, m, 1);
        
        for(Map.Entry<Integer, Integer>e:m.entrySet()){
            max=Math.max(e.getValue(), max);
        }
        
        return max;
    }		
}
