
package carrito;

/**
 *
 * @author miguel
 */
public class Cliente {
    int nroCliente;
    String nombre;
    String apellido;
    int dni;

    public Cliente(int nc, String n, String a, int doc) {
        nroCliente = nc;
        nombre = new String(n);
        apellido = new String(a);
        dni = doc;
    }

    public int getNroCliente() {
        return nroCliente;
    }

    public void setNroCliente(int nroCliente) {
        this.nroCliente = nroCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
}
