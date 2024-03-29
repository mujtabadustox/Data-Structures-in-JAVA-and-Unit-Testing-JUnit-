//Program to implement Queue fusing LinkedList.
public class QueueWithLinkedList{
	//class for elements.
	static class Node{
		int key;  //data value
		Node next;//points to next element in the queue. 
		
		public Node(int data){
			this.key=data;
			this.next=null;
		}
	}
	
	static int size;   //number of elements in the queue.
	static Node head;  //head of the queue i.e first element.
	
	public QueueWithLinkedList(){
		size=0;
		head=null;
	}

	//function to add elements in the queue.
	static public void enqueue(int number){
		System.out.println("Inserting : " + number);
		Node node =new Node(number);

		//if queue is empty.
		if(head==null){
			head=node;
			size++;
			return;
		}

		Node temp= head;
		while(temp.next!=null){
			temp=temp.next;
		}
		temp.next=node;
		size++;
	}

	//function to delete elements from the queue.
	static public int dequeue(){
		System.out.println("Dequeue Operation.");
		//if queue is empty.
		if(head==null){
			System.out.println("Empty queue.");
			return -1;
		}
		int temp = head.key;
		head=head.next;
		size--;
		return temp;
	}
		
	static public void display(){
		if(head==null){
			System.out.println("Empty queue.");
			return;
		}

		System.out.print("Queue : ");
		Node temp = head;
		while(temp!=null){
			System.out.print(temp.key + " ");		
			temp = temp.next;
		}
		System.out.println();
	}
	
	
}
	
		
