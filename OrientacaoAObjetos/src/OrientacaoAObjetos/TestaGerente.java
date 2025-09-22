/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package OrientacaoAObjetos;

/**
 *
 * @author Barbara
 */
public class TestaGerente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Gerente g = new Gerente();
        g.nome = "Barbara Brito";
        g.salario = 1000;
        
        System.out.println("Salario R$: " + g.salario);
 
        //aumento de 10%
        System.out.println("Aumentando o Salario em 10%");
        //chamando metodo
        g.aumentaSalario();
        System.out.println("Salario Com 10% de aumento: R$ " + g.salario);
        
         System.out.println();
         
         //aumento de 30% com taxa variavel
        System.out.println("Aumentando o Salario em 30%");
        //chamando metodo
        g.aumentaSalario(0.3);
        System.out.println("Salario Com 30% de aumento: R$ " + g.salario); 
    }
    
}
