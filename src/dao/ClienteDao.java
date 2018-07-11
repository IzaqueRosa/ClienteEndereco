
package dao;

import java.sql.SQLException;
import java.util.List;
import modelo.Cliente;

public interface ClienteDao extends BaseDao{
    List<Cliente> pesquisarPorNome(String nome) throws SQLException;
}
