/**
 * 
 */
package NewPatternsAlphabets;

import java.util.Scanner;

/**
 * 
 */
public class GQT {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size:");
		int n=sc.nextInt();
		for (int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if((i==0 && j!=0) || (j==0 && i!=0 && i!=(n-1) ||
						(i==(n-1)&& j!=0 && j<(n-1)/2)) || 
						(i==(n-1)/2 && j>(n-1)/2 && j!=(n-1) ||
						(j==(n-1)/2 && i>=(n-1)/2 && i!=(n-1)) || 
						j==(n-1) && i>(n-1)/2)){
					System.out.print("* ");
				}else{
					System.out.print("  ");
				}
			}

			System.out.println();
		}
		System.out.println("\n");

for (int i=0;i<n;i++){
	for(int j=0;j<n;j++){
		if((j==0 && i!=0 && i<(3*(n)/4) || (j==(3*(n))/4) && i!=0 && i<(3*(n))/4)||
				(i==0 && j!=0 && j<(3*(n)/4) || (i==(3*(n))/4) && j!=0 && j<(3*(n))/4)||
				(i==j && j>=(n-1)/2)) {
			System.out.print("* ");
		}else{
			System.out.print("  ");
		}
	}

	System.out.println();
}
System.out.print("");
	


for (int i=0;i<n;i++){
	for(int j=0;j<n;j++){
		if(i==0||j==(n-1)/2) {
			System.out.print("* ");
		}else{
			System.out.print("  ");
		}
	}

	System.out.println();
}
System.out.print("");
	}
}
