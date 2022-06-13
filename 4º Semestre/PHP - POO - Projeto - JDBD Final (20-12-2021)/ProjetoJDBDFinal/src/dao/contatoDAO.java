package dao;

import connection.ConnectionFactory;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import model.Contato;

public class contatoDAO {
    public void inserir(Contato contato){
        Connection conn = ConnectionFactory.getConnection();
        Statement stmt = null;
       
       /*String sql = "INSERT INTO contatoo (nome, email, telefone) "
                + "values  ('Messi', 'messi@email.com.br', '(21)9999-9999')";*/
        String sql = "INSERT INTO contato (nome, email, telefone) values"
                + "('" + contato.getNome()+ "', '" + contato.getEmail()+ "', '" + contato.getTelefone()+ "')";
        try {
            stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            System.out.println("Contato inserido com sucesso");
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        } finally {
            System.out.println("Conexão fechada com sucesso!");
            ConnectionFactory.closeConnection((com.mysql.jdbc.Connection) conn, stmt);

        }
    }
    public void excluir (Contato contato){
Connection conn = ConnectionFactory.getConnection();
Statement stmt = null;

String sql = "delete from contato where id='" + contato.getId() + "'";
        try {
            stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            System.out.println("Contato excluído com sucesso");
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        } finally {
            System.out.println("Conexão fechada com sucesso!");
            ConnectionFactory.closeConnection((com.mysql.jdbc.Connection) conn, stmt);
        }
    }
}