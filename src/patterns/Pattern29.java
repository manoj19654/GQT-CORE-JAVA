package patterns;

import java.util.Scanner;

public class Pattern29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n-1;j++)
			{
				System.out.print(" ");
				
			}
			for(int z=1;z<=2*i-1;z++)
			{
				System.out.print(z+" ");
			}
			for(int y=1;y<=n-1;y++);
			{
			System.out.println();
		}
		sc.close();
	}

		

	



	}

}
