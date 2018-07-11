
package dao;

import java.sql.SQLException;
import java.util.List;
import modelo.Cliente;

public interface BaseDao {
    void salvar(Object o) throws SQLException;
    void alterar(Object o) throws SQLException;
    void excluir(Integer id) throws SQLException;
    Object pesquisarPorId(Integer id)throws SQLException;
    List pesquisarTodos()throws SQLException;
}
