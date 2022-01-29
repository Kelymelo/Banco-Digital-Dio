package com.dio.bancoDigital.classes;

import lombok.Data;

@Data
public class Endereco {
    protected String logradouro;
    protected String bairro;
    protected String cidade;
    protected String estado;
    protected String pais;
}
