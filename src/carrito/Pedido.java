
package carrito;

/**
 *
 * @author miguel
 */
public class Pedido {
    int nroPedido;
    Cliente clientePedido;
    pedidoEstado pedEstado[];
    double montoActualSinImpuesto;
    double montoTotalconImpuestos;

    public Pedido(int nroPedido, Cliente clientePedido, pedidoEstado pedEstado) {
        this.nroPedido = nroPedido;
        this.clientePedido = clientePedido;
        this.pedEstado=new pedidoEstado[10];
        this.pedEstado[0] = pedEstado;
        this.montoActualSinImpuesto = 0;
        this.montoTotalconImpuestos = 0;
    }
   

    public int getNroPedido() {
        return nroPedido;
    }

    public Cliente getClientePedido() {
        return clientePedido;
    }

    public pedidoEstado[] getPedEstado() {
        return pedEstado;
    }

    public double getMontoActualSinImpuesto() {
        return montoActualSinImpuesto;
    }

    public double getMontoTotalconImpuestos() {
        return montoTotalconImpuestos;
    }

    public void setPedEstado(pedidoEstado[] pedEstado) {
        this.pedEstado = pedEstado;
    }

    public void setMontoActualSinImpuesto(double montoActualSinImpuesto) {
        this.montoActualSinImpuesto = montoActualSinImpuesto;
    }

    public void setMontoTotalconImpuestos(double montoTotalconImpuestos) {
        this.montoTotalconImpuestos = montoTotalconImpuestos;
    }
    
    public void AddPedidoEstado(pedidoEstado pe){
    this.pedEstado[pedEstado.length]=pe;
    }

}
