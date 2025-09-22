/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HerancaExercicio;

/**
 *
 * @author Barbara
 */
public class Secretarias extends Funcionario{
    private int ramal;
    
    public int getRamal(){
        return this.ramal;
    } 
    
     public void setRamal(int ramal){
        this.ramal = ramal;
    }
    
    @Override
    public void MostrarDados(){
        super.MostrarDados();
        System.out.println("Ramal: " + getRamal());
        System.out.println("Bonificacao: " + calculoBonificacao());
    }
}

