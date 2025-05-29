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
public class Secretario extends Pessoa{
    
    private double salario;
    private ArrayList<ConsultaPlano> consultaPlano = new ArrayList<>();
    private ArrayList<ConsultaParticular> consultaParticular = new ArrayList<>();


    public Secretario(String nome,String endereco,String telefone,String cpf,double salario) {
        super(nome,endereco,telefone,cpf);
        this.salario = salario;     
    }
    
    public double getSalario() {
        return salario;
    }

    public boolean setSalario(double salario) {
        if(salario<0){
            return false;
        }
        this.salario = salario;
        return true;
    }
    
    public boolean marcarConsulta(Paciente paciente,Medico medico,Secretario secretario,ConsultaParticular consulta,double valor,String horaConsulta){
        consulta = new ConsultaParticular(valor,paciente,medico,secretario,horaConsulta);
        consultaParticular.add(consulta);
        return true;
    }
    public boolean marcarConsulta(Paciente paciente,Medico medico,Secretario secretario,ConsultaPlano consulta,PlanoSaude plano,String horaConsulta){
       for(PlanoSaude planoS : medico.getPlanoSaude()){
           if(planoS.getCnpj().equals(plano.getCnpj())){
              consulta = new ConsultaPlano(plano, paciente, medico, secretario,horaConsulta);
              consultaPlano.add(consulta);
              return true;
           }
       }
       return false;
    }
    
    public ConsultaPlano encontrarConsultaPlano(String cpf){
        for(ConsultaPlano consulta : this.consultaPlano){
            if(consulta.getPaciente().getCpf().equals(cpf)){
                return consulta;
            }
        }
        return null;
    }
    
    public ConsultaParticular encontrarConsultaParticular(String cpf){
        for(ConsultaParticular consulta : this.consultaParticular){
            if(consulta.getPaciente().getCpf().equals(cpf)){
                return consulta;
            }
        }
        return null;
    }
    
    
}
