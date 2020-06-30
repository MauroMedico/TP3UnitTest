
package TestDeleteProdCarrito;

import carrito.Producto;
import carrito.Cliente;
import carrito.EstadoPedido;
import carrito.ExpertoCarritoCompra;
import carrito.Main;
import carrito.Pedido;
import carrito.pedidoEstado;
import carrito.prodenlistaPedido;
import java.sql.Date;
import junit.framework.Assert;
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
public class EliminatProdCarrito {

   ExpertoCarritoCompra ExpertoCC;

    public EliminatProdCarrito() {    }

    @BeforeClass
    public static void setUpClass() {
    }
    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        ExpertoCC = new ExpertoCarritoCompra();
        int cantActual;
        cantActual = ExpertoCC.contarProdCarrito();
        System.out.println("antes de eliminar hay:" + cantActual);    }
    @After
    public void tearDown() {    }

    @Test
    public void eliminarProdPedido() {
        int esperado;
        int codigoprueba = 101;  //Producto p1 = new Producto(101, "Altavoces LogiLoad",
        esperado = ExpertoCC.contarProdCarrito() - 1;

        ExpertoCC.eliminar(codigoprueba);

        int resultado = ExpertoCC.contarProdCarrito();
        System.out.println("luego de eliminar hay:" + resultado);
        Assert.assertEquals(esperado, resultado);    }

}
