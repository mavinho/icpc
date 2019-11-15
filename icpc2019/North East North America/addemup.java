/*
https://open.kattis.com/contests/nena19open/problems/addemup
*/

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] array = new int[100000001];
        int total = scan.nextInt();
        int sum = scan.nextInt();
        int temp = 0;
        int contemp = 0;
        boolean find = false;

        for (int i = 0; i < total; i++) {
            temp = scan.nextInt();
            contemp = convert(temp);
            if(array[sum-temp] != 0) {
                find = true;
                break;
            } else if(array[sum-contemp] != 0) {
                find = true;
                break;
            }
            array[temp] = 1;
            array[contemp] = 1;
        }
        
        if (find)
            System.out.print("YES");
        else
            System.out.print("NO");
    }

    public static int convert(int number) {
        String str = "" + number;
        String retval = "";
        char ch;

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if (ch == '1')
                retval = '1' + retval;
            else if (ch == '2')
                retval = '2' + retval;
            else if (ch == '5')
                retval = '5' + retval;
            else if (ch == '6')
                retval = '9' + retval;
            else if (ch == '8')
                retval = '8' + retval;
            else if (ch == '9')
                retval = '6' + retval;
            else
                return 0;
        }
        return Integer.parseInt(retval);
    }
}
