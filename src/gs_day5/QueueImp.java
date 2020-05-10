package gs_day5;


public class QueueImp {
	int max=10;
    int f=-1,r=-1;
   int que[]=new int[max];
   void enqueue(int val){
	   if(r==max-1){
		   System.out.println("overflow");
	   }
	   if(f==-1){
		   f=r=0;
		   que[r]=val;
	   }
	   else{
		   //r=r+1;
		   que[++r]=val;
	   }
   }
   int dqueue(){
	   int num=0;
	   if(f==-1){
		   System.out.println("Empty");
	   }
	   if(f==r){
		   num=que[f];
		   f=r=-1;
	   }
	   else{
		   num=que[f++];
		   //f=f+1;
	   }
	return num;
   }
    void print(){
    	for(int i=0;i<=r;i++){
    		System.out.print(" "+que[i]);
    	}
    }
	public static void main(String[] args) {
		
		QueueImp ob = new QueueImp();
		ob.enqueue(5);
		ob.enqueue(10);
		ob.enqueue(15);
		ob.enqueue(25);
		ob.print();
		System.out.println();
		System.out.println("Dqueue element are: ");
		System.out.print(" "+ob.dqueue());
		System.out.print(" "+ob.dqueue());
	}

}
