package Arrays;
import java.util.Scanner;
 class ArrayOperations1 {
	int arr[];
	Scanner sc=new Scanner(System.in);
	void createArray() {
		System.out.println("Enter the student count:");
		int n=sc.nextInt();
		arr=new int[n];
		System.out.println("Array created");
		System.out.println("----------");
	}
	
	void collectData() {
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter marks of student no:"+(i+1));
			arr[i]=sc.nextInt();		}
	}
	void displayData() {
		for(int i=0;i<arr.length;i++) {
			System.out.println("The marks of student no:"+(i+1)+"is"+arr[i]);
		}
		}
	}
	public class ArrayOperations{
	public static void main(String[] args) {
		ArrayOperations1 a0=new ArrayOperations1();
		a0.createArray();
		a0.collectData();
		a0.displayData();
		

	} 

	
		
	}


