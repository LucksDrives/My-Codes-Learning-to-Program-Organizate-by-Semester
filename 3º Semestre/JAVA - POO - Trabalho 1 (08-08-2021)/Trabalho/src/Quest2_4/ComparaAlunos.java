/*
2) Implemente o exemplo que está no arquivo “Classes, modificadores, métodos, construtores” classe 
Classes Aluno e ComparaAlunos (exemplo 3.1.6).
 */
package Quest2_4;

public class ComparaAlunos {
    public static void main(String args[]){
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        
        aluno1.setMatricula(12345);
        aluno1.setNome("Carlos");
        aluno2.setMatricula(54321);
        aluno2.setNome("Janaina");  
        
        if (aluno1.equals(aluno2)){
            System.out.println("O Aluno1 eh igual ao Aluno2.");}
        else{
            System.out.println("O Aluno1 eh diferente do Aluno2.");}        
        
        Aluno aluno3 = new Aluno();
        Aluno aluno4 = new Aluno();
       
        aluno3.setMatricula(12345);
        aluno3.setNome("Carlos");
        aluno4.setMatricula(12345);
        aluno4.setNome("Carlos");   
       
        if (aluno3.equals(aluno4)){
            System.out.println("O Aluno3 eh igual ao Aluno4.");}
        else{
            System.out.println("O Aluno3 eh diferente do Aluno4.");}        
    }
}
