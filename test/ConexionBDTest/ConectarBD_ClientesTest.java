package ConexionBDTest;

import ConexionDB.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author miguel
 */
public class ConectarBD_ClientesTest {

    ResultSet r = null;

    public ConectarBD_ClientesTest() {
    }
    @Test
    public void conecxionTest() {
        String esperado="bot";
        String obt="";
        ConectarBD_Clientes conex = new ConectarBD_Clientes();
        r = conex.conecxion();
        try {
            while (r.next()) {
                System.out.println("producto" + r.getString(2) + " precio" + r.getString(4));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConectarBD_ClientesTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception e) {
            System.out.println("fallo  :(");
        }
        try {
            obt=(r.getArray(2)).toString();
        } catch (Exception ex) {
            System.out.println("e    "+ ex.getMessage());
        }
        assertEquals("fallo el assert not equals   ",esperado,obt);
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println(" se imprime luego de ejecutar el test");
    }
    
    @Before
    public void setUp() {
        System.out.println("bedore()");
    }
    
    @After
    public void tearDown() {
        System.out.println("after");
    }

}
