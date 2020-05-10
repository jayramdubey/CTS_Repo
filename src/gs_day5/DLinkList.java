package gs_day5;

import java.util.Scanner;

public class DLinkList {
	Node head;
	 class Node
	 {
		int data;
		Node prev;
		Node next;
		Node(int val)
		{
			this.data=val;
			this.prev=null;
			this.next=null;
		}
	 }
	 
  void createNode(int val)
	 {
		 Node new_node=new Node(val);
		 if(head==null)
		 {
			 head=new_node;
			 new_node.prev=null;
			 new_node.next=null;
			 return;
		 }
		 Node tmp=head;
		 while(tmp.next!=null)
		 {
			tmp=tmp.next;
		 }
		 tmp.next=new_node;
		 new_node.prev = tmp;
		 new_node.next=null;
	  }
  void addInFirst(int val)
  {
	  Node new_node = new Node(val);
	  if(head==null)
	  {
		  head=new_node;
		  new_node.prev=null;
		  new_node.next=null;
		  return;
	  }
	  Node p=head;
	  head=new_node;
	  new_node.next=p;
	  new_node.prev=null;
  }
  void addInLast(int val)
  {
	  Node new_node=new Node(val);
	  if(head==null)
	  {
		  head=new_node;
		  new_node.prev=null;
		  new_node.next=null;
		  return;
	  }
	  Node tmp=head;
	  while(tmp.next!=null)
	  {
		  tmp=tmp.next;
	  }
	  tmp.next=new_node;
	  new_node.prev=tmp;
	  new_node.next=null;
  }
  void addInPos(int val)
  {
	  Scanner sc =new Scanner(System.in);
	  System.out.println("enter the position : ");
	  int pos=sc.nextInt();
	  Node tmp=head;
	  for(int i=1;i<pos;i++)
	  {
		  tmp=tmp.next;
		  System.out.println(i);
	  }
	  Node new_node=new Node(val);
	  Node p=tmp.next;
	  tmp.next=new_node;
	  new_node.prev=tmp;
	  new_node.next=p;
	  
  }
  void delInFirst()
     {
	  Node tmp=head;
      head =tmp.next;
     }
  void delInLast()
    {
	  Node tmp=head;
      while(tmp.next.next!=null)
      {
    	  tmp=tmp.next;
      }
      tmp.next=null;
    }
  void delInPosision()
    {
	  Node tmp=head;
	  Scanner sc =new Scanner(System.in);
	  System.out.println("enter the position : ");
	  int pos=sc.nextInt();
	  
	  for(int i=1;i<pos-1;i++)
	  {
		  tmp=tmp.next;
	  }
	  
      tmp.next=tmp.next.next;
    }
	 void print()
	 {
		 Node tmp=head;
		 System.out.println("Element of Link List is: ");
		 while(tmp!=null)
		 {
			 System.out.print(tmp.data+" ");
			 tmp=tmp.next;
		 }
		 System.out.println();
	 }

	public static void main(String[] args)
	{
		DLinkList ob=new DLinkList();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no element: ");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			int val=sc.nextInt();
			ob.createNode(val);
			
		}
		//ob.print();
		  System.out.println("enter the Choice \n"
		  		 +"1. Add in First Position \n"
				 +"2. Add in last Position \n" 
				 +"3. Add in Particuler Position \n"
				 +"4. Del in First Position \n"
				 +"5. Del in last Position \n" 
				 +"6. Del in Particuler Position \n"
				  );
		  int ch=sc.nextInt();
		switch(ch)
		{
		     case 1:
		    	    ob.addInFirst(55);
		 		    //ob.print();
		 		    break;
		     case 2:
		    	    ob.addInLast(56);
		 		    //ob.print();
		 		    break;
		     case 3:
		    	    ob.addInPos(69);
		 		   // ob.print();
		 		    break;
		     case 4:
		    	    ob.delInFirst();
		 		    //ob.print();
		 		    break;
		     case 5:
		    	    ob.delInLast();
		 		    //ob.print();
		 		    break;
		     case 6:
		    	    ob.delInPosision();
		 		    //ob.print();
		 		    break;
		     default:
		    	 System.out.println("Wrong choice: ");
		    	 
		    
		}

		ob.print();

	}

}
