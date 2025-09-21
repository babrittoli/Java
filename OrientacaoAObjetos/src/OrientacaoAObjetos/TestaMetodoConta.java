/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package OrientacaoAObjetos;

/**
 *
 * @author Barbara
 */
public class TestaMetodoConta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ContaBancaria cb1 = new ContaBancaria();
        
        cb1.deposita(1000);
        cb1.imprimeExtrato();
        
        cb1.saque(100);
        cb1.imprimeExtrato();
        
        double saldoDisponivel = cb1.consultaSaldoDisponivel();
        System.out.println("Saldo disponivel: " + saldoDisponivel);
    }
}
