package com.dio.bancoDigital.classes;

import lombok.Data;

@Data
public class Cliente {
    private String nome;
    protected Endereco endereco;
}
