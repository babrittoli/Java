/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Encapsulamento;

/**
 *
 * @author Barbara
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Funcionario f1 = new Funcionario();
        
        f1.setNome("Barbara Brito");
        f1.setSalario(2000);
        
        //System.out.println(f1.nome); //sem encapsulamento ou seja sem get/set
        System.out.println(f1.getNome()); //com encapsulamento ou seja com get/set
       // System.out.println(f1.salario); //sem encapsulamento ou seja sem get/set
        System.out.println(f1.getSalario()); //com encapsulamento ou seja com get/set
    }
    
    
}
