
package carrito;

import java.sql.Date;

/**
 *
 * @author miguel
 */
public class prodenlistaPedido {
    int codListaPedido;
    Producto clienteListaProducto;
    Pedido clienteenListaPedido;
    int cantidadPedida;
    Date fechaListaAdd;

    public prodenlistaPedido(int codListaPedido, Producto clienteListaProducto, Pedido clienteenListaPedido, int cantidadPedida, Date fechaListaAdd) {
        this.codListaPedido = codListaPedido;
        this.clienteListaProducto = clienteListaProducto;
        this.clienteenListaPedido = clienteenListaPedido;
        this.cantidadPedida = cantidadPedida;
        this.fechaListaAdd = fechaListaAdd;
    }

    public int getCodListaPedido() {
        return codListaPedido;
    }

    public Producto getClienteListaProducto() {
        return clienteListaProducto;
    }

    public Pedido getClienteenListaPedido() {
        return clienteenListaPedido;
    }

    public int getCantidadPedida() {
        return cantidadPedida;
    }

    public Date getFechaListaAdd() {
        return fechaListaAdd;
    }
    
    
    
    
}
