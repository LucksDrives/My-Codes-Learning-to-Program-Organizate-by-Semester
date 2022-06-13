/*
5) Construa um programa de sua autoria (nenhum exercício visto em aula). Deve conter os pilares que
foram estudados em aula. Nas classes devem conter os métodos especiais. No principal deve ser
criado, pelo menos, um objeto e deve ser mostrado em tela. Ao final, faça um vídeo explicando o
código. Pode enviar o link da gravação. (1,5)

Tema: Bar
 */
package Exercício_5;

public class Funcionario {
    private String cargo;
    private String nome;
    private String turno;
    
    //Get e Set nome
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }  

    //Get e Set cargo
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    
    public String getCargo(){
        return this.cargo;
    } 
    
    //Get e Set Turno
    public void setTurno(String turno){
        this.turno = turno;
    }
    
    public String getTurno(){
        return this.turno;
    }       
        
    //Imprime Informação
    public void imprimeInformacoes() {   
        System.out.println("\nNome: " + nome);
        System.out.println("\nCargo: " + cargo);
        System.out.println("\nTurno: " + turno);
    }  
}
