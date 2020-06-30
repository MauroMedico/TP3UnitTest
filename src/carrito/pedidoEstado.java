
package carrito;

import java.sql.Date;

/**
 *
 * @author miguel
 */
public class pedidoEstado {
    Date fechapedidoEstado;
    EstadoPedido EP;

    public pedidoEstado(Date fechapedidoEstado, EstadoPedido EP) {
        this.fechapedidoEstado = fechapedidoEstado;
        this.EP = EP;
    }

    public Date getFechapedidoEstado() {
        return fechapedidoEstado;
    }

    public EstadoPedido getEP() {
        return EP;
    }
    
    
}
