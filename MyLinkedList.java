package HumanCloude;

import java.util.Scanner;

public class MyLinkedList {

	Scanner sc  = new Scanner(System.in);
	int data;
	Node head;
	public void insert() {
		System.out.println("Enter the data");
		data = sc.nextInt();
		Node node = new Node();
		node.data = data;
		node.next = null;
		if(head==null) {
			head = node;
		}
		else {
			Node n = head;
			while(n.next!=null) {
				n = n.next;
			}
			n.next = node;
		}
	}
	public void insertAtStart() {
		System.out.println("Enter the data");
		Node node = new Node();
		node.data = data;
		node.next = null;
		node.next = head;
		head = node;
	}
	public void insertAtIndexPostion() {
		System.out.println("Enter the Index postion");
		data= sc.nextInt();
		int index= sc.nextInt();
		Node node = new Node();
		node.data = data;
		node.next = null;
		Node n = head;
		if(index==0) {
			insertAtStart();
		}
		for(int i=0; i<index-1; i++) {
			n = n.next;
		   }
			node.next = n.next;
			n.next=node;
		}
	public void deleteAt() {
		System.out.println("Enter the index postion");
		int index = sc.nextInt();
		if(index==0) {
			head = head.next;
		}
		else {
			Node n = head;
			Node n1= null;
			for(int i=0; i<index-1; i++) {
				n = n.next;
			}
			n1 = n.next;
			n.next = n1.next;
			System.out.println("Delete element"+n1.data);
			n1=null;
		}
		
	}
	public void show() {
		Node node = head;
		while(node.next!=null) {
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	}
}
