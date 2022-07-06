package Trees;

import java.util.LinkedList;
import java.util.Queue;

import Trees.levelOrderList.TreeNode;

public class InvertBinaryTree {
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
invertTree(root);

	}
	private static TreeNode invertTree(TreeNode root) {
		// TODO Auto-generated method stub
		if(root==null)
		 return null;
		Queue<TreeNode> qu=new LinkedList<>();
		qu.add(root);
		while(!qu.isEmpty())
		{
			TreeNode cur=qu.poll();
			System.out.println(cur.data);
			TreeNode temp=cur.left;
			cur.left=cur.right;
			cur.right=temp;
			if(cur.left!=null)
			{
				qu.add(cur.left);
			}
			if(cur.right!=null)
			{
				qu.add(cur.right);
			}
		}return root;
	}

}
