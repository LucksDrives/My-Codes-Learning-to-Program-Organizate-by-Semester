/*
3)Implemente a hierarquia de classes mostrada a seguir: Animal/Mamifero/Cachorro
    boolean lateAlto;
-Métodos falar, lateAlto e lateBaixo;
e. O método falar da classe Cachorro deve imprimir “Au-au”;
g. Para a classe Cachorro o atributo lateAlto indica se o cachorro late alto (lateAlto= true) ou baixo
(lateAlto = false). O método falar deve verificar este atributo e imprimir “AU, AUUUU!” quando o
cachorro late alto e “au, auuuu!” quando o cachorro late baixo;
i. Crie, para cada classe, os métodos getNome e setNome. 
 */
package Quest3_6;

public class Cachorro extends Mamifero {
    private boolean lateAlto; 
    
    @Override
    public void falar() {
        System.out.println("\nAu-Au");
    }    
    
    public boolean latirAlto() {
        if (lateAlto=true){
            System.out.println("AU-AUUU");}
        else {
            System.out.println("au-auuu");}
            return false;
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

