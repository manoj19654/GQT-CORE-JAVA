package patterns;
import java.util.Scanner;
public class Pattern38 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size:");
		int n =sc.nextInt();
		char start='A';
		for (int i=0; i<n; i++)
		{
			for(int j=0; j<n-i-1;j++)
			{
				System.out.print(" ");
			}
			for(char ch=(char)('A'+i);ch>'A';ch--)
			{
				System.out.print(ch+"");
			}
			for(char ch='A';ch<=(char)('A'+i);ch++)
			{
				System.out.print(ch+"");
			}
			System.out.println();
		}

	}



	


	}

