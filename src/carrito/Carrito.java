
package carrito;

public class Carrito {

  public static double CalcularImp (double monto)
  {   
      return monto + (monto*0.21);
  }
  
  public static boolean ComprobarCantidadProductosMayorCero(int cantProductos) {
      
  return cantProductos>0;
    }
    
}
