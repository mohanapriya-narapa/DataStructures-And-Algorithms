package Trees;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import cracking_the_coding_interview_chapter_four.ListOfDepths.TreeNode;

public class levelOrderList {
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
		System.out.println(levelOrderList(root));

	}
	private static List<List<Integer>> levelOrderList(TreeNode root) {
		if(root==null)
		return null;
		List<List<Integer>> res=new LinkedList<>();
		Queue<TreeNode> qu=new LinkedList<>();
		
		qu.add(root);
		while(!qu.isEmpty())
		{
			int size=qu.size();
			int[] arr=new int[size];
			for(int i=0;i<arr.length;i++)
			{
				TreeNode cur=qu.poll();
				arr[i]=cur.data;
if(cur.left!=null)qu.add(cur.left);
if(cur.right!=null)qu.add(cur.right);
				
			}
			List<Integer> temp=new LinkedList<>();
			for(int x:arr)
			{
				temp.add(x);
			}
			res.add(temp);
		}
		return res;
	}

}
