/*
1) Implemente o exemplo que está no arquivo “Classes, modificadores, métodos, construtores” classe 
Operacoes e seu main (exemplo 3.1.1 e 3.1.3).
 */
package Quest1_4;

class Operacoes{
    private float x,y;
    
    public void media1(float a, float b){
        x = (a + b)/2;
    }
    public void media2(float a, float b){
        y = (a * 0.4f) + (b * 0.6f);
    }
    public float[] getXY(){
        float resultados[] = new float[2];
        resultados[0] = x;
        resultados[1] = y;
        return resultados;
    }
}

