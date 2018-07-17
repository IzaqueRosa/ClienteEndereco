
package dao;

import java.util.List;
import modelo.Cliente;
import org.junit.Test;
import static org.junit.Assert.*;

public class ClienteDaoImplTest {
    private Cliente c;
    private ClienteDao clienteDao;
    
    public ClienteDaoImplTest() {
        clienteDao = new ClienteDaoImpl();
    }

//    @Test
    public void testPesquisarPorNome() throws Exception {
        System.out.println("pesquisarPorNome");
    }

    @Test
    public void testSalvar() throws Exception {
        System.out.println("salvar");
        c = new Cliente(null, "Izaque Rosa2", "058.916.409-02", "izaque_mp@hotmail.com", 2500.00);
        clienteDao.salvar(c);
        System.out.println(c.getId());
    }

//    @Test
    public void testAlterar() throws Exception {
        System.out.println("alterar");
        Object o = null;
        ClienteDaoImpl instance = new ClienteDaoImpl();
        instance.alterar(o);
        fail("The test case is a prototype.");
    }

//    @Test
    public void testExcluir() throws Exception {
        System.out.println("excluir");
        Integer id = null;
        ClienteDaoImpl instance = new ClienteDaoImpl();
        instance.excluir(id);
        fail("The test case is a prototype.");
    }

//    @Test
    public void testPesquisarPorId() throws Exception {
        System.out.println("pesquisarPorId");
        Integer id = null;
        ClienteDaoImpl instance = new ClienteDaoImpl();
        Object expResult = null;
        Object result = instance.pesquisarPorId(id);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

//    @Test
    public void testPesquisarTodos() throws Exception {
        System.out.println("pesquisarTodos");
        ClienteDaoImpl instance = new ClienteDaoImpl();
        List expResult = null;
        List result = instance.pesquisarTodos();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
