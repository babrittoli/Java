/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package OrientacaoAObjetos;

/**
 *
 * @author Barbara
 */
public class TestaAgencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Agencia ag1 = new Agencia();
        
        ag1.numero = 9876;
        
        Agencia ag2 = new Agencia();
        
        ag2.numero = 1234;
        
       System.out.println(ag1.numero);
       System.out.println();
       System.out.println(ag2.numero);
    }
    
}
