/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HerancaExercicio;

/**
 *
 * @author Barbara
 */
public class Funcionario {
    private String nome;
    private double salario;
    
    public String getNome(){
        return this.nome;
    } 
    
    public double getSalario(){
        return this.salario;
    } 
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
     public void setSalario(double salario){
        this.salario = salario;
    }
    
    public double calculoBonificacao() {
        return this.salario * 0.1;
    }
    
    public void MostrarDados(){
        System.out.println("Nome: " + getNome());
        System.out.println("Salario : " + getSalario());
        System.out.println("Bonificacao: " + calculoBonificacao());
    }
}
