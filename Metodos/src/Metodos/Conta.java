/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos;

/**
 *
 * @author Barbara
 */
public class Conta {
    //métodos publicos e privados
    private double saldo;
    
    public void deposita(double valor) {
        this.saldo += valor;
        this.descontaTarifa();
    }
    
    public void saca(double valor) { //publico
        this.saldo -= valor;
        this.descontaTarifa();
    }
    
    private void descontaTarifa(){ //privado
        this.saldo -= 0.1;
    }
}
