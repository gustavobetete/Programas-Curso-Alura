package com.company;

public class TestaMetodo {

    public static void main(String[] args) {

        Conta conta = new Conta();
        conta.saldo = 100;
        conta.deposita(50);
        System.out.println(conta.saldo);

        boolean conseguiuRetirar = conta.saca(20);
        System.out.println(conta.saldo);
        System.out.println(conseguiuRetirar);

        Conta contaMarcela = new Conta();
        contaMarcela.deposita(1000);

        boolean sucessoTransferencia = contaMarcela.transfere(220, conta);
        if(sucessoTransferencia){
            System.out.println("Transferencia feita com sucesso!");
        }else {
            System.out.println("Faltou dinheiro");
        }
        System.out.println(conta.saldo);
        System.out.println(contaMarcela.saldo);

        conta.titular.nome = "Gustavo Betete";
        System.out.println(conta.titular);
    }
}
