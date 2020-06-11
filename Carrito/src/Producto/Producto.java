package Producto;


public class Producto {
    public String nombre;
    public String detalle;

    public Producto(String a, String b)
    {
        this.nombre = a;
        this.detalle = b;
    }
    
    public String getNombre()
    {
        return nombre;
    }
    public String getDetalle()
    {
        return detalle;
    }
    public void setNombre(String n)
    {
        nombre = n;
    }
    public void setDetalle(String e)
    {
        detalle = e;
    }
    
    
}
