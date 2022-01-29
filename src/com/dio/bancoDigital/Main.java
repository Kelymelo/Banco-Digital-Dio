package com.dio.bancoDigital;

public class Main {

    public static void main(String[] args) {

        Cliente kely = new Cliente();
        kely.setNome("Kely");


        Conta cc = new ContaCorrente(kely);
        cc.depositar(100);

        Conta poupanca = new ContaPoupanca(kely);

        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
