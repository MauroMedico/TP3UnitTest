/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrito;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mativ
 */
public class TestComprobarCantidadProductosMayorCero {
    
    @Test
    public void TestComprobarCantidadProductosMayorCero() {
        
        boolean resultado = Carrito.ComprobarCantidadProductosMayorCero(5);
        boolean esperado = true; // 
       assertEquals(esperado, resultado);
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
}
