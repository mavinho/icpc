/*
https://open.kattis.com/problems/rationalratio
*/

import java.util.Scanner;
import java.util.Arrays;

public class Solution {
    
    public static void main(String[] args) {
        
    	Scanner scan = new Scanner(System.in); 
        String total = scan.next();
        int repeat = scan.nextInt();
        int dot = total.indexOf('.');
        long gcd = 0;
        
        String first = total.substring(0,dot);
        String second = total.substring(dot+1, total.length());
        String sub = total.substring(dot+1, total.length() - repeat);
        String deno = "";
        
        for(int i = 0 ; i < repeat ; i++) {
        	deno = deno + "9";
        }
        
        for(int i = 0 ; i < sub.length(); i++) {
        	deno = deno + "0";
        }
        
        long number = Long.parseLong(first);
        long numerator = Long.parseLong(second);
        long denominator = Long.parseLong(deno);
        
        if(sub.length() != 0) {
        	numerator = numerator - Long.parseLong(sub);
        }
        
        if(numerator == 0) {
        	denominator = 1;
        } else {
        	gcd = gcd(numerator, denominator);
        	numerator = numerator / gcd;
        	denominator = denominator / gcd;
        }
        
        System.out.print((denominator * number + numerator) + "/" + denominator);
        scan.close();
    
    }
    
    public static long gcd(long a, long b) {
    	if(a == 0) {
            return b;
        }
    	return gcd(b % a, a);
    }
}
