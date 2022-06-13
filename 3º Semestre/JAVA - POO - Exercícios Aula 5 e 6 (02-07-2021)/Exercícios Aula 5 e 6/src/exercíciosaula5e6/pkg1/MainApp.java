/*
1) Implemente os exemplos dos slides de aula:
a. Encapsulamento;
b. Relacionamentos;
c. Herança;
d. Polimorfismo;
e. Classes abstratas;
f. Interfaces.
2) Faça seus próprios exemplos com base no exercício 1.
 */
package exercíciosaula5e6.pkg1;

public class MainApp {

    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        Diretor diretor = new Diretor();
        Cliente cliente = new Cliente();
        System.out.println(gerente.autenticar(123));
        System.out.println(diretor.autenticar(0123));
        System.out.println(cliente.autenticar(123456));
    }
}
