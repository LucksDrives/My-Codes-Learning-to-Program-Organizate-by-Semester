/*
3)Implemente a hierarquia de classes mostrada a seguir: Animal/Mamifero
-Método falar;
i. Crie, para cada classe, os métodos getNome e setNome. 
 */
package Quest3_6;

public class Mamifero extends Animal {
    @Override
    public void falar() {
        System.out.println("\n");
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
