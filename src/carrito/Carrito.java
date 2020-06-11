
package carrito;

public class Carrito {

  public static double CalcularImp (double monto)
  {   
      return monto + (monto*0.21);
  }
  
  public static boolean ComprobarCantidadProductosMayorCero(int cantProductos) {
      
  return cantProductos>0;
  }
  //Creo un producto con stock
  static Producto a = new Producto(001, "Celular", 10000,3);
  public static int AgregarProductosNoMayorCantidadStock(int idProducto,int cantAAgregar) {
        if (idProducto == a.idProducto && cantAAgregar <= a.stock ) {
          return a.stock = a.stock - cantAAgregar;
                  
      }
        return -1;
      
    }
    
}
