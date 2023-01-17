package HumanCloude;

import java.util.Scanner;

public class MyStack {

	int[] stack=new int[5];
	int top=-1;
	Scanner sc =new Scanner(System.in);

	void push() {
		int data;
		System.out.println("Enter the Data: ");
		data=sc.nextInt();
		if(top==stack.length-1)
		{
			System.out.println("Overflow");
		}
		else
		{
			top++;
			stack[top]=data;

		}

	}
	void pop()
	{
		int item;
		if(top==-1)
		{
			System.out.println("UnderFlow");
		}
		else
		{
			item=stack[top];
			top--;
			System.out.println("Element:"+item);
		}
	}

	void peak()
	{
		if(top==-1)
		{
			System.out.println("Stack is empty");
		}
		else
		{
			System.out.println("Element is :"+stack[top]);
		}
	}
	void display()
	{
		for(int i=top;i>=0;i--)
		{
			System.out.println("Element: "+stack[i]);
		}
	}
}
