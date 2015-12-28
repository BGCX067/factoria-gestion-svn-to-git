/*
 * Esta clase permite acceder a las comunas.
 */
package CLASESBD;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Peter Hansen Lobos
 */
public class Comuna {

    private String idComuna;
    private String nomComuna;
    private int idCiudad;

    /**
     * @return the idComuna
     */
    public String getIdComuna() {
        return idComuna;
    }

    /**
     * @param idComuna the idComuna to set
     */
    public void setIdComuna(String idComuna) {
        this.idComuna = idComuna;
    }

    /**
     * @return the nomComuna el nombre de la comuna
     */
    public String getNomComuna() {
        return nomComuna;
    }

    /**
     * @param nomComuna the nomComuna to set e nombre de la comuna
     */
    public void setNomComuna(String nomComuna) {
        this.nomComuna = nomComuna;
    }

    /**
     * @return the idCiudad el id de la ciudad de la comuna relacionada
     */
    public int getIdCiudad() {
        return idCiudad;
    }

    /**
     * @param idCiudad the idCiudad to set el id de la ciudad de la comuna
     * relacionada
     */
    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }

    //----------------------------------------------------------------------
    //       area de constructores
    //----------------------------------------------------------------------    
    /**
     * @param contructor crea una instancia vacia de la clase.
     */
    public Comuna() {
    }

    /**
     *
     * @param id_com filtra por el id de la comuna para obtener una instancia.
     */
    public Comuna(String id_com) {
        try {
            String sql = "SELECT `ID_COMUNA`, `NOM_COMUNA`, `ID_CIUDAD` "
                    + "FROM fac_comuna "
                    + "WHERE `ID_COMUNA` = '" + id_com + "';";
            ResultSet objRes;
            Conexion.sentencia = Conexion.conn.prepareStatement(sql);
            objRes = Conexion.sentencia.executeQuery(sql);

            while (objRes.next()) {
                idComuna = objRes.getString(1);
                nomComuna = objRes.getString(2);
                idCiudad = objRes.getInt(3);
            }
        } catch (Exception e) {
        } finally {
        }
    }
 
    /**
     *
     * @param id_com filtra por el id de la comuna para obtener una instancia
     * @param id_ciu filtra por el id de la ciudad para obtener una instancia
     */
    public Comuna(String id_com, int id_ciu) {
        try {
            String sql = "SELECT `ID_COMUNA`, `NOM_COMUNA`, `ID_CIUDAD` "
                    + "FROM fac_comuna "
                    + "WHERE `ID_COMUNA` = '" + id_com + "' AND `ID_CIUDAD` = " + id_ciu + ";";
            ResultSet objRes;
            Conexion.sentencia = Conexion.conn.prepareStatement(sql);
            objRes = Conexion.sentencia.executeQuery(sql);

            while (objRes.next()) {
                idComuna = objRes.getString(1);
                nomComuna = objRes.getString(2);
                idCiudad = objRes.getInt(3);
            }
        } catch (Exception e) {
        } finally {
        }
    }

    
    //-------------------------------------------------------------------------
    //      area de combos
    //-------------------------------------------------------------------------  
    
    
    
    /**
     * @param id_ciud filtra por el id de la ciudad que seleccionamos
     * @return todas la comunas asociadas a una ciudad indicada
     * @throws SQLException
     */
    public static ResultSet listarComboComunas(int id_ciud) throws SQLException {
        String strSql;
        strSql = "SELECT `NOM_COMUNA` "
                + "FROM fac_comuna "
                + "WHERE `ID_CIUDAD` = " + id_ciud + " "
                + "ORDER BY `NOM_COMUNA` ASC;";
        ResultSet objRes;
        Conexion.sentencia = Conexion.conn.prepareStatement(strSql);
        objRes = Conexion.sentencia.executeQuery(strSql);

        return objRes;
    }
}
