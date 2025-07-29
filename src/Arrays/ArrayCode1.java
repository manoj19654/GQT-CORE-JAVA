package Arrays;
import java.util.Scanner;
public class ArrayCode1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Student count:");
		int n=sc.nextInt();
		
		//Creating the array to store n students marks
		int arr[]=new int[n];
		//Creating and storing marks of n students
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the marks of student no:"+(i+1));
			arr[i]=sc.nextInt();
		}
		System.out.println("------------");
		
		
		//Display the marks stored inside the array
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("The marks of students no:"+(i+1)+"is="+arr[i]);
			
		}
	}

}
