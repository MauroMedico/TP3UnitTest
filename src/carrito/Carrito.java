
package carrito;

import java.util.ArrayList;

public class Carrito {

    ArrayList carrito;
    
  public static double CalcularImp (double monto)  {   
      return monto + (monto*0.21);
  }
    
  public  Carrito(ArrayList t){
      carrito=new ArrayList();
      carrito=(ArrayList) t.clone();
      
      }

    void mostratCarrito() {
        for (Object carrito1 : carrito) {
            StrucMostrarProd h=((StrucMostrarProd)carrito1);
                System.out.println("producto: " + h.getnProd()+ " ,descripcion: "+h.getdProd()+" ,precio unitario: "+h.pProd+ " , valor compra: "+((Double.parseDouble(h.pProd)))*(double)h.cantProdSolic
                        + " fecha de insertado: "+h.fAddProd+ " , "+h.msjAlerta);
            
        }

    }

}
