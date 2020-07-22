package multi.best;

import java.util.Arrays;

public class Exercise9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [] numbers= {10,22,25,30,40,45,50,55,60,5,8,2,1};
        int total=0;
        for(int i=0; i<numbers.length; i++) {
        	total=total+numbers[i];
        }
        int average=total/numbers.length;
        System.out.println("Array=" + Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("Sorted Array=" + Arrays.toString(numbers));
        System.out.println("Smallest Element=" + numbers[0]);
        System.out.println("2nd Smallest Element=" + numbers[1]);
        System.out.println("Largest Element=" + numbers[12]);
        System.out.println("2nd Largest Element=" + numbers[11]);
        System.out.println("Average=" + average);
        
        
      }
}
