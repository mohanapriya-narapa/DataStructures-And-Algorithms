package Graphs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {
	public static class Graph
	{
		private int v;
		private LinkedList<Integer> adj[];
		public Graph(int v)
		{
			this.v=v;
			this.adj=new LinkedList[v];
			for(int i=0;i<v;i++)
			{
				adj[i]=new LinkedList<>();
			}
		}
		public void addEdge(int v, int w)
		{
			adj[v].add(w);
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Graph g=new Graph(4);
g.addEdge(0,1);
g.addEdge(0,2);
g.addEdge(1,2);
g.addEdge(2,0);
g.addEdge(2,3);
g.addEdge(3,3);
bfs(2, g);


	}

	private static void bfs(int s, Graph g) {
		// TODO Auto-generated method stub
		boolean[] visited=new boolean[g.v];
		Queue<Integer> qu=new LinkedList<Integer>();
		visited[s]=true;
		qu.add(s);
		while(!qu.isEmpty())
		{
			s=qu.poll();
			System.out.println(s);
			Iterator<Integer> i=g.adj[s].listIterator();
			while(i.hasNext())
			{
				int n=i.next();
				if(!visited[n])
				{
					visited[n]=true;
					qu.add(n);
				}
			}
			
		}
		
		
	}

}
