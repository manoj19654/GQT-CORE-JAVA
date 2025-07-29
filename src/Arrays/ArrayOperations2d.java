package Arrays;

import java.util.Scanner;

public class ArrayOperations2d {	
	String arr[][];
	Scanner sc=new Scanner(System.in);
	void Createdisplay() {
		System.out.println("Enter class count:");
		int cls =sc.nextInt();
		System.out.println("Enter student count in each class:");
		int stu =sc.nextInt();
		arr=new String[cls][stu];
		System.out.println("Array created");
		System.out.println("--------------");
		}

		void CollectData() {
			for(int i=0;i<arr.length;i++) {
				System.out.println("Inside class no:"+(i+1));
			for(int j=0;i<arr.length;i++) {
				System.out.println("the name of student no:"+(j+1));
				
			}}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
