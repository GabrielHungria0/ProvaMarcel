/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinicamedica;

/**
 *
 * @author gabri
 */
public class ConsultaParticular extends Consulta {
    private double valor;

    public ConsultaParticular(double valor,Paciente paciente, Medico medico, Secretario secretario, String horaConsulta) {
        super(paciente,medico,secretario,horaConsulta);
        this.valor = valor;    
    }
    
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
}
