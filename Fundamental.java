package tube.tree;

import java.util.TreeMap;
import java.util.Vector;
import java.util.Map.Entry;
 
public class Fundamental
{
   
    static class Node
    {
        int key;
        Node left;
        Node right;
         
        
        Node(int data)
        {
            key = data;
            left = null;
            right = null;
        }
    }
     
   
   
    public static Node build() {
 
        // TO DO Auto-generated method stub
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.left.right = new Node(8);
        root.right.right.right = new Node(9);
        Print.inorder(root);
        //System.out.println(type +"is");
       // printVerticalOrder(root);
        return root;
    }
}