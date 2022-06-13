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

public class Cachorro extends Animal { 
 private String raca;
 private boolean perigoso;


    public Cachorro(){
      
    }    
    
    public Cachorro(String nome, int idade){
        super(nome,idade);
    }
    
    public String getRaca(){
        return raca;
    }
    public void setRaca (String raca) {
        this.raca = raca;
    }
    public boolean isPerigoso(){
        return perigoso;
    }
    public void setPerigoso(boolean Perigoso){
        this.perigoso = perigoso;
    }

    public void emitirSom(){
        system.out.println("au,au!");
    }
}

