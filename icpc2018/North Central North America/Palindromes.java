/*
https://open.kattis.com/problems/kaleidoscopicpalindromes
*/

import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int count = b - a + 1;
		
		for (int i = a; i <= b; i++) {
			for (int j = 2; j <= c; j++) {
				if(!isPalindrome(toBase(i,j))) {
					count--;
					break;
				}
			}
		}
		
		System.out.print(count);
		scan.close();
	}
	
	public static String toBase(int number, int base) {
		String str = "";
		while(number != 0) {
			int temp = number % base;
			number = number / base;
			str = temp + str;
		}
		return str;
	}
	
	public static boolean isPalindrome(String str) {	
		return isPalindrome(str, 0, str.length()-1);
	}
	
	public static boolean isPalindrome(String str, int start, int end) {
		if(start >= end) {
			return true;
		}
		if(str.charAt(start) != str.charAt(end)) {
			return false;
		}
		return isPalindrome(str, start + 1, end - 1);
	}
}
