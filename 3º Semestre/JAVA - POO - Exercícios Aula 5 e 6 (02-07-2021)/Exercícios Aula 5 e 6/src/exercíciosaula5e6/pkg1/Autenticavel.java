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

public interface Autenticavel {

    boolean autenticar(int senha);

    double getSalario();
}

public class Gerente extends Funcionario implements Autenticavel {

    private final int senha = 123;

    @override
    public double calcularsalario() {
        return super.getSalario() * 1.20;
    }

    @override
    public boolean autenticar(int senha) {
        if (this.senha == senha) {
            (

        
        }
        return true;
    }

return false;
}
}
