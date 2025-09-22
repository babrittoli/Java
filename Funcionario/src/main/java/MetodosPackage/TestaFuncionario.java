/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MetodosPackage;

/**
 *
 * @author Barbara
 */
public class TestaFuncionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Funcionario f1 = new Funcionario();
        
        f1.nome = "Barbara Brito";
        f1.salario = 2500.57;
        
        f1.aumentoSalario(10);
        f1.mostraDadosFuncionario();
    }
    
}
