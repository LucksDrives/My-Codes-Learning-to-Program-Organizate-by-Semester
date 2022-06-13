/*
5) Construa um programa de sua autoria (nenhum exercício visto em aula). Deve conter os pilares que
foram estudados em aula. Nas classes devem conter os métodos especiais. No principal deve ser
criado, pelo menos, um objeto e deve ser mostrado em tela. Ao final, faça um vídeo explicando o
código. Pode enviar o link da gravação. (1,5)

Tema: Bar
 */
package Exercício_5;

import java.util.Scanner;

public class Garçom extends Funcionario{
    private double gorjeta=0;
    
    //Imprime Informação
    @Override
    public void imprimeInformacoes() {   
        System.out.println("\nGorjeta Recebida: " + gorjeta);
    } 

    //Get e Set Gorjeta
    public void setGorjeta(double gorjeta){
        this.gorjeta = gorjeta;
    }
    
    public double getGorjeta(){
        return this.gorjeta;
    } 
}
