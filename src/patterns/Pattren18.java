package patterns;
	import java.util.Scanner;
	public class Pattren18 {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the count");
			int n =sc.nextInt();
			int m = n;
			for(int i=m;i>=1;i--) {
			for(int j=1;j<=i;j++) {			
			System.out.print("*");
			}
			System.out.println();
			sc.close();


		}

	}
}
