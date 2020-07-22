package multi.best;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s;
         Scanner sca=new Scanner(System.in);
         System.out.println("Enter the String");
         s=sca.nextLine();
         char last = s.charAt(s.length() -1);
         String oldString=last+s+last;
         System.out.println("New String is:"+oldString);
	}
}
