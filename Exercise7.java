package multi.best;


import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String  str;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        str=sc.nextLine();
        int i=0;
        System.out.println("New String:");
        while(i!=str.length()) {
        	System.out.print(str.substring(i, i+2)+",");
        	i+=2;
        }
        
	}
}
