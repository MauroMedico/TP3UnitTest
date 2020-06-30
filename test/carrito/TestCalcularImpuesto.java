package carrito;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestCalcularImpuesto {
  
    @Test
    public void TestCalcularImpuesto() 
    {
        double resultado = Carrito.CalcularImp(1000.0);
        double esperado = 1210.0; // 1000 + (1000*0.21) = 1210
       assertEquals(esperado, resultado, 0.0001);
    } 
}
