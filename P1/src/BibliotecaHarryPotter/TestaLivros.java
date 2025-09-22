/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BibliotecaHarryPotter;

/**
 *
 * @author Barbara
 */
public class TestaLivros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //1- Harry Potter e a Pedra Filosofal
        LivroHarryPotter livro1 = new LivroHarryPotter();
        livro1.setTitulo("Harry Potter e a Pedra Filosofal");
        livro1.setAutor("J.K. Rowling");
        livro1.setAnoPublicacao(1997);
        livro1.setPaginas(223);
        livro1.setCasaHogwarts("Grifinoria");
        livro1.mostrarInfo(); // metodo sobrescrito de visibilidade
        livro1.feiticoFavorito("Expelliarmus"); // metodo 
        System.out.println();

        // 2 - Harry Potter e a Camara Secreta
        LivroHarryPotter livro2 = new LivroHarryPotter();
        livro2.setTitulo("Harry Potter e a Camara Secreta");
        livro2.setAutor("J.K. Rowling");
        livro2.setAnoPublicacao(1998);
        livro2.setPaginas(251);
        livro2.setCasaHogwarts("Sonserina");
        livro2.mostrarInfo(); // metodo sobrescrito de visibilidade
        livro2.feiticoFavorito("Lumus"); // metodo 
        System.out.println();

        // 3 - Harry Potter e o Prisioneiro de Azkaban
        LivroHarryPotter livro3 = new LivroHarryPotter();
        livro3.setTitulo("Harry Potter e o Prisioneiro de Azkaban");
        livro3.setAutor("J.K. Rowling");
        livro3.setAnoPublicacao(1999);
        livro3.setPaginas(317);
        livro3.setCasaHogwarts("Lufa-Lufa");
        livro3.mostrarInfo(); // metodo sobrescrito de visibilidade
        livro3.feiticoFavorito("Expecto Patronum"); // metodo 
        System.out.println();

        // 4 - Harry Potter e o Calice de Fogo
        LivroHarryPotter livro4 = new LivroHarryPotter();
        livro4.setTitulo("Harry Potter e o Calice de Fogo");
        livro4.setAutor("J.K. Rowling");
        livro4.setAnoPublicacao(2000);
        livro4.setPaginas(636);
        livro4.setCasaHogwarts("Corvinal");
        livro4.mostrarInfo(); // metodo sobrescrito de visibilidade
        livro4.feiticoFavorito("Accio"); // metodo
        System.out.println();

        // 5 - Harry Potter e a Ordem da Fenix
        LivroHarryPotter livro5 = new LivroHarryPotter();
        livro5.setTitulo("Harry Potter e a Ordem da Fenix");
        livro5.setAutor("J.K. Rowling");
        livro5.setAnoPublicacao(2003);
        livro5.setPaginas(766);
        livro5.setCasaHogwarts("Grifinoria");
        livro5.mostrarInfo(); // metodo sobrescrito de visibilidade
        livro5.feiticoFavorito("Stupefy"); // metodo
        System.out.println();

        // 6 - Harry Potter e o Enigma do Principe
        LivroHarryPotter livro6 = new LivroHarryPotter();
        livro6.setTitulo("Harry Potter e o Enigma do Principe");
        livro6.setAutor("J.K. Rowling");
        livro6.setAnoPublicacao(2005);
        livro6.setPaginas(607);
        livro6.setCasaHogwarts("Corvinal");
        livro6.mostrarInfo(); // metodo sobrescrito de visibilidade
        livro6.feiticoFavorito("Sectumsempra"); // metodo
        System.out.println();

        // 7 - Harry Potter e as Relíquias da Morte
        LivroHarryPotter livro7 = new LivroHarryPotter();
        livro7.setTitulo("Harry Potter e as Reliquias da Morte");
        livro7.setAutor("J.K. Rowling");
        livro7.setAnoPublicacao(2007);
        livro7.setPaginas(607);
        livro7.setCasaHogwarts("Lufa-Lufa");
        livro7.mostrarInfo(); // metodo sobrescrito de visibilidade
        livro7.feiticoFavorito("Avada Kedavra"); //metodo
        System.out.println(); 
    }
}
    

