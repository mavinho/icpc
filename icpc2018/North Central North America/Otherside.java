package icpc;

import java.util.Scanner;

public class solution {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int w = scan.nextInt();
		int s = scan.nextInt();
		int c = scan.nextInt();
		int k = scan.nextInt();
		
		int f = w + c;
		
		if(k == 0) {
			System.out.print("NO");
		}
		
		else if(f < k || s < k) {
			System.out.print("YES");
		}
		
		else if(f > k && s > k) {
			System.out.print("NO");
		}
		
		else if(f == k) {
			if(s <= 2 * k) {
				System.out.print("YES");
			}
			else {
				System.out.print("NO");
			}
		}
		
		else if(s == k) {
			if(f <= 2 * k) {
				System.out.print("YES");
			}
			else {
				System.out.print("NO");
			}
		}
		
		scan.close();
	}
}
