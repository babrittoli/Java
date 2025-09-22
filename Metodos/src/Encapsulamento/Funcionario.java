/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encapsulamento;

/**
 *
 * @author Barbara
 */
public class Funcionario {
    private String nome;
    private double salario;
    
    //trazendo os metodos de encapsulamento GET/SET os atributos tem que estar em privado
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
}
