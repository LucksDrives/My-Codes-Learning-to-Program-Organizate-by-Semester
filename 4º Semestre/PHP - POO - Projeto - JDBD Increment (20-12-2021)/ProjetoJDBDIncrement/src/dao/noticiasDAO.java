package dao;

import connection.ConnectionFactory;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import model.Noticias;

public class noticiasDAO {
    public void inserir(Noticias noticias){
        Connection conn = ConnectionFactory.getConnection();
        Statement stmt = null;
       
       /*String sql = "INSERT INTO contatoo (nome, email, telefone) "
                + "values  ('Messi', 'messi@email.com.br', '(21)9999-9999')";*/
        String sql = "INSERT INTO noticias (nome, quantidade, imagem, descricao, numero_galpao) values" 
                + "('" + noticias.getNome()+ "', '" + noticias.getQuantidade()+ "', '" + noticias.getImagem()+ "', '" + noticias.getDescricao()+ "', '" + noticias.getNumeroGalpao()+ "')";
        try {
            stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            System.out.println("Noticia Inserida com Sucesso");
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        } finally {
            System.out.println("Conexão Fechada com Sucesso!");
            ConnectionFactory.closeConnection((com.mysql.jdbc.Connection) conn, stmt);

        }
    }
    public void excluir (Noticias noticias){
Connection conn = ConnectionFactory.getConnection();
Statement stmt = null;

String sql = "delete from noticias where id='" + noticias.getIdNoticias() + "'";
        try {
            stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            System.out.println("Notícia Excluída com Sucesso");
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        } finally {
            System.out.println("Conexão Fechada com Sucesso!");
            ConnectionFactory.closeConnection((com.mysql.jdbc.Connection) conn, stmt);
        }
    }
}