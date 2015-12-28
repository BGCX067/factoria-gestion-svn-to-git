/*
 * Clase que permite manipular los atributos de una remuneracion de un 
 * vendedor, permite acceder a la tabla FAC_REMUNER
 */
package CLASESBD;

import java.sql.ResultSet;
import java.util.Date;

/**
 *
 * @author Peter Hansen Lobos
 */
public class Remuneracion {
    
    private int idRem;
    private int idSuc;
    private int idCta;
    private Date fechaPag;
    private String idUser;
    private String idVend;
    private double gratif;
    private double salud;
    private double mtoComis;  
    private double mtoTrans;  
    private double mtoColac;  
    private double suelBase;  
    private double suelTota;  
    private String timeStamp;  

    /**
     * @return the idRem
     */
    public int getIdRem() {
        return idRem;
    }

    /**
     * @param idRem the idRem to set
     */
    public void setIdRem(int idRem) {
        this.idRem = idRem;
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
     * @return the fechaPag
     */
    public Date getFechaPag() {
        return fechaPag;
    }

    /**
     * @param fechaPag the fechaPag to set
     */
    public void setFechaPag(Date fechaPag) {
        this.fechaPag = fechaPag;
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
     * @return the idVend
     */
    public String getIdVend() {
        return idVend;
    }

    /**
     * @param idVend the idVend to set
     */
    public void setIdVend(String idVend) {
        this.idVend = idVend;
    }

    /**
     * @return the gratif
     */
    public double getGratif() {
        return gratif;
    }

    /**
     * @param gratif the gratif to set
     */
    public void setGratif(double gratif) {
        this.gratif = gratif;
    }

    /**
     * @return the salud
     */
    public double getSalud() {
        return salud;
    }

    /**
     * @param salud the salud to set
     */
    public void setSalud(double salud) {
        this.salud = salud;
    }

    /**
     * @return the mtoComis
     */
    public double getMtoComis() {
        return mtoComis;
    }

    /**
     * @param mtoComis the mtoComis to set
     */
    public void setMtoComis(double mtoComis) {
        this.mtoComis = mtoComis;
    }

    /**
     * @return the mtoTrans
     */
    public double getMtoTrans() {
        return mtoTrans;
    }

    /**
     * @param mtoTrans the mtoTrans to set
     */
    public void setMtoTrans(double mtoTrans) {
        this.mtoTrans = mtoTrans;
    }

    /**
     * @return the mtoColac
     */
    public double getMtoColac() {
        return mtoColac;
    }

    /**
     * @param mtoColac the mtoColac to set
     */
    public void setMtoColac(double mtoColac) {
        this.mtoColac = mtoColac;
    }

    /**
     * @return the suelBase
     */
    public double getSuelBase() {
        return suelBase;
    }

    /**
     * @param suelBase the suelBase to set
     */
    public void setSuelBase(double suelBase) {
        this.suelBase = suelBase;
    }

    /**
     * @return the suelTota
     */
    public double getSuelTota() {
        return suelTota;
    }

    /**
     * @param suelTota the suelTota to set
     */
    public void setSuelTota(double suelTota) {
        this.suelTota = suelTota;
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

    public Remuneracion() {
    }

    public Remuneracion(int idSuc, String idUser) {
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

    public Remuneracion(Date fechaPag, String idVend) {
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

    public Remuneracion(int idSuc, Date fechaPag, String idVend) {
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
