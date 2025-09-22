/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Heranca;

/**
 *
 * @author Barbara
 */
public class TestaServico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Emprestimo e = new Emprestimo();
        SeguroDeVeiculo sdv = new SeguroDeVeiculo();
        
        System.out.println("Emprestimo: " + e.calculaTaxa());
        System.out.println("Seguro do Veiculo: " + sdv.calculaTaxa());
    }
    
}
