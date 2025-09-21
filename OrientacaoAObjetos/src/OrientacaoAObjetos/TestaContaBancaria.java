/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package OrientacaoAObjetos;

/**
 *
 * @author Barbara
 */
public class TestaContaBancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ContaBancaria cb1 = new ContaBancaria();
        
        cb1.numero = 3216;
        cb1.saldo = 1000;
        cb1.limite = 500;
        
        ContaBancaria cb2 = new ContaBancaria();
        
        cb2.numero = 1234;
        cb2.saldo = 2000;
        cb2.limite = 250;
        
       System.out.println(cb1.numero);
       System.out.println(cb1.saldo);
       System.out.println(cb1.limite);
       System.out.println();
       System.out.println(cb2.numero);
       System.out.println(cb2.saldo);
       System.out.println(cb2.limite);
       
    }
    
}
