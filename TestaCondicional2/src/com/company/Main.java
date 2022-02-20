package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos anos você tem?");
        int idade = sc.nextInt();
        int quantidadePessoas = 3;
        boolean acompanhado = quantidadePessoas >= 2;

        if (idade >= 18 && acompanhado) {
            System.out.println("Voce é maior de idade, pode entrar");
        }
        else {
                System.out.println("Infelizmente voce não pode entrar");

        }
    }
}
