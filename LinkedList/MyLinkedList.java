import java.io.*;

 class MyLinkedList {

	private static MyNode head;
	private static int numNodes;


	public MyLinkedList(Object data) {
		head = new MyNode(data);
	}

	public void addAtHead(Object data) {
		MyNode temp = head;
		head = new MyNode(data);
		head.next = temp;
		numNodes++;
	}



	public void addAtTail(Object data) {
		MyNode temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}

		temp.next = new MyNode(data);
		numNodes++;
	}

public void addAtIndex(int index, Object dat)
	{
		MyNode temp = head;
		MyNode holder;
		for(int i=0; i < index-1 && temp.next != null; i++)
		{
			temp = temp.next;
		}
		holder = temp.next;
		temp.next = new MyNode(dat);
		temp.next.next = holder;
		numNodes++;
	}
	
	public void deleteAtIndex(int index)
	{
		MyNode temp = head;
		for(int i=0; i< index - 1 && temp.next != null; i++)
		{
			temp = temp.next;
		}
		temp.next = temp.next.next;
		numNodes--;
	}
	
	public static int find(MyNode n)
	{
		MyNode t = head;
		int index = 0;
		while(t != n)
		{
			index++;
			t = t.next;
		}
		return index;
	}
	
	public static MyNode find(int index)
	{
		MyNode temp=head;
		for(int i=0; i<index; i++)
		{
			temp = temp.next;
		}
		return temp;
	}
		
	public static void printList()
	{
		MyNode temp = head;
		while(temp != null)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	public static int getSize()
	{
		return numNodes;
	}
	


}