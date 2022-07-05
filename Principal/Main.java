
package Principal;
import Vistas.*;
import Modelo.*;


public class Main {

  
    public static void main(String[] args) {
       //1. Creamos la instancia de la vista login
        Login login = new Login ();
       //El metodo setVisible hace visible la ventana
        login.setVisible(true);
        
        //Crear instancia de la clase conexion
        Conexión conexion = new Conexión();
        conexion.getConnection();
        
        
    }
    
}
