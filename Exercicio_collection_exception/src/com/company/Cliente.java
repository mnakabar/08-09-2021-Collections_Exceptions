package com.company;

import java.time.LocalDate;

public class Cliente {


    private String nome;
    private LocalDate dataNascimento;

    public Cliente(String nome, LocalDate dataNascent) {
        super();
        this.nome = nome;
        this.dataNascimento = dataNascent;
    }
    public String getNome() {
        return nome;
    }
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }



}
