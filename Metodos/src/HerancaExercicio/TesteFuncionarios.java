/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package HerancaExercicio;

/**
 *
 * @author Barbara
 */
public class TesteFuncionarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Gerente g = new Gerente();
        g.setNome("Barbara Brito");
        g.setSalario(2500.50);
        
        g.setUsuario("Barbara_Brito");
        g.setSenha("123456");
        
        
        Telefonistas t = new Telefonistas();
        t.setNome("Maria Alice");
        t.setSalario(3500);
        t.setEstacaoDeTrabalho(12);
        
        Secretarias s = new Secretarias();
        s.setNome("Ana Julia");
        s.setSalario(1500);
        s.setRamal(2221);
        
        System.out.println("Dados Gerente");
        g.MostrarDados();
        System.out.println();
        
        System.out.println("Dados Telefonista");
        t.MostrarDados();
        System.out.println();
        
        System.out.println("Dados Secretaria");
        s.MostrarDados();
    }   
}
