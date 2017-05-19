package source;

import java.awt.List;
import java.util.ArrayList;

public class Node 
{
	ArrayList<Integer> InList;
	ArrayList<Integer> OutList;
	int name;
	
	Node(int name)
	{
		this.InList = new ArrayList<Integer>();
		this.OutList = new ArrayList<Integer>();
		this.name = name;
	}
}
