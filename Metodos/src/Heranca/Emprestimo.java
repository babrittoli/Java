/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Heranca;

/**
 *
 * @author Barbara
 */
public class Emprestimo extends Servico{
    private Cliente contratante; 
    private Funcionario responsavel; 
    private String dataContratacao;
    
    private double valor;
    private double taxa;
    
    public Emprestimo(){
        System.out.println("Emprestimo");
    }
    
    //valor perc apenas
    //public double calculaTaxaEmprestimo(){
      //  return this.valor * 0.1;  
    //}
    
    //valor fixo + perc
    //public double calculatTaxa(){
        //return 5 + this.valor * 0.1 ;
    //}
    
    @Override
    public double calculaTaxa(){
        return super.calculaTaxa() + this.valor * 0.1;
    }
}
