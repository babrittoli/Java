/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package OrientacaoAObjetos;

/**
 *
 * @author Barbara
 */
public class TestaCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Cliente c1 = new Cliente();
        
       c1.nome = "Barbara Brito";
       c1.codigo = 1;    
    
       Cliente c2 = new Cliente();
       c2.nome = "Pedro Cordeiro";
       c2.codigo = 2;    
       
       System.out.println(c1.nome);
       System.out.println(c1.codigo);
       System.out.println();
       System.out.println(c2.nome);
       System.out.println(c2.codigo);
    }
    
}
