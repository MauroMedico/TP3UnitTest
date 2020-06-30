
package carrito;

import java.awt.Image;
import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author miguel
 */
public class ObjetosBaseD {

    ArrayList plis = new ArrayList();

    //CLIENTE
    Cliente cl1 = new Cliente(1, "adam", "sandler", 25447115);
    //Imagen
    Image[] a ;
    Image t;
    // PRODUCTOS
    Producto p1 = new Producto(101, "Altavoces LogiLoad", " altavoces USB con conexion Bluetooth", 200, 320,a);
    Producto p2 = new Producto(102, "Altavoces CPro", " altavoces USB  bifocal", 3, 115,a);
    Producto p3 = new Producto(103, "mouse Idea+", " mouse gamer 5 colores", 100, 899.5,a);
    Producto p4 = new Producto(104, "teclado masstex", " teclado retroiluminado", 0, 2089.9,a);
    Producto p5 = new Producto(105, "pendrive sandisk", " pendrive 124 Gb", 180, 3500.1,a);
    //Estados del pedido
    EstadoPedido ep1 = new EstadoPedido("creado");
    EstadoPedido ep2 = new EstadoPedido("pagado");
    //date
    Date da = new Date(11 / 4 / 2020);

    //Pedido estado
    pedidoEstado pe1 = new pedidoEstado(da, ep1);

    // PEDIDO
    Pedido ped1 = new Pedido(1001, cl1, pe1);

    //ListaProducto  EN PEDIDO
    prodenlistaPedido pelp1 = new prodenlistaPedido(1001, p1, ped1, 2, new Date(5 / 5 / 2020));
    prodenlistaPedido pelp2 = new prodenlistaPedido(1002, p2, ped1, 2, new Date(6 / 5 / 2020));
    prodenlistaPedido pelp3 = new prodenlistaPedido(1003, p4, ped1, 2, new Date(8 / 5 / 2020));

    //prodenlistaPedido[] plis = new prodenlistaPedido[10] ;
    public ObjetosBaseD() {
       // this.t = (Image) imA;
//        a[0]=t;
       // System.out.println("creo BD");
        plis.add(pelp1);
        plis.add(pelp2);
        plis.add(pelp3);
    }
    public ArrayList devuelveLista(){
    
    return plis;
    
    }
    
}
