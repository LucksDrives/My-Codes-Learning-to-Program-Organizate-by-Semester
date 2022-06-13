/*
1) Implemente os exemplos dos slides de aula:
a. Encapsulamento;
b. Relacionamentos;
c. Herança;
d. Polimorfismo;
e. Classes abstratas;
f. Interfaces.
2) Faça seus próprios exemplos com base no exercício 1.
*/
package exercíciosaula5e6.pkg1;

import static java.time.Clock.system;

public class Animal {
    protected String nome;
    protected int idade;
    
    public Animal(){
    }
    public Animal (String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    public String getNome(){
        return nome;
    }
    public void setNome (String nome){
        this.nome = nome;
    }
    
    public int getIdade(){
        return idade;
    }
    public void emitirSom(){
        system.out.println("Som é emitido nas subclasses");    
    }
}