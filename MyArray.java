package HumanCloude;

import java.util.Scanner;

public class MyArray {

	Scanner sc = new Scanner(System.in);
	int arr[] = new int[6];
	int index =0;
	public void add() {
		System.out.println("Enter the element: ");
		int data = sc.nextInt();
		
		if(arr[0]==arr.length-1) {
			System.out.println("Array index is full");
		}
		else {
			arr[0] = data;
			index++;
		}
	}
	public void remove() {
		
	}
	public void display() {
		if(index == -1) {
			System.out.println("It is empty array: ");
		}
		else {
			System.out.println("Element are:");
			for(int i=0; i< arr.length-1; i++) {
				System.out.println(arr[index]);
			}
		}
	}
}
