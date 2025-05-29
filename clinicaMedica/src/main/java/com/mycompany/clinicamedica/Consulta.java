/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinicamedica;

/**
 *
 * @author gabri
 */
abstract public class Consulta {
    
    private Paciente paciente;
    private Medico medico;
    private Secretario secretario;
    private String horaConsulta;
    private String prescricao;

    public Consulta(Paciente paciente, Medico medico, Secretario secretario, String horaConsulta) {
        this.paciente = paciente;
        this.medico = medico;
        this.secretario = secretario;
        this.horaConsulta = horaConsulta;
    }


    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Secretario getSecretario() {
        return secretario;
    }

    public void setSecretario(Secretario secretario) {
        this.secretario = secretario;
    }

    public String getHoraConsulta() {
        return horaConsulta;
    }

    public void setHoraConsulta(String horaConsulta) {
        this.horaConsulta = horaConsulta;
    }

    public String getPrescricao() {
        return prescricao;
    }

    public void setPrescricao(String prescricao) {
        this.prescricao = prescricao;
    }
    
    
    
    
}
