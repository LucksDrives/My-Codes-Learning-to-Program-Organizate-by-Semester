/*
4) Implemente o diagrama a seguir. Ao final, faça um vídeo explicando o código. Pode enviar o link da gravação. (1,0)

Classe: Carro Herdada de Automóvel

Atributos:
    private int qtdPortas;

Métodos:
    void imprimeInformações();
    Get e Set qtdPortas;
 */
package Exercício_4;

public class Carro extends Automovel{
    private int qtdPortas;
    
    //Get e Set qtdPortas
    public void setQtdPortas(int qtdPortas){
        this.qtdPortas = qtdPortas;
    }
    
    public int getQtdPortas(){
        return this.qtdPortas;
    }  
  
    //Imprime Informação    
    @Override
    public void imprimeInformacao() {   
        System.out.println("\nQuantidade de Portas: " + qtdPortas);
    }    
}
