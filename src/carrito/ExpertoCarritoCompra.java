package carrito;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author miguel
 */
public class ExpertoCarritoCompra {

    ObjetosBaseD listadoActual;
    StrucMostrarProd pr;
    int cantMinima;

    public ExpertoCarritoCompra() {
        cantMinima = 5;
        // ObjetosBaseD listadoActual; // SIMULADO ASI PORQUE NO CONECTO AUN LA BD
        listadoActual = new ObjetosBaseD();
    }

    public void iniciarCarrito() {
        ArrayList productos = new ArrayList();

        for (Object caract : listadoActual.devuelveLista()) {

            pr = new StrucMostrarProd();
            
            pr.setnProd(new String("" + ((prodenlistaPedido) caract).getClienteListaProducto().getNomProd()));
            pr.setImProd(((prodenlistaPedido) caract).getClienteListaProducto().getFotos());
            pr.setdProd(new String("" + ((prodenlistaPedido) caract).getClienteListaProducto().getDescProd()));
            pr.setpProd(new String("" + ((prodenlistaPedido) caract).getClienteListaProducto().getValor()));
            pr.setfAddProd(new String("" + ((prodenlistaPedido) caract).getFechaListaAdd().toString()));
            pr.setCantProdSolic(( ((prodenlistaPedido) caract).getCantidadPedida()));
            if (((prodenlistaPedido) caract).getClienteListaProducto().getStockProd() < cantMinima && (cantMinima > 0)) {
                pr.setMsjAlerta(new String("Cosultar Stock, casi agotado"));
            }
            if (((prodenlistaPedido) caract).getClienteListaProducto().getStockProd() == 0) {
                pr.setMsjAlerta(new String("Producto AGOTADO"));
            }

            productos.add(pr);  //inserto al info en carrito de cad producto y detalles
        }

        Carrito micarrito = new Carrito(productos); // envio productos  y  detalles al carrito
        micarrito.mostratCarrito();

    }

    public void agregarAlCarrito(Producto p, int Cantidad) {

    }

    public ArrayList eliminar(int codigo) {
        ArrayList h = listadoActual.devuelveLista();
       
        for (Iterator i = h.iterator(); i.hasNext(); ) {
       Object t = i.next();

       if (codigo == ((prodenlistaPedido) t).getClienteListaProducto().getCodProducto()) {
           i.remove();
       }
}
  
          
        

        return h;

    }

    public int contarProdCarrito() {
        int cant = listadoActual.devuelveLista().size();
        return cant;

    }

    public void mostrarProd() {
    }

}
