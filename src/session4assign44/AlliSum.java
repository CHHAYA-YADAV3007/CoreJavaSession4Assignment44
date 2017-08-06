/**
 * Allisum.java 
 * version  1.1
 * compiled on 6th August 2017
 */
package session4assign44;
/**
 * This program will find the aliquot sum of a given number and print all the number between 1 to 100
 * for which aliquot sum is equal to given number
 */
public class AlliSum {

public static void main(String[] args) {
		
		
	int n = 1 ;
		
	for (n=1 ; n<101 ; n++)	
		{	
		   int sum = 0;
		
		   for(int i= 1; i<n;i++)
		      {
			        if((n%i) == 0){
				       sum = sum + i ;
			        }
		       }
		
		
		   if (n == sum){
		    
			System.out.println(  n  + " is a PERFECT NUMBER. " ) ;
			
		   }
		
		
	     }
	}

}
