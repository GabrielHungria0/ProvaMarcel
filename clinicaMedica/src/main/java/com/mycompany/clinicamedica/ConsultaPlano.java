/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinicamedica;

/**
 *
 * @author gabri
 */
public class ConsultaPlano extends Consulta {
    private PlanoSaude planoSaude;

    public ConsultaPlano(PlanoSaude planoSaude, Paciente paciente, Medico medico, Secretario secretario, String horaConsulta) {
        super(paciente, medico, secretario, horaConsulta);
        this.planoSaude = planoSaude;
    }
    
    public PlanoSaude getPlanoSaude() {
        return planoSaude;
    }

    public void setPlanoSaude(PlanoSaude planoSaude) {
        this.planoSaude = planoSaude;
    }
    
    
    
}
