/*
4) Implemente o diagrama a seguir. Ao final, faça um vídeo explicando o código. Pode enviar o link da gravação. (1,0)

Super Classe: Veículo

Atributos:
    private String marca;
    private int qtdRodas;
    private String modelo;
    private int velocidade;

Atributos Herdados:
    private int numMarchas(Bicicleta);
    private boolean bagageiro(Bicicleta);
    private double potenciaDoMotor(Automóvel);
    private int qtdPortas(Automóvel/Carro);
    private boolean partidaEletrica(Automóvel/Moto);

Métodos:
    void imprimeInformações();
    void acelerar(int valor);
    void freiar(int valor);
    Get e Set marca;
    Get e Set qtdRodas;
    Get e Set modelo;
    Get e Set velocidade;
 */
package Exercício_4;

public class Veiculo{
    private String marca;
    private int qtdRodas;
    private String modelo;
    private int velocidade=0;
     
    //Get e Set marca
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public String getMarca(){
        return this.marca;
    }  

    //Get e Set qtdRodas
    public void setQtdRodas(int qtdRodas){
        this.qtdRodas = qtdRodas;
    }
    
    public int getQtdRodas(){
        return this.qtdRodas;
    }  
    
    //Get e Set modelo
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public String getModelo(){
        return this.modelo;
    }  

    //Get e Set velocidade
    public void setVelocidade(int velocidade){
        this.velocidade = velocidade;
    }
    
    public int getVelocidade(){
        return this.velocidade;
    }
    
    //Imprime Informação
    public void imprimeInformacoes() {   
        System.out.println("\nMarca: " + marca);
        System.out.println("\nQuantidade de Rodas: " + qtdRodas);
        System.out.println("\nModelo: " + modelo);   
        System.out.println("\nVelocidade: " + velocidade); 
    }  
    
    //Acelerar
    public void acelerar() {     
        System.out.println("\nVruuumm");    
        velocidade += 1;
    }
    //Frear
    public void frear() {     
        System.out.println("\nPiririri");    
        velocidade -= 1;
    }
}
