/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Heranca;

/**
 *
 * @author Barbara
 */
public class SeguroDeVeiculo extends Servico{
    private Cliente contratante; 
    private Funcionario responsavel; 
    private String dataContratacao;
    
    private Emprestimo veiculo; 
    private double valorDoSeguro; 
    private double franquia; 

    public double calculaTaxa(){
        return 5 + this.valorDoSeguro * 0.1;
    }

}
