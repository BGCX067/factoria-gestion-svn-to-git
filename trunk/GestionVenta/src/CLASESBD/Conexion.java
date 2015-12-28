/*
 *Clase que gestiona la conexion hacia la Base de Datos Factoria.
 *se debe de hacer un metodo para evaluar si existe conexion, si no hay, reconectar con la BD.
 */

package CLASESBD;
import java.sql.*;
import javax.swing.JOptionPane;


/**
 *
 * @author  Peter Hansen Lobos
 */
public class Conexion {
    
    /*
     *  variables para conexion a localhost
    */
    /**
     * @see bdlh nombre factoria
     */
    public static String bdlh="factoria"; 
    /**
     *
     */
    public static String loginlh="root";
    /**
     *
     */
    public static String passwordlh="";
    /**
     *
     */
    public static int portlh=3306;
    /**
     *
     */
    public static String hostlh="localhost";
    /**
     *
     */
    public static String urllh="jdbc:mysql://"+hostlh+":"+portlh+"/"+bdlh;
    
    
    /*
     *  Variables estaticas para poder utilizarlas como variables generales desde cualquier clase, frame.
     */
    /**
     *
     */
    public static Connection conn;
    /**
     *
     */
    public static Statement sentencia;
    
    ////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     *
     */
    public static void connect_on(){
       Conexion.conectarLocalHost();     
    }                            
    
    /**
     *
     * @throws SQLException
     */
    public static void connect_off() throws SQLException{         
       Conexion.desconectarLocalHost();  
    }
    

    
    /**
     *
     */
    public static void conectarLocalHost() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(urllh, loginlh, passwordlh);
            if (conn != null)
            {
                System.out.println("Conecto a MYSQL " + urllh);
            }
        }catch(SQLException ex) {
            //  new EnvioMail(ex);
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "No se pudo conectar a la Base de datos Remota. reintente nuevamente", "Base de Datos EASA", 0);
            System.exit(0);
        }
        catch(ClassNotFoundException ex) {            
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, urllh, "Imposible Conectar a la BD\nRevise la base de datos", 3);
            System.exit(0);
        }
    }    
    
    
    /**
     *
     * @throws SQLException
     */
    public static void desconectarLocalHost()throws SQLException{
        conn.close();
    }    
       
    
    /**
     *
     * @return retorna el estado de la conexion
     */
    public static Connection getConnection(){
         return conn;
   }

    
}