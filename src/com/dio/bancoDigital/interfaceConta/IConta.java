package com.dio.bancoDigital.interfaceConta;

import com.dio.bancoDigital.classes.Conta;

public interface IConta {

    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, Conta contaDestino);

    void imprimirExtrato();
}
