/*
4) Implemente o diagrama a seguir. Ao final, faça um vídeo explicando o código. Pode enviar o link da gravação. (1,0)

Classe: Bicicleta Herdada de Veículo

Atributos:
    private int numMarchas;
    private boolean bagageiro;

Métodos:
    void imprimeInformações();
    Get e Set numMarchas;
    Get e Set bagageiro;
 */
package Exercício_4;

public class Bicicleta extends Veiculo{
    private int numMarchas;
    private boolean bagageiro;
    
    //Get e Set numMarchas
    public void setnumMarchas(int numMarchas){
        this.numMarchas = numMarchas;
    }
    
    public int getNumMarchas(){
        return this.numMarchas;
    }
    
    //Get e Set bagageiro
    public void setBagageiro(boolean bagageiro){
        this.bagageiro = bagageiro;
    }
    
    public boolean getBagageiro(){
        return this.bagageiro;
    }    

    //Imprime Informação    
    public void imprimeInformacao() {   
        System.out.println("\nNumero de Marchas: " + numMarchas);
        System.out.println("\nTem Bagageiro? " + bagageiro);
    }     
}
