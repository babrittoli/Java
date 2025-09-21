/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package OrientacaoAObjetos;

/**
 *
 * @author Barbara
 */
public class TestaTudo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Agencia ag1 = new Agencia();
        Cliente c1 = new Cliente();
        ContaBancaria cb1 = new ContaBancaria();
        CartaoDeCredito cdc1 = new CartaoDeCredito();
        
        c1.codigo = 1;
        c1.nome = "BARBARA BRITO";
        ag1.numero = 1234;
        
        cb1.numero = 1234;
        cb1.saldo = 1000;
        cb1.limite = 500;
        
        cdc1.numero = 1111;
        cdc1.dataValidade = "01/01/2025";
      
       
       System.out.println("Agencia: " + ag1.numero);
       System.out.println("Codigo do Cliente: " + c1.codigo);
       System.out.println("Nome do Cliente: " + c1.nome);
       System.out.println("Numero da Conta do Cliente: " + cb1.numero);
       System.out.println("Saldo da Conta do Cliente: " + cb1.saldo);
       System.out.println("Limita da Conta do Cliente: " + cb1.limite);
       System.out.println("Numero do Cartao de Credito do Cliente: " + cdc1.numero);
       System.out.println("Data de Validade do Cartao de Credito do Cliente: " + cdc1.dataValidade);
    }
    
}
