
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		Scanner scan;
		scan = new Scanner(System.in);
	    int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
	    System.out.println(a*b*c*1000);
    }
}
