package model;

public class CalcModel {
    private int resultado;
    private int resultado2;
    
    public void somar(int n1, int n2){
        resultado = n1 + n2;
    }
    
    public void multiplicar(int n3, int n4){
        resultado2 = n3 * n4;
    }
    
    public int getResultado(){
        return resultado;
    }
    
    public int getResultado2(){
        return resultado2;
    }
}
