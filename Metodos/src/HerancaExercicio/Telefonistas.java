/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HerancaExercicio;

/**
 *
 * @author Barbara
 */
public class Telefonistas extends Funcionario{
    private int estacaoDeTrabalho;
    
    public int getEstacaoDeTrabalho(){
        return this.estacaoDeTrabalho;
    } 
    
     public void setEstacaoDeTrabalho(int estacaoDeTrabalho){
        this.estacaoDeTrabalho = estacaoDeTrabalho;
    }
     
    @Override
    public void MostrarDados(){
        super.MostrarDados();
        System.out.println("Estacao de Trabalho: " + getEstacaoDeTrabalho());
        System.out.println("Bonificacao: " + calculoBonificacao());
    }
}
