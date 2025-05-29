/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinicamedica;

/**
 *
 * @author gabri
 */
import java.util.ArrayList;
public class ClinicaMedica {
    
    private String nome;
    private String endereco;
    private String regCrm;
    private String cnpj;
    ArrayList<Pessoa> funcionarios;

    public ClinicaMedica(String nome, String endereco, String regCrm, String cnpj, ArrayList<Pessoa> funcionarios) {
        this.nome = nome;
        this.endereco = endereco;
        this.regCrm = regCrm;
        this.cnpj = cnpj;
        this.funcionarios = funcionarios;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getRegCrm() {
        return regCrm;
    }

    public void setRegCrm(String regCrm) {
        this.regCrm = regCrm;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public ArrayList<Pessoa> getFuncionarios() {
        return funcionarios;
    }

    public boolean addFuncionarios(Pessoa funcionario) {
        if(funcionario instanceof Medico || funcionario instanceof Secretario){
             this.funcionarios.add(funcionario);
             return true;
        }else{
            return false;
        }
    }

    public boolean setFuncionarios(ArrayList<Pessoa> funcionarios) {
        for(Pessoa funcionario : funcionarios){
            if(!(funcionario instanceof Medico || funcionario instanceof Secretario)){
             return false;
           }
        }
        this.funcionarios = funcionarios;
        return true;
    }
    
    
    
}
