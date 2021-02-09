package Tree;

import java.util.HashSet;

class Node { 
    int data; 
    Node left,right; 
    Node(int data) 
    { 
        this.data=data; 
    } 
}; 
public class DuplicateOfTwoSubtree {
public static void main(String[] args) {
	  Node root = new Node('A'); 
      root.left = new Node('B'); 
      root.right = new Node('C'); 
      root.left.left = new Node('D'); 
      root.left.right = new Node('E'); 
      root.right.right = new Node('B'); 
      root.right.right.right = new Node('E'); 
      root.right.right.left= new Node('D'); 
      String str = dupSub(root); 
      if(str.equals("")) 
          System.out.print(" Yes "); 
      else   
          System.out.print(" No "); 
}

private static String dupSub(Node root) {
	HashSet<String> hs = new HashSet<String>();
	return hel(root, hs);
	
}

private static String hel(Node root, HashSet<String> hs) {
String s="";
	
	
	if(root==null) {
		return s+"-1";
	}
	
	//s=s+root.data;
	
	String ls = hel(root.left, hs);
	  if (ls.equals(s)) 
          return s; 
	
	String rs = hel(root.right, hs);
	  if (rs.equals(s)) 
          return s; 
	
	s= s+root.data+ls+rs;
	
	if(s.length()>3 && hs.contains(s)) {
		return "";
	}
	
	hs.add(s);
	
	return s;
}
}
