package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int contador = 0;
        int total = 0;

        while (contador <= 10){

            //total = total + contador;
            total += contador;
            contador++;
        }
        System.out.println(total);
    }
}
