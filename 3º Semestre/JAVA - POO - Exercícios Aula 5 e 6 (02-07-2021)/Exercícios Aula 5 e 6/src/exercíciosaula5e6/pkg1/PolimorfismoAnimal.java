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

public class PolimorfismoAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.emitirSom();
        
        Animal cachorro = new Cachorro();
        cachorro.emitirSom();
        
        Animal gato = new Gato();
        gato.emitirSom();
        
        Animal galinha = new Galinha();
        galinha.emitirSom();
    }
}
