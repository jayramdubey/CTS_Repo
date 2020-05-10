package gs_day5;

import java.util.Scanner;

public class Delet_All_place {
	Node head;
	class Node{
		int data;
		Node next;
		Node(int num)
		{
			data=num;
			next=null;
		}
	}
	void push(int val)
	{
		Node new_node=new Node(val);
		if(head==null)
		{
			head=new_node;
			return;
		}
		new_node.next=null;
		Node tmp=head;
		while(tmp.next!=null){
			tmp=tmp.next;
		}
		tmp.next=new_node;
	}
	void Delet_first()
	{
		Node tmp;
		tmp=head.next;
		head=tmp;
	}
	void delet_pos(){
		Node tmp=head;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter position:->");
		int pos = sc.nextInt();
		for(int i=2;i<pos;i++)
		{
			tmp=tmp.next;
			
		}
		tmp.next=tmp.next.next;
		
		
	}
	void Delet_last(){
		if(head==null)
		{
			return;
		}
		Node tmp=head;
		while(tmp.next.next!=null){
			tmp=tmp.next;
		}
		tmp.next=null;
	}
	 
	void print(){
		Node tmp=head;
		System.out.print("Element of Link List:  ");
		while(tmp!=null){
			System.out.print(" "+tmp.data);
			tmp=tmp.next;
		}
		
	}

	public static void main(String[] args) {
		Delet_All_place ob =new Delet_All_place();
		
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Node for Insertion:->");
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int num=sc.nextInt();
			ob.push(num);
			
		}
		ob.Delet_last();
		ob.Delet_first();
		ob.delet_pos();
		ob.print();

	}

}
