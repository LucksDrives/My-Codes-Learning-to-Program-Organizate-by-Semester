/*1) Implemente uma classe TestaPessoa, com o método main, que cria dois objetos do tipo Pessoa e
apresente na tela um relatório das características de cada pessoa e qual delas possui maior altura e
qual delas possui menor idade.*/

package Exercicio1;

public class TestaPessoa {

    public static void main(String[] args) {
        
        /*Criar Novos Objetos*/
        Pessoa Pessoa1 = new Pessoa();
        Pessoa Pessoa2 = new Pessoa();        
        
        /*Cadastro da Pesssoa 1*/
        System.out.println("Pessoa 1");
        Pessoa1.cadastrarPessoa("Tais Professora", 26, 50, (float) 1.60);
        Pessoa1.mostrarPessoa();
        
        /*Cadastro da Pessoa 2*/
        System.out.println("\nPessoa 2");
        Pessoa2.cadastrarPessoa("Leo Stronda", 30, 120, (float) 1.85);       
        Pessoa2.mostrarPessoa();
        
        /*Testar Menor Idade*/
        if(Pessoa1.idade<Pessoa2.idade){
        System.out.println("\n" + Pessoa1.nome + " Possui a Menor Idade");            
        }
        else{
        System.out.println("\n" + Pessoa2.nome + " Stronda Possui a Menor Idade");  
        }
        
        /*Testar Maior Altura*/
        if(Pessoa1.altura>Pessoa2.altura){
        System.out.println("\n" + Pessoa1.nome + " Possui a Maior Altura"); 
        }
        else{
        System.out.println("\n" + Pessoa2.nome + " Stronda Possui a Maior Altura");  
        }                
    }    
}
