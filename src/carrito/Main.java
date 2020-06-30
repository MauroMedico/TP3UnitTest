
package carrito;

import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author miguel
 */
public class Main {

    ExpertoCarritoCompra ecc = new ExpertoCarritoCompra();

    public static void main(String[] args) {
        ExpertoCarritoCompra ecc = new ExpertoCarritoCompra();
        ecc.iniciarCarrito();
        ArrayList h = ecc.eliminar(101);

        for (Object t:h) {
            
                System.out.println("productos ahora " + ((prodenlistaPedido)t).getClienteListaProducto().getNomProd() + " posicion: " + h.indexOf(t));


        }

    }

}
