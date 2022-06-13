
package main;

import connection.ConnectionFactory;
import dao.noticiasDAO;
import java.sql.Connection;
import java.text.ParseException;
import model.Noticias;

public class mainJDBD {
    public static void main(String[] args) throws ParseException {
        Connection conn = ConnectionFactory.getConnection();
        if( conn != null){
            System.out.println("Conexão Criada com Sucesso");
        }        
        Noticias c1 = new Noticias();
        c1.setNome("teste");
        c1.setQuantidade(1);
        c1.setImagem("adssa");
        c1.setDescricao("adsasdasasdasd");
        c1.setNumeroGalpao(1);
        
        noticiasDAO noticiasDAOO = new noticiasDAO();
        noticiasDAOO.inserir(c1);        
        }
    }
