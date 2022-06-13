/*
3)Implemente a hierarquia de classes mostrada a seguir: Animal, Passaro, Mamifero, BemTeVi, Papagaio, Cachorro, Vaca
h. Crie, para cada classe, um método construtor passando um nome como parâmetro. Este método
deve inicializar o nome do animal. 
j. Crie uma classe TestaAnimal com o método principal (main) criando diferentes animais. Invoque o
método falar de cada um dos animais e verifique o resultado da execução.
 */
package Quest3_6;

public class TestaAnimal {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Passaro passaro1 = new Passaro();   
        Mamifero mamifero1 = new Mamifero(); 
        BemTeVi pipiu = new BemTeVi(); 
        Papagaio rico = new Papagaio();
        Cachorro spike = new Cachorro();
        Vaca mimosa = new Vaca();
        
        animal1.falar();
        passaro1.falar();
        mamifero1.falar();
        pipiu.falar();
        rico.falar();
        spike.falar();
        mimosa.falar(); 
        
        animal1.imprimeNome();
        passaro1.imprimeNome();
        mamifero1.imprimeNome();
        pipiu.imprimeNome();
        rico.imprimeNome();
        spike.imprimeNome();
        mimosa.imprimeNome();
        
        rico.setVocabulario("rico-rico");
        spike.latirAlto();
        
    }
}
