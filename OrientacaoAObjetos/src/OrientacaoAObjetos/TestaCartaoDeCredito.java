/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package OrientacaoAObjetos;

/**
 *
 * @author Barbara
 */
public class TestaCartaoDeCredito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CartaoDeCredito cdc1 = new CartaoDeCredito();
        
        cdc1.numero = 1111;
        cdc1.dataValidade = "01/01/2025";
        
        CartaoDeCredito cdc2 = new CartaoDeCredito();
        
        cdc2.numero = 2222;
        cdc2.dataValidade = "02/02/2027";
        
        
       System.out.println(cdc1.numero);
       System.out.println(cdc1.dataValidade);
       System.out.println();
       System.out.println(cdc2.numero);
       System.out.println(cdc2.dataValidade);
    }
    
}
