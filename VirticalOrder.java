package tube.tree;

import tube.tree.Fundamental.Node;


import java.util.*;

public class VirticalOrder {

	public static void main(String[] args) {
		
		Node node = Fundamental.build();
		System.out.println("Virtical order traversal is ");
		TreeMap<Integer,ArrayList<Integer>> mp = virticalOrder(node);
		printIt(mp);
		//printIt(mp);
		

	}

	private static void printIt(TreeMap<Integer, ArrayList<Integer>> mp) {
	if(mp== null )
	{
		System.out.println("Can't print anything");
	}
	else
		for(Map.Entry<Integer, ArrayList<Integer>> entry : mp.entrySet()) {
			ArrayList<Integer> ar = new ArrayList<>();
			ar = entry.getValue();
			for(int i : ar) {
				System.out.print(i+" ");
			}
			System.out.println();
			
		}
		
	}

	private static TreeMap<Integer,ArrayList<Integer>> virticalOrder(Node node) {
		if(node == null)
			return null;
		
		TreeMap<Integer,ArrayList<Integer>> mp = new TreeMap<>();
		mp.put(0, null);
		 vTraversal(mp,node,0);
		return mp;
	}

	private static void vTraversal(TreeMap<Integer, ArrayList<Integer>> mp, Node node, int pos) {
		if(node ==null)
			return ;
		
		ArrayList<Integer> ar = mp.get(pos);
				if(ar == null) {
			ar = new ArrayList<Integer>();
			
		}
		
		ar.add(node.key);
		
		mp.put(pos, ar);
		
		vTraversal(mp, node.left, pos-1);
		vTraversal(mp, node.right, pos+1);
		
		
		
	}

}
