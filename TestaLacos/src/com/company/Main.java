package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        for (int multiplicador = 1; multiplicador <= 10 ; multiplicador++) {
            for (int contador = 0; contador <= 10 ; contador++) {
                System.out.print(multiplicador * contador);
                System.out.printf(" ");

            }
            System.out.println();
        }
    }
}
