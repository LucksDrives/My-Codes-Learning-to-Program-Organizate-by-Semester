/*
3)Implemente a hierarquia de classes mostrada a seguir: Animal
    String nome;
-Métodos falar e imprimirNome;
a. O método falar da classe Animal deve imprimir “Eu não falo!”;
i. Crie, para cada classe, os métodos getNome e setNome. 
 */
package Quest3_6;

public class Animal {
    String nome;
    
    public void falar() {
        System.out.println("\nEu Não Falo");
    }   

    public void imprimeNome() {
        System.out.println("\n" +nome);
    } 

    //Get e Set
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
}
