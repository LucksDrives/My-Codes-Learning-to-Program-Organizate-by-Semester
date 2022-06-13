/*
4) Implemente o diagrama a seguir. Ao final, faça um vídeo explicando o código. Pode enviar o link da gravação. (1,0)

classe: Automóvel Herdada de Veiculo

Atributos:
    private double potenciaDoMotor;

Atributos Herdados:
    private int qtdPortas(Carro);
    private boolean partidaEletrica(Moto);

Métodos:
    void imprimeInformações();
    Get e Set potenciaDoMotor;
 */
package Exercício_4;

public class Automovel extends Veiculo{
    private double potenciaDoMotor;
    
    //Get e Set potenciaDoMotor
    public void setPotenciaDoMotor(double potenciaDoMotor){
        this.potenciaDoMotor = potenciaDoMotor;
    }
    
    public double getPotenciaDoMotor(){
        return this.potenciaDoMotor;
    }  

    //Imprime Informação    
    public void imprimeInformacao() {   
        System.out.println("\nPotencia do Motor: " + potenciaDoMotor);
    }     
}
