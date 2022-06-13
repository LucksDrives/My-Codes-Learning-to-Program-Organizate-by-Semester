/*2) Implemente uma classe chamada Triangulo. Esta classe deverá conter os seguintes atributos: (1,5)
 lado1 (inteiro);
 lado2 (inteiro);
 lado3 (inteiro).
Crie um construtor para a classe que receba os três lados de um triângulo. Crie os métodos set e get
para os atributos:
escaleno(), que retorna VERDADEIRO se o triângulo tiver os três lados diferentes, caso contrário retorna FALSO; 
isosceles(), que retorna VERDADEIRO se possuir apenas dois lados iguais, caso contrário retorna FALSO; 
equilatero(),que retorna VERDADEIRO se possuir os três lados iguais, caso contrário retorna FALSO.*/

package Exercicio2;

public class Triangulo{
    /*Atributos*/
    public int lado1, lado2, lado3;

    /*Método - Criar Triângulo*/
    public void criarTriangulo(int infolado1, int infolado2, int infolado3) {
    lado1 = infolado1;
    lado2 = infolado2;
    lado3 = infolado3;
    }
    
    /*Método - Escaleno*/
    public boolean escaleno() {   
        if((lado1 != lado2) && (lado1 != lado3) && (lado2 != lado3)){
            System.out.println("\nÉ Escaleno");
            return true;
        }
        else{
            return false;
        }
    }
    
    /*Método - Isosceles*/
    public boolean isosceles() { 
        
        int quantlados=0;
        
        if(lado1 == lado2){
            quantlados++;
        }
        else{
        } 
        if(lado1 == lado3){
            quantlados++;
        }
        else{
        } 
        if(lado2 == lado3){
            quantlados++;
        }
        else{
        } 
        if(quantlados==1){
            System.out.println("\nÉ Isosceles");
            return true;
        }
        else{
            return false;
        } 
    }
    
    /*Método - Equilatero*/
    public boolean equilatero() {   
         if((lado1 == lado2) && (lado1 == lado3) && (lado2 == lado3)){
            System.out.println("\nÉ Equilatero");             
            return true;
        }
        else{
            return false;
        }
    }
    
    /*Método - Unico Método*/
    public void unicoMetodo() {
         if((lado1 == lado2) && (lado1 == lado3) && (lado2 == lado3)){
            System.out.println("\nÉ Equilatero");             
        }
         else if((lado1 != lado2) && (lado1 != lado3) && (lado2 != lado3)){
            System.out.println("\nÉ Escaleno");
        }
         else{
            System.out.println("\nÉ Isosceles");
         }
    }
}