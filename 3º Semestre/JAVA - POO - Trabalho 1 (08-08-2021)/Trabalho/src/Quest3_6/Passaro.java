/*
3)Implemente a hierarquia de classes mostrada a seguir: Animal/Passaro
-Método falar;
b. O método falar da classe Pássaro deve imprimir “Dó-Ré-Mi!”;
i. Crie, para cada classe, os métodos getNome e setNome. 
 */
package Quest3_6;

public class Passaro extends Animal{
    @Override
    public void falar() {
        System.out.println("\nDó-Ré-Mi");
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
