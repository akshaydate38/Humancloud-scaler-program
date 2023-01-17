package HumanCloude;

import java.util.Scanner;

public class MyQueue {

	int[] queue=new int[5];
	int front=-1;
	int rear=-1;
	 
	Scanner sc=new Scanner(System.in);
	
	void enqueue()
	{
		int data;
		System.out.println("Enter the Data: ");
		data=sc.nextInt();
		if(rear==queue.length-1)
		{
			System.out.println("Queue is Full");
		}
		else if(front==-1 && rear==-1)
		{
			front=rear=0;
			queue[rear]=data;
		}
		else
		{
			rear=(rear+1)%queue.length;
			queue[rear]=data;
		}
	}
	void dequeue() {
		
		if(front==-1 && rear==-1)
		{
			System.out.println("Queue is Empty"); 
		}
		else if(front==rear)
		{
			front=rear=-1;
		}
		else
		{
			System.out.println("Deleted element:"+queue[front]);
			front=(front+1)%queue.length;
		}
	}
	void display() {
		
		if(front==-1 && rear==-1)
		{
			System.out.println("Queue is empty");
		}
		else
		{	System.out.println("Data is: ");
			for(int i=front;i<rear+1;i++)
			{
				System.out.println(queue[i]);
			}
		}
	}
	
	void peak()
	{
		if(front==-1 && rear==-1)
		{
			System.out.println("Queue is Empty");
		}
		else
		{
			System.out.println("peak element is"+queue[front]);
		}
	}

}
	

