package multi.best;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
       String str;
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Enter the String");
       str=br.readLine();
       char ch[] = str.toCharArray(); 
       for (int i = 0; i < str.length(); i++) { 
 
           if (i == 0 && ch[i] != ' ' ||  
               ch[i] != ' ' && ch[i - 1] == ' ') { 
 
              
               if (ch[i] >= 'a' && ch[i] <= 'z') { 
 
                  
                   ch[i] = (char)(ch[i] - 'a' + 'A'); 
                 
               } 
               else if (ch[i] >= 'A' && ch[i] <= 'Z')  
            	   
                   
                   ch[i] = (char)(ch[i] + 'a' - 'A');             
           } 
     
     } 
       String st = new String(ch); 
       System.out.print(st);
    } 
}


