package multi.best;

import java.util.Scanner;

public class MultiplyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sca=new Scanner(System.in);
         int startNo;
         int endNo;
         System.out.println("Enter Start Number:");
         startNo=sca.nextInt();
         System.out.println(startNo);
         System.out.println("Enter End Number:");
         endNo=sca.nextInt();
         System.out.println(endNo);
         for(int i=startNo;i<=endNo;i++) {
        	 for(int j=1;j<=12;j++) {
        		 int result=i*j;
        		 System.out.println(i + "*" + j + "=" + result);
        	 }
        	 System.out.print("\n");
         }
	}
}
