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

public class Galinha extends Animal {
    private String corPenas;
    
    public Galinha(){
    
    }
    public Galinha (String nome, int idade){
        super(nome,idade);
    }
    public String getCorPenas(){
        return corPenas;
    }
    public void setCorPenas (String corPenas){
        this.corPenas = corPenas;
    }
    
    public void emitirsom(){
        system.out.println("có, có!");
    }
}
