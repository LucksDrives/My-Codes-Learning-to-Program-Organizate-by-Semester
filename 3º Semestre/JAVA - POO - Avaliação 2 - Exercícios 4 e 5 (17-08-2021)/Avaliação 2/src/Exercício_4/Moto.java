/*
4) Implemente o diagrama a seguir. Ao final, faça um vídeo explicando o código. Pode enviar o link da gravação. (1,0)

classe: Moto Herdada de Automóvel

Atributos:
    private boolean partidaEletrica;

Métodos:
    void imprimeInformações();
    Get e Set partidaEletrica;
 */
package Exercício_4;

public class Moto extends Automovel{
    private boolean partidaEletrica;
    
    //Get e Set partidaEletrica
    public void setPartidaEletrica(boolean partidaEletrica){
        this.partidaEletrica = partidaEletrica;
    }
    
    public boolean getPartidaEletrica(){
        return this.partidaEletrica;
    }     

    //Imprime Informação    
    @Override
    public void imprimeInformacao() {   
        System.out.println("\nTem Partida Elétrica? " + partidaEletrica);
    }     
}
