/*
class Node
{
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */

class ZigZagTreeTraversal
{
	public void zigZagTraversal(Node root)
	{
	    Stack<Node> s1 = new Stack<>();
	    Stack<Node> s2 = new Stack<>();
	    
	    s1.push(root);
	    
	    while(!s1.empty() || !s2.empty()){
	        while(!s1.empty()){
	            Node temp = s1.pop();
	            System.out.print(temp.data+" ");
	            if(temp.left != null)
	                s2.push(temp.left);
	            if(temp.right!=null)
	                s2.push(temp.right);
	        }
	        while(!s2.empty()){
	            Node temp = s2.pop();
	            System.out.print(temp.data+" ");
	            if(temp.right!=null)
	                s1.push(temp.right);
	            if(temp.left != null)
	                s1.push(temp.left);
	        }
	    }
	    return;
	}
}