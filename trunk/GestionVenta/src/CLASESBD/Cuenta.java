/*
 * clase que permitira acceder  los atributos de la tabla FAC_CUENTA. cuenta corrientes.
 */
package CLASESBD;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

/**
 *
 * @author Peter Hansen Lobos
 */
public class Cuenta {

    private int idCuenta;
    private String nomCuenta;
    private String rutTitul;
    private String numCuenta;
    private String nomBanco;
    private String tipoMoned;
    private Date fechaInscrip;
    private double saldoPesos;
    private double saldoDolar;
    private String stamp;

    /**
     * @return the idCuenta de la cuenta corriente
     */
    public int getIdCuenta() {
        return idCuenta;
    }

    /**
     * @param idCuenta the idCuenta to set de la cuenta corriente
     */
    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
    }

    /**
     * @return the nomCuenta nombre de la cuenta de la cuenta corriente
     */
    public String getNomCuenta() {
        return nomCuenta;
    }

    /**
     * @param nomCuenta the nomCuenta to set el nombre de la cuenta de la cuenta
     * corriente
     */
    public void setNomCuenta(String nomCuenta) {
        this.nomCuenta = nomCuenta;
    }

    /**
     * @return the rutTitul el rut titular de la cuenta corriente
     */
    public String getRutTitul() {
        return rutTitul;
    }

    /**
     * @param rutTitul the rutTitul to set el rut titular de la cuenta corriente
     */
    public void setRutTitul(String rutTitul) {
        this.rutTitul = rutTitul;
    }

    /**
     * @return the numCuenta el numero de cuenta de la cuenta corriente
     */
    public String getNumCuenta() {
        return numCuenta;
    }

    /**
     * @param numCuenta the numCuenta to set el numero de cuenta de la cuenta
     * corriente
     */
    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    /**
     * @return the nomBanco el nombre del banco de la cuenta corriente
     */
    public String getNomBanco() {
        return nomBanco;
    }

    /**
     * @param nomBanco the nomBanco to set el nombre del banco de la cuenta
     * corriente
     */
    public void setNomBanco(String nomBanco) {
        this.nomBanco = nomBanco;
    }

    /**
     * @return the tipoMoned el tipo de moneda CLP USD de la cuenta corriente
     */
    public String getTipoMoned() {
        return tipoMoned;
    }

    /**
     * @param tipoMoned the tipoMoned to set el tipo de moneda CLP USD de la
     * cuenta corriente
     */
    public void setTipoMoned(String tipoMoned) {
        this.tipoMoned = tipoMoned;
    }

    /**
     * @return the fechaInscrip la fecha de inscripcion de la cuenta corriente
     */
    public Date getFechaInscrip() {
        return fechaInscrip;
    }

    /**
     * @param fechaInscrip the fechaInscrip to set la fecha de inscripcion de la
     * cuenta corriente
     */
    public void setFechaInscrip(Date fechaInscrip) {
        this.fechaInscrip = fechaInscrip;
    }

    /**
     * @return the saldoPesos el saldo en CLP de la cuenta corriente
     */
    public double getSaldoPesos() {
        return saldoPesos;
    }

    /**
     * @param saldoPesos the saldoPesos to set el saldo CLP de la cuenta
     * corriente
     */
    public void setSaldoPesos(double saldoPesos) {
        this.saldoPesos = saldoPesos;
    }

    /**
     * @return the saldoDolar el saldo en USD de la cuenta corriente
     */
    public double getSaldoDolar() {
        return saldoDolar;
    }

    /**
     * @param saldoDolar the saldoDolar to set el saldo en USD de la cuenta
     * corriente
     */
    public void setSaldoDolar(double saldoDolar) {
        this.saldoDolar = saldoDolar;
    }

    /**
     * @return the stamp el stamp de l nuevo registro en la tabla
     */
    public String getStamp() {
        return stamp;
    }

    /**
     * @param stamp the stamp to set el stamp del nuevo registro en la tabla
     */
    public void setStamp(String stamp) {
        this.stamp = stamp;
    }

    /**
     * @param crea constructor de instancia vacia de la clase
     */
    public Cuenta() {
    }

    //----------------------------------------------------------------------
    //       area de constructores
    //----------------------------------------------------------------------    
    /**
     *
     * @param id_cta Contructor que recibe como parametro el id.
     */
    public Cuenta(int id_cta) {

        try {
            String sql = "select `ID_CTA`, `NOM_CTA`, `RUT_TIT`, `NUM_CTA`, `BANCO`, `MONE`, `FECHA`, `MTO_CLP`, `MTO_USD`, `TIMESTAMP` \n"
                    + "from fac_cuenta "
                    + "where `ID_CTA` = " + id_cta + " ;";
            ResultSet objRes;
            Conexion.sentencia = Conexion.conn.prepareStatement(sql);
            objRes = Conexion.sentencia.executeQuery(sql);

            while (objRes.next()) {
                idCuenta = objRes.getInt(1);
                nomCuenta = objRes.getString(2);
                rutTitul = objRes.getString(3);
                numCuenta = objRes.getString(4);
                nomBanco = objRes.getString(5);
                tipoMoned = objRes.getString(6);
                fechaInscrip = objRes.getDate(7);
                saldoPesos = objRes.getDouble(8);
                saldoDolar = objRes.getDouble(9);
                stamp = objRes.getString(10);
            }
        } catch (Exception e) {
        } finally {
        }
    }

    /**
     *
     * @param nombreCuenta carga una instancia segun el nombre de la cuenta ej:
     * proveedores.
     */
    public Cuenta(String nombreCuenta) {

        try {
            String sql = "select `ID_CTA`, `NOM_CTA`, `RUT_TIT`, `NUM_CTA`, `BANCO`, `MONE`, `FECHA`, `MTO_CLP`, `MTO_USD`, `TIMESTAMP` \n"
                    + "from fac_cuenta "
                    + "where `NOM_CTA` = '" + nombreCuenta + "' ;";
            ResultSet objRes;
            Conexion.sentencia = Conexion.conn.prepareStatement(sql);
            objRes = Conexion.sentencia.executeQuery(sql);

            while (objRes.next()) {
                idCuenta = objRes.getInt(1);
                nomCuenta = objRes.getString(2);
                rutTitul = objRes.getString(3);
                numCuenta = objRes.getString(4);
                nomBanco = objRes.getString(5);
                tipoMoned = objRes.getString(6);
                fechaInscrip = objRes.getDate(7);
                saldoPesos = objRes.getDouble(8);
                saldoDolar = objRes.getDouble(9);
                stamp = objRes.getString(10);
            }
        } catch (Exception e) {
        } finally {
        }
    }

    public static ResultSet listarComboCuentas(String moned) throws SQLException {
        String strSql;
        strSql = "SELECT `NUM_CTA` "
                + "FROM fac_cuenta "
                + "WHERE `MONE` = '" + moned + "' "
                + "ORDER BY `NUM_CTA` ASC;";
        ResultSet objRes;
        Conexion.sentencia = Conexion.conn.prepareStatement(strSql);
        objRes = Conexion.sentencia.executeQuery(strSql);

        return objRes;
    }

    public static ResultSet listarComboCuentas() throws SQLException {
        String strSql;
        strSql = "SELECT `NUM_CTA` "
                + "FROM fac_cuenta "
                + "ORDER BY `NUM_CTA` ASC;";
        ResultSet objRes;
        Conexion.sentencia = Conexion.conn.prepareStatement(strSql);
        objRes = Conexion.sentencia.executeQuery(strSql);

        return objRes;
    }

    public static ResultSet listarComboCuentasNombres() throws SQLException {
        String strSql;
        strSql = "SELECT `NOM_CTA` "
                + "FROM fac_cuenta "
                + "ORDER BY `NOM_CTA` ASC;";
        ResultSet objRes;
        Conexion.sentencia = Conexion.conn.prepareStatement(strSql);
        objRes = Conexion.sentencia.executeQuery(strSql);

        return objRes;
    }
}
