package multi.best;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
         Scanner sca=new Scanner(System.in);
         System.out.println("Enter the String");
         str=sca.nextLine();
         String replaceString=(str.charAt(str.length()-1)+str.substring(1,str.length()-1)+str.charAt(0));
         System.out.println("Exchange string is:"+replaceString);
         
	}

	
}
