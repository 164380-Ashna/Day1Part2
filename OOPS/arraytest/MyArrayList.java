package arraytest;

import java.util.Scanner;

public class MyArrayList extends MyLinkedList implements MyList {

	Scanner sc = new Scanner(System.in);

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("Enter the size of array that you want to enter");
		int size = sc.nextInt();
		int arr[] = new int[size + 1];
		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the element that you want to enter");
		int element = sc.nextInt();
		System.out.println("Enter the position where you want to enter");
		int position=sc.nextInt();
		for(int i=(size-1);i>(position-1);i--){
			
			arr[i+1]=arr[i];
		}
		arr[position-1]=element;
		System.out.println("After adding the element");
		for(int i=0;i<size;i++){
			System.out.println(arr[i]+ ", ");
		}
		System.out.println(arr[size]); 

	}

	@Override
	public void get(int result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void getAll() {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(int[] arr) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub

	}

}
