/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrientacaoAObjetos;

/**
 *
 * @author Barbara
 */
public class ContaBancaria {
    int numero; 
    double saldo;
    double limite = 100;
    
    void deposita (double valor) {
        this.saldo += valor;
    }
    
    void saque (double valor) {
        this.saldo -= valor;
    }
    
    void imprimeExtrato () {
        System.out.println("Saldo : " + this.saldo);
    }
    
    double consultaSaldoDisponivel(){
        return this.saldo + limite;
    }
}
