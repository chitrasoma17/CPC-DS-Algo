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

class KDistanceFromRoot
{
    int height(Node root){
        if(root==null)
            return 0;
        return 1+Math.max(height(root.left), height(root.right));
    } 
    
    void printKdistanceUtility(Node root, int k, int level, int h){
        if(root==null||level>h)
            return;
        if(level==k){
            System.out.print(root.data+" ");
            return;
        }
            
        if(root.left!=null)
            printKdistanceUtility(root.left, k, level+1, h);
        if(root.right != null)
            printKdistanceUtility(root.right, k, level+1, h);
    }
     // Recursive function to print right view of a binary tree.
     void printKdistance(Node root, int k)
     {
        int h = height(root);
        printKdistanceUtility(root, k, 0, h);
     }
}
