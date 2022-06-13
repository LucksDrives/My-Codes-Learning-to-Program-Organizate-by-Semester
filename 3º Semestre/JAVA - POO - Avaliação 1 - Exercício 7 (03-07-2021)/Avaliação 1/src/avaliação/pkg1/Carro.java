/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avaliação.pkg1;
/**
 *
 * @author asqui
 */
public class Carro {
    public String modelo;
    public int anoFabricacao;
    public String cor;
    public double velocidadeAtual;
    public String marca;
    private int NumChassi;
    
    Carro onix = new Carro();
    
    public void ligar() {
        System.out.println("\nCarro Ligado");
    }
    public void frear(){
        System.out.println("\nPIRIRI");
        this.velocidadeAtual = this.velocidadeAtual - 10;
    }
    public void acelerar(){
        System.out.println("\nVRUMM");
        this.velocidadeAtual = this.velocidadeAtual + 10;
    }
    public void desligar() {
        System.out.println("\nCarro Desligado");
    }
    public void mostrarInformaçõesCarro() {
        System.out.println("\nInformações: ");
        System.out.println("\nVelociade Atual: " + this.velocidadeAtual); 
        System.out.println("\nModelo: " + this.modelo);
        System.out.println("\nAno da Fabricação: " + this.anoFabricacao);
        System.out.println("\nCor: " + this.cor);
        System.out.println("\nMarca: " + this.marca);
    }
}