
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int[]numbers = {1,6,3,4,5};
	boolean bool1= false;
		for (int i = 0; i <numbers.length ; i++) {
			if (i !=numbers.length-1) {
				if (numbers[i] == numbers[i + 1]) {
					bool1 = true;
				}
			}

		}
		if (bool1 == true){
			System.out.println("Да");
		}else {
			System.out.println("Нет");
		}
    }
}
