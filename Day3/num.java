/*Write a program to print numbers from 1 to n.*/

package Day3;

import java.util.Scanner;

public class num {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for (int i = 1; i <=n; i++) {
            System.out.println(i);
        }

    }
}
