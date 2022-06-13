/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avaliação.pkg1;
import java.util.Scanner;
/**
 *
 * @author asqui
 */
public class Marca { 
 int id_marca;
 String nome_marca;

    Marca chevrolet = new Marca();
    Marca volksvagen = new Marca();
    
    public void cadastrarMarca(){
        System.out.println("\nEscolha a Marca:");
        System.out.println("\n[1]Volksvagen \n[2]Chevrolet");
        Scanner input = new Scanner(System.in);
        id_marca = input.nextInt ();
    }    
    
    public void verMarca(){
        if (id_marca == 2){
            System.out.println("\nChevrolet");}
        else{ 
            System.out.println("\nVolksvagen");}
    }
}

