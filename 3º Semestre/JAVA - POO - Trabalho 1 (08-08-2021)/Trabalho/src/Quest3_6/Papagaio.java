/*
3)Implemente a hierarquia de classes mostrada a seguir: Animal/Passaro/Papagaio
    String vocabulario;
-Métodos falar e setVocab;
d. O método falar da classe Papagaio deve imprimir o vocabulário;
i. Crie, para cada classe, os métodos getNome e setNome. 
 */
package Quest3_6;

public class Papagaio extends Passaro {
    private String vocabulario;    
    
    @Override
    public void falar() {
        System.out.println("\n" + vocabulario);
    }
    
    //Get e Set
    public void setVocabulario(String vocabulario){
        this.vocabulario = vocabulario;
    }
    
    public String getVocabulario(){
        return this.vocabulario;
    }
    
    //Get e Set
    @Override
    public void setNome(String nome){
        this.nome = nome;
    }
    
    @Override
    public String getNome(){
        return this.nome;
    }
}

