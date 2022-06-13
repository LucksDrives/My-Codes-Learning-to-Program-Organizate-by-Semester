/*
3)Implemente a hierarquia de classes mostrada a seguir: Animal/Mamifero/Vaca
-Método falar;
f. O método falar da classe Vaca deve imprimir “Muuuuu!”; 
i. Crie, para cada classe, os métodos getNome e setNome. 
 */
package Quest3_6;

public class Vaca extends Mamifero {
    @Override
    public void falar() {
        System.out.println("\nMuuu");
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
