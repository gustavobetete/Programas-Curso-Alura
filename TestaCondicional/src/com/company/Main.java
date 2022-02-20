package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos anos você tem?");
        int idade = sc.nextInt();
        System.out.println("Esta acompanhado ? quantas pessoas está junta com voce?");
        int quantidadePessoas = sc.nextInt();

        if (idade >= 18) {
            System.out.println("Voce é maior de idade");
        }else {
            if (quantidadePessoas >= 2) {
                System.out.println("Voce é menor mas pode entrar pois esta acompanhado");
            }else {
                System.out.println("Infelizmente voce não pode entrar");
            }
        }
    }
}
