/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleponto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 *
 * @author ANDERSON
 */
public class RegistroPonto {
    
    private long idRegPonto;
    private Funcionario funcionario;
    private LocalDate dataRegistro;
    private LocalDateTime horaEntrada;
    private LocalDateTime horaSaida;
    
   public void apresentarRegistroPonto(){
       
       
       LocalTime horaEntrada = LocalTime.now().minusMinutes(1);
       LocalTime horaSaida = LocalTime.now();

       
        System.out.println("Nome do Funcionario: " + this.funcionario.getNome());
        System.out.println("Dia do Registro: " + dataRegistro.getDayOfWeek().ordinal());
        System.out.println("Hora de entrada: " + horaEntrada.getHour() + ":" +horaEntrada.getMinute());
        System.out.println("Hora de saida " + horaSaida.getHour() + ":" + horaSaida.getMinute());
        
   }
    
    

    /**
     * @return the idRegPonto
     */
    public long getIdRegPonto() {
        return idRegPonto;
    }

    /**
     * @param idRegPonto the idRegPonto to set
     */
    public void setIdRegPonto(long idRegPonto) {
        this.idRegPonto = idRegPonto;
    }

    /**
     * @return the funcionario
     */
    public Funcionario getFuncionario() {
        return funcionario;
    }

    /**
     * @param funcionario the funcionario to set
     */
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    /**
     * @return the dataRegistro
     */
    public LocalDate getDataRegistro() {
        return dataRegistro;
    }

    /**
     * @param dataRegistro the dataRegistro to set
     */
    public void setDataRegistro(LocalDate dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    /**
     * @return the horaEntrada
     */
    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }

    /**
     * @param horaEntrada the horaEntrada to set
     */
    public void setHoraEntrada(LocalDateTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    /**
     * @return the horaSaida
     */
    public LocalDateTime getHoraSaida() {
        return horaSaida;
    }

    /**
     * @param horaSaida the horaSaida to set
     */
    public void setHoraSaida(LocalDateTime horaSaida) {
        this.horaSaida = horaSaida;
    }



    
}
