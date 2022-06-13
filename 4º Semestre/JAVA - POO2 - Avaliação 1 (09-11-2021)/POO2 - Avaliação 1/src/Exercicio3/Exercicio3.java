/*
3) Durante o planejamento de um campeonato com diferentes modalidades, cada esporte
recebeu um código: (1,0)
1. Futebol 2. Vôlei 3. Natação 4. Dança 5. Atletismo
Desenvolva um código usando o tipo enum para enumerar as modalidades e crie uma variável
que receba o código apenas das modalidades presentes no evento.
 */
package Exercicio3;

import java.util.Scanner;

public enum Exercicio3 {
    FUTEBOL(1), VOLEI(2), NATACAO(3), DANCA(4), ATLETISMO(5); //Declaração dos Enums e Seus Respectivos Códigos

    private final int valor;
    
    //Váriável que Recebe o Código
    Exercicio3(int valorOpcao) {
        valor = valorOpcao;
    }

    public int getValor() {
        return valor;
    }

    public static void main(String[] args) {
      
      System.out.println("------------Modalidades------------");  
        
      //Listar Valores da Enum
      for(Exercicio3 p: Exercicio3.values()){
          System.out.printf("%s%n", p);    
      } 
      
      //Scan Seletor de Modalidades
      System.out.println("---Escolha sua Modalidade: "); 
      Scanner ler = new Scanner(System.in);
      int n = ler.nextInt();
      
      //Verificação dos Status das Inscrições
      if(n == 1){
          System.out.println("---Inscrição para [FUTEBOL] realizada com Sucesso---");
      }
      else if(n == 2){
          System.out.println("---Inscrição para [VOLEI] realizada com Sucesso---");
      }
      else if(n == 3){
          System.out.println("---Inscrição para [NATACAO] realizada com Sucesso---");
      }
      else if(n == 4){
          System.out.println("---Inscrição para [DANCA] realizada com Sucesso---");
      }
      else if(n == 5){
          System.out.println("---Inscrição para [ATLETISMO] realizada com Sucesso---");
      }
      //Caso Código Informado Seja Inexistente
      else{
          System.out.println("---Modalidade Inexistente, Falha ao Inscrever-se---");
      }
    }
}
