/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Heranca;

/**
 *
 * @author Barbara
 */
public class Servico {
    private Cliente contratante; 
    private Funcionario responsavel; 
    private String dataContratacao; 
    
    public Servico(){
        System.out.println("Emprestimo");
    }
    
    public double calculaTaxa(){
        return 5;
    }
    
}

    
    
    
