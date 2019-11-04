package icpc;

import java.util.Scanner;
import java.util.ArrayList;

public class solution {
    
    public static void main(String[] args) {
        
    	Scanner scan = new Scanner(System.in);
        int total = scan.nextInt();
        double sum = 0;
        double product = 1;
        
        if(total == 0) {
        	
        	System.out.print("1.0");
        	
        } else if(total < 20) {
        	
        	for(int i = 0 ; i <= total ; i++) {
        		
        		product = 1;
        		
        		if(i == 0) {
        			
        			sum += 1;
        			continue;
        			
        		}
        		
        		for(int j = 1 ; j <= i ; j++) {
        			
        			product *= j;
        			
        		}
        		sum += 1/product;
        	}
        	
        	System.out.print(sum);
        	
        } else {
        	
        	System.out.print("2.7182818284590455");
        	
        }
        
    }
    
}