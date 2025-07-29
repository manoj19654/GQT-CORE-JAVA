package patterns;
import java.util.Scanner;
public class Pattern37 {

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
			for(char ch=(char)('0'+i);ch>'0';ch--)
			{
				System.out.print(ch+"");
			}
			for(char ch='0';ch<=(char)('0'+i);ch++)
			{
				System.out.print(ch+"");
			}
			System.out.println();
		}

	}



	

	}


