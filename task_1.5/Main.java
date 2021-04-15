
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		Scanner scan;
		scan = new Scanner(System.in);
		int TC;
		double TF;
		TC = scan.nextInt();
		TF = (9.0/5.0) * TC +32.0;
		System.out.println(TF);
    }
}
