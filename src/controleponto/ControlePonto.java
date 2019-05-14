/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleponto;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author ANDERSON
 */
public class ControlePonto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gerente Anderson = new Gerente();
        Secretaria Janaina = new Secretaria();
        Operador Jose = new Operador();
        RegistroPonto a = new RegistroPonto();
        
        Anderson.setLogin("And");
        Anderson.setSenha("123");
        Anderson.setDocumento("123456");
        Anderson.setEmail("anderson@123");
        Anderson.setIdFunc(1);
        Anderson.setNome("Anderson");
        
        Janaina.setDocumento("1234");
        Janaina.setEmail("janaina@123");
        Janaina.setIdFunc(2);
        Janaina.setNome("Janaina");
        Janaina.setRamal("12344");
        Janaina.setTelefone("44444");

        Jose.setDocumento("121212");
        Jose.setEmail("jose@123");
        Jose.setIdFunc(3);
        Jose.setNome("Jose");
        Jose.setValorHora(5000);
        
        a.setFuncionario(Anderson);
        a.setDataRegistro(LocalDate.MIN);
        a.setHoraEntrada(LocalDateTime.MIN);
        a.setHoraSaida(LocalDateTime.MIN);
        a.apresentarRegistroPonto();
       
    }
    
}
