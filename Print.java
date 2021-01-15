package tube.tree;

import tube.tree.Fundamental.Node;

public class Print {

	 public static void inorder(Node node) {
		 if(node == null) {
			 return ;
		 }
		 inorder(node.left);
		 System.out.print(node.key+"  ");
		 inorder(node.right);
	 }
}
