package multi.best;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String str;
         String firstthreechars;
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the String");
         str=sc.nextLine();
         if(str.length()>3) 
         {
           firstthreechars=str.substring(0, 3); 
         }
         else {
              firstthreechars=str;
         }
        System.out.println("Added the first three characters in front and back:");
		System.out.println(firstthreechars + str + firstthreechars);
        	 
	}

}
