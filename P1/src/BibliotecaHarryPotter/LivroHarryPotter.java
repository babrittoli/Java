/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BibliotecaHarryPotter;

/**
 *
 * @author Barbara
 */

public class LivroHarryPotter extends Livro{
   private String casaHogwarts; // Atributo privado

    // Get e Set para o atributo da classe (encapsulamento)
    public String getCasaHogwarts() {
        return casaHogwarts;
    }
    
    public void setCasaHogwarts(String casaHogwarts) {
        this.casaHogwarts = casaHogwarts;
    }
    
    //novo metodo da classe LivroHarryPotter
    public void feiticoFavorito(String feitico) {
        System.out.println("Feitico favorito: " + feitico);
    }
    
    // Sobrescrevendo método mostrarInfo() para adicionar o atributo casaHogwarts na hora de printar na tela 
    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); // Chamando o método da classe Livro - herança de metodos 
        System.out.println("Casa Hogwarts: " + casaHogwarts); // adicionando o print do atributo da Classe LivroHarryPotter
    }
    
    
}    
