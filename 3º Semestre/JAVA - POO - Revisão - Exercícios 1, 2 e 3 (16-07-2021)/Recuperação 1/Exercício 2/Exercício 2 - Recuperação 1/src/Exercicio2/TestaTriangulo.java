/* Implemente uma classe TestaTriangulo com o método main que cria um objeto do tipo Triangulo.
Verifique se o triângulo é isósceles, escaleno ou equilátero. Altere os lados e verifique novamente.*/

package Exercicio2;

public class TestaTriangulo {
        public static void main(String[] args) {
            
        /*Criar Novos Objetos*/
        Triangulo Triangulo1 = new Triangulo(); 
        
        /*Criação do Triângulo 1*/
        Triangulo1.criarTriangulo(10, 5, 10);
 
        /*Atribuição do Triângulo 1*/        
        System.out.println("\nTriângulo 1: " + Triangulo1.lado1 + " , " + Triangulo1.lado2 + " , " + Triangulo1.lado3);

        Triangulo1.escaleno();
        Triangulo1.isosceles();
        Triangulo1.equilatero();
        
        /*Criação do Triângulo 2*/
        Triangulo1.criarTriangulo(5, 5, 10);
 
        /*Atribuição do Triângulo 2*/       
        System.out.println("\nTriângulo 2: " + Triangulo1.lado1 + " , " + Triangulo1.lado2 + " , " + Triangulo1.lado3);        

        Triangulo1.escaleno();
        Triangulo1.isosceles();
        Triangulo1.equilatero();
        
        /*Criação do Triângulo 3*/
        Triangulo1.criarTriangulo(10, 10, 10);

        /*Atribuição do Triângulo 3*/        
        System.out.println("\nTriângulo 3: " + Triangulo1.lado1 + " , " + Triangulo1.lado2 + " , " + Triangulo1.lado3);        

        Triangulo1.escaleno();
        Triangulo1.isosceles();
        Triangulo1.equilatero();
        
        /*Como é possível, com um único método sabermos qual o tipo do triângulo?*/
        Triangulo1.unicoMetodo(); /*Assim*/
        }
}
