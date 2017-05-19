package source;

import java.util.ArrayList;

public class Graph 
{
	ArrayList<Node> nodes = new ArrayList<>();
	
	public void addNode(int name)
	{
		Node temp = new Node(name);
		this.nodes.add(temp);
	}
	
	public void addEdge(int from,int to)
	{
		for(Node node : this.nodes)
		{
			if(node.name == from)
			{
				node.OutList.add(to);
			}
			if(node.name == to)
			{
				node.InList.add(from);
			}
		}
	}
	
	public void display()
	{
		for(Node node : this.nodes)
		{
			for(int to : node.OutList)
			{
				System.out.println(node.name+" ---> "+to);
			}
		}
	}

}
