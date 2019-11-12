/*
https://open.kattis.com/problems/lipschitzconstant
*/

import java.util.Scanner;
import java.util.Arrays;

public class Solution {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in); 
        int total = scan.nextInt();
        
        double retval = 0;
        double[][] array = new double[total][2];
        
        for(int i = 0 ; i < total; i ++) {
            array[i][0] = scan.nextDouble();
            array[i][1] = scan.nextDouble();
        }
        
        Arrays.sort(array,new java.util.Comparator<double[]>() {
            public int compare(double[] a, double[] b) {
                return Double.compare(a[0], b[0]);
            }
        });
        
        for(int j = 0 ; j < total - 1 ; j ++) {
        	
        	double x = array[j][0] - array[j+1][0];
        	double y = array[j][1] - array[j+1][1];
        	
        	if(x * y < 0) {
        		x = 0 - x;
        	}
        	
        	if(retval < y/x) {
        		retval = y/x;
        	}
        }
        
        System.out.print(retval);
        
    }
}
