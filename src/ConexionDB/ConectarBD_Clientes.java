
package ConexionDB;
import java.sql.*;

/**
 *
 * @author miguel
 */
public class ConectarBD_Clientes {
    public ConectarBD_Clientes(){}  // onstructor vacio

    public ResultSet conecxion() {
        ResultSet myResulset = null;
        try {
            Connection miconexionDB = DriverManager.getConnection("jdbc:mysql://localhost:3306/carrito","root","");
            
            Statement myStatement =miconexionDB.createStatement();
            
             myResulset= myStatement.executeQuery("SELECT * FROM producto");
            
            while(myResulset.next()){
                System.out.println(" producto "+ myResulset.getString("nomProd") + " : descripcion "+ myResulset.getString("descProd"));
              
            }

        } catch (Exception e) {
            System.out.println("fallo la conexion a la bd :"+e.getMessage());
        }
        return myResulset;
    }
}
