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
public class Medico extends Pessoa {
    
    private String numeroCrm;
    private String tempInicial;
    private String tempFinal;
    private ArrayList<PlanoSaude> planoSaude;
    private Especialidade especialidade;
    private double salario;

    public Medico(String nome, String endereco, String telefone, String cpf,String numeroCrm, String tempInicial, String tempFinal, ArrayList<PlanoSaude> planoSaude, Especialidade especialidade,double salario) {
        super(nome,endereco,telefone,cpf);
        this.numeroCrm = numeroCrm;
        this.tempInicial = tempInicial;
        this.tempFinal = tempFinal;
        this.planoSaude = planoSaude;
        this.especialidade = especialidade;
        this.salario = salario;
    }

    public String getNumeroCrm() {
        return numeroCrm;
    }

    public void setNumeroCrm(String numeroCrm) {
        this.numeroCrm = numeroCrm;
    }

    public String getTempInicial() {
        return tempInicial;
    }

    public void setTempInicial(String tempInicial) {
        this.tempInicial = tempInicial;
    }

    public String getTempFinal() {
        return tempFinal;
    }

    public void setTempFinal(String tempFinal) {
        this.tempFinal = tempFinal;
    }

    public ArrayList<PlanoSaude> getPlanoSaude() {
        return planoSaude;
    }

    public void setPlanoSaude(ArrayList<PlanoSaude> planoSaude) {
        this.planoSaude = planoSaude;
    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }


    public double getSalario() {
        return salario;
    }

    public boolean setSalario(double salario) {
        if(salario<=0){
            return false;
        }
        this.salario = salario;
        return true;
    }
    
    
    public void realizarConsulta(Consulta consulta,String prescricao){
        consulta.setPrescricao(prescricao);
    }
    
}
