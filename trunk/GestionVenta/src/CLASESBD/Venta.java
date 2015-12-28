/*
 *Clase que permite acceder a la tabla FAC_VENTA, para registrar movimientos
 */
package CLASESBD;

import java.sql.ResultSet;
import java.util.Date;

/**
 *
 * @author Peter Hansen Lobos
 */
public class Venta {
    
    private int idVta;
    private String idPed;
    private String idTipo;
    private String nBoleta;
    private int idCta;
    private int idSuc;
    private Date fecha;
    private int idPago;
    private String idUser;
    private double mtoDcto;
    private double mtoSIva;
    private double mtoTotal;
    private String timeStamp;

    /**
     * @return the idVta
     */
    public int getIdVta() {
        return idVta;
    }

    /**
     * @param idVta the idVta to set
     */
    public void setIdVta(int idVta) {
        this.idVta = idVta;
    }

    /**
     * @return the idPed
     */
    public String getIdPed() {
        return idPed;
    }

    /**
     * @param idPed the idPed to set
     */
    public void setIdPed(String idPed) {
        this.idPed = idPed;
    }

    /**
     * @return the idTipo
     */
    public String getIdTipo() {
        return idTipo;
    }

    /**
     * @param idTipo the idTipo to set
     */
    public void setIdTipo(String idTipo) {
        this.idTipo = idTipo;
    }

    /**
     * @return the nBoleta
     */
    public String getnBoleta() {
        return nBoleta;
    }

    /**
     * @param nBoleta the nBoleta to set
     */
    public void setnBoleta(String nBoleta) {
        this.nBoleta = nBoleta;
    }

    /**
     * @return the idCta
     */
    public int getIdCta() {
        return idCta;
    }

    /**
     * @param idCta the idCta to set
     */
    public void setIdCta(int idCta) {
        this.idCta = idCta;
    }

    /**
     * @return the idSuc
     */
    public int getIdSuc() {
        return idSuc;
    }

    /**
     * @param idSuc the idSuc to set
     */
    public void setIdSuc(int idSuc) {
        this.idSuc = idSuc;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the idPago
     */
    public int getIdPago() {
        return idPago;
    }

    /**
     * @param idPago the idPago to set
     */
    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    /**
     * @return the idUser
     */
    public String getIdUser() {
        return idUser;
    }

    /**
     * @param idUser the idUser to set
     */
    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    /**
     * @return the mtoDcto
     */
    public double getMtoDcto() {
        return mtoDcto;
    }

    /**
     * @param mtoDcto the mtoDcto to set
     */
    public void setMtoDcto(double mtoDcto) {
        this.mtoDcto = mtoDcto;
    }

    /**
     * @return the mtoSIva
     */
    public double getMtoSIva() {
        return mtoSIva;
    }

    /**
     * @param mtoSIva the mtoSIva to set
     */
    public void setMtoSIva(double mtoSIva) {
        this.mtoSIva = mtoSIva;
    }

    /**
     * @return the mtoTotal
     */
    public double getMtoTotal() {
        return mtoTotal;
    }

    /**
     * @param mtoTotal the mtoTotal to set
     */
    public void setMtoTotal(double mtoTotal) {
        this.mtoTotal = mtoTotal;
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

    public Venta() {
    }

    public Venta(String nBoleta) {
        try {
            String sql = ";";
            ResultSet objRes;
            Conexion.sentencia = Conexion.conn.prepareStatement(sql);
            objRes = Conexion.sentencia.executeQuery(sql);
            
            while (objRes.next()) {                
                
            }   
        } catch (Exception e) {
        }
    }

    public Venta(int idVta, String idTipo, int idSuc) {
        try {
            String sql = ";";
            ResultSet objRes;
            Conexion.sentencia = Conexion.conn.prepareStatement(sql);
            objRes = Conexion.sentencia.executeQuery(sql);
            
            while (objRes.next()) {                
                
            }   
        } catch (Exception e) {
        }
    }

    public Venta(String idTipo, int idSuc, String idUser) {
        try {
            String sql = ";";
            ResultSet objRes;
            Conexion.sentencia = Conexion.conn.prepareStatement(sql);
            objRes = Conexion.sentencia.executeQuery(sql);
            
            while (objRes.next()) {                
                
            }   
        } catch (Exception e) {
        }
    }
    
}
