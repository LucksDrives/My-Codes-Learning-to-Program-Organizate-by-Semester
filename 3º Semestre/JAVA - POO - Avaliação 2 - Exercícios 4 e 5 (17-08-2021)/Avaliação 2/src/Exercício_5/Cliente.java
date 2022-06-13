/*
5) Construa um programa de sua autoria (nenhum exercício visto em aula). Deve conter os pilares que
foram estudados em aula. Nas classes devem conter os métodos especiais. No principal deve ser
criado, pelo menos, um objeto e deve ser mostrado em tela. Ao final, faça um vídeo explicando o
código. Pode enviar o link da gravação. (1,5)

Tema: Bar
 */
package Exercício_5;

public class Cliente{
    private String nome;
    private int idade;
    private double altura;
     
    //Get e Set nome
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }  

    //Get e Set idade
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public int getIdade(){
        return this.idade;
    }  
        
    //Imprime Informação
    public void imprimeInformacoes() {   
        System.out.println("\nNome: " + nome);
        System.out.println("\nIdade: " + idade);
        System.out.println("\nAltura: " + altura);
    }  
    
    //Get e Set Altura
    public void setAltura(double altura){
        this.altura = altura;
    }
    
    public double getAltura(){
        return this.altura;
    }  
}
