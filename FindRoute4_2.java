package source;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class FindRoute4_2 {

	public static void main(String[] args) 
	{
		Graph G = new Graph();
		
		G.addNode(1);
		G.addNode(2);
		G.addNode(3);
		G.addNode(4);
		
		G.addEdge(1, 2);
		G.addEdge(1, 4);
		G.addEdge(1, 3);
		G.addEdge(2, 3);
		
		G.display();
		System.out.println("Route exists: "+RouteExists(G,2,4));
	}
	
	public static boolean RouteExists(Graph G, int source, int dest)
	{
		if(G.nodes.size() == 0)
			return false;
		
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(source);
		Set<Integer> visited = new HashSet<Integer>();
		
		while(!queue.isEmpty())
		{
			int current = queue.poll();
			visited.add(current);
			
			if(current == dest)
			{
				return true;
			}
			else
			{
				for(Node node : G.nodes)
				{
					if(node.name == current)
					{
						for(int edge : node.OutList)
						{
							if(!visited.contains(edge))
							{
								queue.offer(edge);
							}
						}
					}
				}
			}
		}
		
		
		return false;
	}

}
