package multi.best;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
       String operand;
       String calculate = null;
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Enter Number1");
       int num1=Integer.parseInt(br.readLine());
       System.out.println("Enter Number2");
       int num2=Integer.parseInt(br.readLine());
       System.out.println("Enter Operator");
       operand=br.readLine();
       System.out.println("Number 1 is:" + num1);
       System.out.println("Number 2 is:" + num2);
       System.out.println("Your operator is" + operand);
       switch(operand) {
       case "+":
    	   System.out.println("Result=" + (num1+num2));
    	   break;
       case "-":
    	   System.out.println("Result=" + (num1-num2));
    	   break;
       case "*":
    	   System.out.println("Result=" + (num1*num2));
    	   break;
       default:
    	   System.out.println("Result=" + (num1/num2));
       }
       
	}

}
