/*1) Implemente uma classe chamada Pessoa, que deverá conter: (1,5)
 um nome (String);
 uma idade (inteiro);
 um peso (float);
 uma altura (float).
Crie um construtor para a classe que receba todos os dados de uma pessoa e inicialize os atributos.
Crie os métodos get e set para os atributos.*/

package Exercicio1;

public class Pessoa {
    
    /*Atributos*/
    public String nome;
    public int idade;
    public float peso;
    public float altura;

    /*Método - Cadastrar Pessoas*/
    public void cadastrarPessoa(String nomepessoa, int idadepessoa, float pesopessoa, float alturapessoa) {
    nome = nomepessoa;
    idade = idadepessoa;
    peso = pesopessoa;
    altura = alturapessoa;
    }
    
    /*Método - Mostrar Pessoa*/
    public void mostrarPessoa() {   
    System.out.println("Nome: " + nome);
    System.out.println("Idade: " + idade);
    System.out.println("Peso: " + peso);   
    System.out.println("Altura: " + altura); 
    }
}