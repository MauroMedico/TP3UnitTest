package carrito;

import Producto.Producto;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestCargarProducto {
    
    @Test
    public void TestCargarProducto() 
    {
        
        Producto producto = new Producto("Samsung X","Pantalla 28 pulg");
        
        assertNotEquals(true, producto.getNombre().length()==0 || producto.getDetalle().length()==0);  
        
    }
    
 
}
