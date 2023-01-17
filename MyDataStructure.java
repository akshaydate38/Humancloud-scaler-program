package HumanCloude;

import java.util.Scanner;

public class MyDataStructure {
	public static void main(String[] args) {
		int choice = -1;
		char str;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("1. Stack");
			System.out.println("2. Queue");
			System.out.println("3. Linked List");
			System.out.println("4. Array");
			System.out.println("5. Exit");
			System.out.println("Enter Your choice: ");

			choice = sc.nextInt();
			switch (choice) {

			case 1:
				System.out.println("The Stack Operation:");
				MyStack s = new MyStack();
				char str1;

				do {
					System.out.println("1. push");
					System.out.println("2. Pop");
					System.out.println("3. peek");
					System.out.println("4. display");
					System.out.println("5. Exit");

					System.out.println("In Which operation you have to perform:");
					int ch = sc.nextInt();
					switch (ch) {

					case 1:
						s.push();
						break;
					case 2:
						s.pop();
						break;
					case 3:
						s.peak();
						break;
					case 4:
						s.display();
						break;
					case 5:
						System.out.println("thank u...");
						break;
					default:
						System.out.println("Invalid intput");
					}
					System.out.println("Do you want to continue: ");
					str1 = sc.next().charAt(0);
				} while (str1 == 'y');
				break;

			case 2:
				System.out.println("The Stack Operation:");
				MyQueue queue = new MyQueue();
				char str2;

				do {
					System.out.println("1. Enqueue");
					System.out.println("2. Dequeue");
					System.out.println("3. peek");
					System.out.println("4. Exit");

					System.out.println("In Which operation you have to perform:");
					int ch = sc.nextInt();
					switch (ch) {

					case 1:
						queue.enqueue();
						break;
					case 2:
						queue.dequeue();
						break;
					case 3:
						queue.peak();
						break;
					case 4:
						System.out.println("Thank u...");
						break;
					default:
						System.out.println("Invalid intput");
					}

					System.out.println("Do you want to continue:{y/n} ");
					str2 = sc.next().charAt(0);
				} while (str2 == 'y');
				break;

			case 3:
				System.out.println("The LinkedList Operation");
				MyLinkedList linkedList = new MyLinkedList();
				char str3;
				do {
					System.out.println("1.Insert");
					System.out.println("2.InsertAtStart");
					System.out.println("3.InsertAt");
					System.out.println("4.Delete");
					System.out.println("5.Show");
					System.out.println("6.Exit");
					System.out.println("In Which operation you have to perform:");
					int ch = sc.nextInt();
					switch (ch) {
					case 1:
						linkedList.insert();
						break;
					case 2:
						linkedList.insertAtStart();
						break;
					case 3:
						linkedList.insertAtIndexPostion();
						break;
					case 4:
						linkedList.deleteAt();
						break;
					case 5:
						linkedList.show();
						break;
					case 6:
						System.out.println("Thank u...");
						break;
					default:
						System.out.println("The Invalid intput");
					}
					System.out.println("Do you want to continue:{y/n} ");
					str3 = sc.next().charAt(0);
				} while (str3 == 'y');

				break;
			case 4:
				System.out.println("The Array Operation");
				MyArray arr = new MyArray();
				char str4;
				do {
					System.out.println("1.Add");
					System.out.println("2.Remove");
					System.out.println("3.Display");
					System.out.println("4.Exit");
					System.out.println("In Which operation you have to perform:");
					int ch = sc.nextInt();
					switch (ch) {
					case 1:
						arr.add();
						break;
					case 2:
						arr.remove();
						break;
					case 3:
						arr.display();
						break;
					case 4:
						System.out.println("Thank u...");
						break;
					default:
						System.out.println("The Invalid intput");
					}

					System.out.println("Do you want to continue:{y/n} ");
					str4 = sc.next().charAt(0);
				} while (str4 == 'y');
				break;

			case 5:
				System.out.println("Thanks.....");
				break;
			default:
				System.out.println("The Invalid intput");
			}
			System.out.println("Do you want to Perform any Data structure operation:{y/n} ");
			str = sc.next().charAt(0);
			sc.close();
		} while (str == 'y');
	}
}
