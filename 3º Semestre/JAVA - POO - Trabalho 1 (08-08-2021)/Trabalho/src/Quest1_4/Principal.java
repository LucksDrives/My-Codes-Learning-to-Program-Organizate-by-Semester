/*
1) Implemente o exemplo que está no arquivo “Classes, modificadores, métodos, construtores” classe 
Operacoes e seu main (exemplo 3.1.1 e 3.1.3).
 */
package Quest1_4;

class Principal{
    public static void main(String args[]){        
        Operacoes calc_media = new Operacoes();
       
        calc_media.media1(9.5f,8.1f);
        calc_media.media2(9.5f,8.1f);
        
        float[] aux = calc_media.getXY();
        
        System.out.println("Media 1: " + aux[0]);
        System.out.println("Media 2: " + aux[1]);
    }
}
