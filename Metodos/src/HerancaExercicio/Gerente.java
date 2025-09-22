/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HerancaExercicio;

/**
 *
 * @author Barbara
 */
public class Gerente extends Funcionario{
    private String usuario;
    private String senha;
    
    
    public String getUsuario(){
        return this.usuario;
    } 
    
    public String getSenha(){
        return this.senha;
    } 
    
    public void setUsuario(String usuario){
        this.usuario = usuario;
    }
    
     public void setSenha(String senha){
        this.senha = senha;
    }
     
    @Override
    public double calculoBonificacao() {
        return this.getSalario() * 0.6 + 100;
    }
    
    @Override
    public void MostrarDados(){
        super.MostrarDados();
        System.out.println("Usuario: " + getUsuario());
        System.out.println("Senha : " + getSenha());
        System.out.println("Bonificacao: " + calculoBonificacao());
    }
}
