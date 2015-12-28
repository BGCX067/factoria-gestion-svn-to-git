
package CLASESBD;

import INTERFAZ.frmLogin;
import INTERFAZ.frmMenuPrincipal;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Peter Hansen Lobos
 */
public class GestionVenta {

    /**
     * @param args the command line arguments
     * @throws UnsupportedLookAndFeelException  
     */
    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        
        
        //--iniciamos la conexion.
        Conexion.connect_on();
        
        //--seteamos la piel de la aplicacion
        JFrame.setDefaultLookAndFeelDecorated(true);
        //UIManager.setLookAndFeel(new com.nilo.plaf.nimrod.NimRODLookAndFeel());
        
        
        //--hacemos visible el menu principal
        //frmMenuPrincipal inicio = new frmMenuPrincipal();
        frmLogin inicio = new frmLogin();
        inicio.setLocationRelativeTo(null);
        inicio.setVisible(true);
       
    }
}
