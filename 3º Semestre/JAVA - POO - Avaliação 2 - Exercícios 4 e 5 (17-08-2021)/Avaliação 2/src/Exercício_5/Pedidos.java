/*
5) Construa um programa de sua autoria (nenhum exercício visto em aula). Deve conter os pilares que
foram estudados em aula. Nas classes devem conter os métodos especiais. No principal deve ser
criado, pelo menos, um objeto e deve ser mostrado em tela. Ao final, faça um vídeo explicando o
código. Pode enviar o link da gravação. (1,5)

Tema: Bar
 */
package Exercício_5;

public class Pedidos extends Cliente{
    private String comida;
    private String bebida;
    private double valor;

    //Imprimir Informações
    @Override
    public void imprimeInformacoes() {   
        System.out.println("\nComida: " + comida);
        System.out.println("\nBebida: " + bebida);
        System.out.println("\nValor: " + valor);
    } 
    
    //Get e Set nome
    public void setValor (double valor){
        this.valor = valor;
    }
    
    public double getValor(){
        return this.valor;
    }  

    //Get e Set Comida
    public void setComida (String comida){
        this.comida = comida;
    }
    
    public String getComida(){
        return this.comida;
    }  

    //Get e Set Bebida
    public void setBebida (String bebida){
        this.bebida = bebida;
    }
    
    public String getBebida(){
        return this.bebida;
    }      
}
