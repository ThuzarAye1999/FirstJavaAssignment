package multi.best;

import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int c,n,fact=1;
       Scanner sca=new Scanner(System.in);
       System.out.println("Enter an integer to calculate it's factorial");
       n=sca.nextInt();
       if(n<0) {
    	   System.out.println("Number should be non-negative");
       }
       else {
    	   for(c=1;c<=n;c++) {
    		   fact=fact*c;
    		  
    	   }
    	   System.out.println("Factorial of "+ n +" is:"+fact);
       }
	}

}
