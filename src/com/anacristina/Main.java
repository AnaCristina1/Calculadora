package com.anacristina;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc =new Scanner(System.in);
        double x, y;
        System.out.print("Ingresa la primera variable:");
        x = sc.nextDouble();
        System.out.print("Ingresa la segunda variable:");
        y = sc.nextDouble();
        System.out.print("x= ");
        System.out.print(x);
        System.out.print("\ny= ");
        System.out.print(y);
        System.out.print("\nSuma: ");
        System.out.print(x + y);
        System.out.print("\nResta: ");
        System.out.print(x - y);
        System.out.print("\nMultiplicacion: ");
        System.out.print(x * y);
        System.out.print("\nDivicion: ");
        System.out.print(x / y);
        System.out.print("\nModulo: ");
        System.out.print(x % y);
    }
}
