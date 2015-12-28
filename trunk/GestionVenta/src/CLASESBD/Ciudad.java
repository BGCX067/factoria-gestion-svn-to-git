/*
 * Esta clase permite acceder a las ciudades y listarlas.
 */
package CLASESBD;

import java.sql.ResultSet;

/**
 *
 * @author Peter Hansen Lobos
 */
public class Ciudad {
    private int idCiudad;
    private String nomCiudad;
    private String numCiudad;
    private String zona;
    private int  corr;

    /**
     * @return the idCiudad de la tabla Ciudad
     */
    public int getIdCiudad() {
        return idCiudad;
    }

    /**
     * @param idCiudad the idCiudad to set de la tabla Ciudad
     */
    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }

    /**
     * @return the nomCiudad de la tabla Ciudad
     */
    public String getNomCiudad() {
        return nomCiudad;
    }

    /**
     * @param nomCiudad the nomCiudad to set de la tabla Ciudad
     */
    public void setNomCiudad(String nomCiudad) {
        this.nomCiudad = nomCiudad;
    }

    /**
     * @return the numCiudad de la tabla Ciudad
     */
    public String getNumCiudad() {
        return numCiudad;
    }

    /**
     * @param numCiudad the numCiudad to set de la tabla Ciudad
     */
    public void setNumCiudad(String numCiudad) {
        this.numCiudad = numCiudad;
    }

    /**
     * @return the zona de la tabla Ciudad
     */
    public String getZona() {
        return zona;
    }

    /**
     * @param zona the zona to set de la tabla Ciudad
     */
    public void setZona(String zona) {
        this.zona = zona;
    }

    /**
     * @return the corr correletivo de la tabla Ciudad
     */
    public int getCorr() {
        return corr;
    }

    /**
     * @param corr the corr to set correlativo de la tabla Ciudad
     */
    public void setCorr(int corr) {
        this.corr = corr;
    }

    /**
     *@param contructor vacio de la clase.    
     */
    public Ciudad() {
    }

    /**
     *
     * @param id_ciudad
     */
    public Ciudad(int id_ciudad) {
        try {
            String sql = "SELECT `ID_CIUDAD`, `NOM_CIUDAD`, `NUM_R`, `ZONA`, `CORR` "
                    + "from fac_ciudad "
                    + "WHERE `ID_CIUDAD` = "+id_ciudad+";";
            ResultSet objRes;
            Conexion.sentencia = Conexion.conn.prepareStatement(sql);
            objRes = Conexion.sentencia.executeQuery(sql);
            
            while (objRes.next()) {
                idCiudad = objRes.getInt(1);
                nomCiudad = objRes.getString(2);               
                numCiudad = objRes.getString(3);
                zona = objRes.getString(4);
                corr = objRes.getInt(5);
            }            
        } catch (Exception e) {
        }                
    }
     
    
    
}
