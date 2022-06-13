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

public class Gato extends Animal{
    private String corPelo;
    
    public Gato(){
    
    }
    
    public Gato (String nome, int idade){
        super(nome,idade);
    }
    
    public String getCorPelo(){
        return corPelo;
    }
    
    public void setCorPelo (String corPelo) {
        this.corPelo = corPelo;
    }
    
    public void emitirsom(){
        system.out.println("Miau, Miau!");
    }
}
