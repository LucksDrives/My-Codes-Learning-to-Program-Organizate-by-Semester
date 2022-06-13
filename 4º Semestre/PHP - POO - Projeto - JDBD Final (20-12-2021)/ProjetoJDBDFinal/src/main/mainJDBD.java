
package main;

import connection.ConnectionFactory;
import dao.contatoDAO;
import java.sql.Connection;
import model.Contato;

public class mainJDBD {
    public static void main(String[] args) {
        Connection conn = ConnectionFactory.getConnection();
        if( conn != null){
            System.out.println("Conexão Criada com Sucesso");
        }
        
        Contato c1 = new Contato();
        c1.setNome("Lucas");
        c1.setEmail("email@gmail.com");
        c1.setTelefone("12");
        
        contatoDAO contatoDAOO = new contatoDAO();
        contatoDAOO.inserir(c1);
        
        }
    }
