/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MetodosPackage;

/**
 *
 * @author Barbara
 */
public class Funcionario {
    String nome;
    double salario;
    
    void aumentoSalario(double percAumento){
        this.salario = this.salario + (this.salario * percAumento);
    }
    
    void mostraDadosFuncionario(){
        System.out.println("Nome " + this.nome);
        System.out.println("Salario " + this.salario);
    }
}
