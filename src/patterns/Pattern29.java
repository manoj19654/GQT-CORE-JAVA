package patterns;

import java.util.Scanner;

public class Pattern29 {

	public static void main(String[] args) {
		 int n = 5;
	        for(int i=1; i<=n; i++) 
	        {
	          for(int j=1; j<=(n-i); j++) {
	              System.out.print("  ");
	            }
	             
	            int num=0;
	            for(int k=1; k<=(2*i)-1; k++) 
	            {  
	            	  if(k <= i) 
	            		  
		                    System.out.print((++num)+" ");
		                else
		                    
		                    System.out.print((--num)+" ");
		            }
	            System.out.println();
	        }
	    
	}
}
	 
	
	                     
	                   
	                    
	             
	           
	          