package patterns;
import java.util.Scanner;
public class Pattern30 {
 public static void main(String[] args) 
 {
	 int n = 5;
	 for(int i=1; i<=n; i++) 
	 {
		 for(int j=1; j<=(n-i); j++) 
		 {
			 System.out.print("  ");
		 }
		 int num=0;
		 for(int k=1; k<=(2*i)-1; k++) 
		 {
			 if(k <= (2*i)/2 )        
				 System.out.print((++num)+" ");
			 else
				 System.out.print((--num)+" ");
		 }
		 System.out.println();
	 }
	 for(int i=n-1; i>=1; i--) 
	 {
		 for(int j=1; j<=(n-i); j++) 
		 {
			 System.out.print("  ");
		 }
		 int num=0;
		 for(int k=1; k<=(2*i)-1; k++) {             
           
			 if(k <= (2*i)/2 )        
                             
				 System.out.print((++num)+" ");                
                       
			 else               
				 System.out.print((--num)+" ");               
		 }	
		 System.out.println();
        }
    }
}
