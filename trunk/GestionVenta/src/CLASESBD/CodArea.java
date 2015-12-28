/*
 *Clase para acceder a las areas de un producto en particular de la Base de datos
 * tambien permite realizar filtros para futuros informes segun el concepto 
 */
package CLASESBD;

import java.sql.ResultSet;

/**
 *
 * @author Peter Hansen Lobos
 */
public class CodArea {

    private int idCod;
    private String areaDesc;
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
     * @return the areaDesc
     */
    public String getAreaDesc() {
        return areaDesc;
    }

    /**
     * @param areaDesc the areaDesc to set
     */
    public void setAreaDesc(String areaDesc) {
        this.areaDesc = areaDesc;
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
     *@param Contructor Vacio , cra una instancia vacia de la clase
     */
    public CodArea() {
    }

    /**
     *
     * @param c1
     * @param c2
     */
    public CodArea(int cod_id) {
        try {
            String sql = "SELECT `ID_COD`, `DESCRI`, `ACTIVO`, `TIMESTAMP` "
                    + "FROM fac_coarea "
                    + "WHERE `ID_COD` = "+cod_id+";";
            ResultSet objRes;
            Conexion.sentencia = Conexion.conn.prepareStatement(sql);
            objRes = Conexion.sentencia.executeQuery(sql);

            while (objRes.next()) {
                idCod = objRes.getInt(1);
                areaDesc = objRes.getString(2);
                activo = objRes.getString(3);
                timeStamp = objRes.getString(4);
            }
        } catch (Exception e) {
        }
    }
}
