package Trees;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import Trees.InvertBinaryTree.TreeNode;

public class SerializeAndDeserialize {
	public static class TreeNode
	{
		public int data;
		public TreeNode left;
		public TreeNode right;
		public TreeNode(int data)
		{
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=new TreeNode(3);
		TreeNode left=new TreeNode(9);
		TreeNode right=new TreeNode(20);
		TreeNode rightchild1=new TreeNode(15);
		TreeNode rightchild2=new TreeNode(7);
		root.left=left;
		root.right=right;
		right.left=rightchild1;
		right.right=rightchild2;
		System.out.println(Serialize(root));
		Deserilaize(Serialize(root));
System.out.println(Serialize(Deserilaize(Serialize(root))));

	}
	private static TreeNode Deserilaize(String str) {
		// TODO Auto-generated method stub
		String[] arr=str.split(",");
		List<String> nodes=new LinkedList<>(Arrays.asList(arr));
		return deserialize(nodes);
	}
	private static TreeNode deserialize(List<String> nodes) {
		if(nodes==null)
			return null;
		// TODO Auto-generated method stub
		if(nodes.get(0).equals("#"))
		{nodes.remove(0);
			return null;
		}
		int val=Integer.valueOf(nodes.get(0));
		nodes.remove(0);
		TreeNode root=new TreeNode(val);
		root.left=deserialize(nodes);
		root.right=deserialize(nodes);
		return root;
		
	}
	private static String Serialize(TreeNode root) {
		// TODO Auto-generated method stub
		if(root==null)
		{
			return "#";
		}
		StringBuilder sb=new StringBuilder();
		sb.append(String.valueOf(root.data));
		sb.append(",");
		sb.append(Serialize(root.left));
		sb.append(",");
		sb.append(Serialize(root.right));
		return sb.toString();
		
	}

}
