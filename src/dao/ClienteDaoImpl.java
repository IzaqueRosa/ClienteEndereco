
package dao;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import modelo.Cliente;

public class ClienteDaoImpl implements ClienteDao, Serializable{
    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;

    @Override
    public List<Cliente> pesquisarPorNome(String nome) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void salvar(Object o) throws SQLException {
        Cliente c = (Cliente) o;
        String sql = "INSERT INTO cliente (nome,cpf,email,salario) VALUES (?, ?, ?, ?)";
        try {
            conn = FabricaConexao.abreConexao();
            ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, c.getNome());
            ps.setString(2, c.getCpf());
            ps.setString(3, c.getEmail());
            ps.setDouble(4, c.getSalario());
            ps.executeUpdate();
            rs = ps.getGeneratedKeys();
            rs.next();
            //O (1) se refere a primeira coluna do banco de dados
            c.setId(rs.getInt(1));
        } finally {
            conn.close();
            ps.close();
            rs.close();
        }
    }

    @Override
    public void alterar(Object o) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluir(Integer id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object pesquisarPorId(Integer id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List pesquisarTodos() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
