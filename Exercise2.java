package multi.best;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		int index=0;
         Scanner sca=new Scanner(System.in);
         System.out.println("Enter the String");
         s=sca.nextLine();
         System.out.println(s);
         System.out.println("Enter you want to delete index number:");
         index=sca.nextInt();
         System.out.println(index);
         System.out.println(removeCharAt(s,index));
	}

	private static String removeCharAt(String s, int index) {
		// TODO Auto-generated method stub
		return s.substring(0, index) + s.substring(index + 1);
	}

}
