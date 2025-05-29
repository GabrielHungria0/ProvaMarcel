/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinicamedica;

/**
 *
 * @author gabri
 */
public class Especialidade {
    private String nome;
    private String numeroCrm;

    public Especialidade(String nome, String numeroCrm) {
        this.nome = nome;
        this.numeroCrm = numeroCrm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroCrm() {
        return numeroCrm;
    }

    public void setNumeroCrm(String numeroCrm) {
        this.numeroCrm = numeroCrm;
    }
    
    
}
