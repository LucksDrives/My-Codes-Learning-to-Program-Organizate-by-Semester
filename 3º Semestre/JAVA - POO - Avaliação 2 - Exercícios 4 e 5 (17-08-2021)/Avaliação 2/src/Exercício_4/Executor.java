/*
4) Implemente o diagrama a seguir. Ao final, faça um vídeo explicando o código. Pode enviar o link da gravação. (1,0)
 */
package Exercício_4;

public class Executor {
    public static void main(String args[]){ 
        /*Criação de Novos Objetos*/
        Carro carro1 = new Carro(); // Criação de um novo Objeto Carro
        Moto moto1 = new Moto(); // Criação de um novo Objeto Moto
        Bicicleta bicicleta1 = new Bicicleta(); // Criação de um novo Objeto Bicicleta
        Veiculo veiculo1 = new Veiculo(); // Criação de um novo Objeto Veiculo
        Automovel automovel1 = new Automovel(); // Criação de um novo Objeto Automovel
    
        /*Métodos Especiais*/
        carro1.setQtdPortas(4); //Informar Quantidade de Portas
        moto1.setPartidaEletrica(true); //Informar se Tem Partida Elétrica
        bicicleta1.setBagageiro(true); // Informar se Tem Bagageiro
        bicicleta1.setnumMarchas(5); // Informar o Número de Marchas
        veiculo1.acelerar(); // Acelerar Veículo
        veiculo1.frear(); // Frear Veículo
        automovel1.setPotenciaDoMotor(550.05); // Informar Potência do Motor       
        veiculo1.setMarca("chevrolet"); // Informar Marca
        veiculo1.setModelo("onix"); // Informar Modelo
        veiculo1.setQtdRodas(4); // Informar Quantidade de Rodas
        
        /*Imprição das Informações*/
        carro1.imprimeInformacao(); // Imprimir Informações do Carro
        moto1.imprimeInformacao(); // Imprimir Informações da Moto
        bicicleta1.imprimeInformacao(); // Imprimir Informações da bicicleta
        veiculo1.imprimeInformacoes(); // Imprimir Informações do Veiculo
        automovel1.imprimeInformacao(); // Imprimir Informações do Automovel
    }
}
