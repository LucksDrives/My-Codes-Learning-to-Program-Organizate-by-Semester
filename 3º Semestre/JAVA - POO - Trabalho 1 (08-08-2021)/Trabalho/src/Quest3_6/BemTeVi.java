/*
3)Implemente a hierarquia de classes mostrada a seguir: Animal/Passaro/BemTeVi
-Método falar;
c. O método falar da classe BemTeVi deve imprimir “Bem-te-vi!”; 
i. Crie, para cada classe, os métodos getNome e setNome. 
 */
package Quest3_6;

public class BemTeVi extends Passaro {
    @Override
    public void falar() {
        System.out.println("\nBemTeVi");
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
