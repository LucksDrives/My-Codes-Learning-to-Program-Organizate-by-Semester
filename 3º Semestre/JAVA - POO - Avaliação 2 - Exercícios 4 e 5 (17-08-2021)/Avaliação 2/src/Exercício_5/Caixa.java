/*
5) Construa um programa de sua autoria (nenhum exercício visto em aula). Deve conter os pilares que
foram estudados em aula. Nas classes devem conter os métodos especiais. No principal deve ser
criado, pelo menos, um objeto e deve ser mostrado em tela. Ao final, faça um vídeo explicando o
código. Pode enviar o link da gravação. (1,5)

Tema: Bar
 */
package Exercício_5;

public class Caixa extends Funcionario{
    private int numeroDoCaixa;
    
    @Override
    public void imprimeInformacoes() {   
        System.out.println("\nNúmero do Caixa: " + numeroDoCaixa);
    }
    
    //Get e Set Caixa
    public void setCaixa(int numeroDoCaixa){
        this.numeroDoCaixa = numeroDoCaixa;
    }
    
    public int getCaixa(){
        return this.numeroDoCaixa;
    } 
}
