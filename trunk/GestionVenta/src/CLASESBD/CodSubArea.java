/*
 * Clase que permite acceder a las subareas de un determinado producto de la
 * base de datos, permite crear nuevas subareas de productos.
 */
package CLASESBD;

import java.sql.ResultSet;

/**
 *
 * @author Peter Hansen Lobos
 */
public class CodSubArea {
    
    private int idCod;
    private int idArea;
    private int idSubArea;
    private String descrip;
    private String activo;
    private String timeStamp;

    /**
     * @return the idCod
     */
    public int getIdCod() {
        return idCod;
    }

    /**
     * @param idCod the idCod to set
     */
    public void setIdCod(int idCod) {
        this.idCod = idCod;
    }

    /**
     * @return the idArea
     */
    public int getIdArea() {
        return idArea;
    }

    /**
     * @param idArea the idArea to set
     */
    public void setIdArea(int idArea) {
        this.idArea = idArea;
    }

    /**
     * @return the idSubArea
     */
    public int getIdSubArea() {
        return idSubArea;
    }

    /**
     * @param idSubArea the idSubArea to set
     */
    public void setIdSubArea(int idSubArea) {
        this.idSubArea = idSubArea;
    }

    /**
     * @return the descrip
     */
    public String getDescrip() {
        return descrip;
    }

    /**
     * @param descrip the descrip to set
     */
    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    /**
     * @return the activo
     */
    public String getActivo() {
        return activo;
    }

    /**
     * @param activo the activo to set
     */
    public void setActivo(String activo) {
        this.activo = activo;
    }

    /**
     * @return the timeStamp
     */
    public String getTimeStamp() {
        return timeStamp;
    }

    /**
     * @param timeStamp the timeStamp to set
     */
    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    /**
     *@param contructor vacio de la clase, crea una instancia vacia.
     */
    public CodSubArea() {
    }

    /**
     *
     * @param idArea
     * @param idSubArea
     */
    public CodSubArea(int id_Area, int id_SubArea) {
        try {
            String sql = "SELECT `ID_SUB`, `ID_ARE`, `ID_SAR`, `DESCRI`, `ACTIVO`, `TIMESTAMP` "
                    + "FROM fac_cosare "
                    + "WHERE `ID_ARE` = "+id_Area+" AND `ID_SAR` = "+id_SubArea+";";
            ResultSet objRes;
            Conexion.sentencia = Conexion.conn.prepareStatement(sql);
            objRes = Conexion.sentencia.executeQuery(sql);
            
            while (objRes.next()) {                
                idCod     = objRes.getInt(1);
                idArea    = objRes.getInt(2);
                idSubArea = objRes.getInt(3);
                descrip   = objRes.getString(4);
                activo     = objRes.getString(5);
                timeStamp = objRes.getString(6);
                
            }   
        } catch (Exception e) {
        }
    }
    
    
}
