/*
 * Clase que permite acceder a la tabla Sucursal, donde se actualizan los saldos y contadores de ventas.
 */
package CLASESBD;

import java.sql.ResultSet;

/**
 *
 * @author Peter Hansen Lobos
 */
public class Sucursal {
    
    private int  idSucursal;
    private String nomSucursal;
    private String idComuna;
    private int  idCiudad;
    private String direcc;
    private String email;
    private String fono;
    private double vtaActual;
    private double vtaSemana;
    private double vtaMensua;
    private String timeStamp;

    /**
     * @return the idSucursal el id de la sucursal de la clase Sucursal
     */
    public int getIdSucursal() {
        return idSucursal;
    }

    /**
     * @param idSucursal the idSucursal to set el id sucursal de la clase Sucursal
     */
    public void setIdSucursal(int idSucursal) {
        this.idSucursal = idSucursal;
    }

    /**
     * @return the nomSucursal el nombre de la sucursal de la clase Sucursal
     */
    public String getNomSucursal() {
        return nomSucursal;
    }

    /**
     * @param nomSucursal the nomSucursal to set el nombre de la sucursal de la clase Sucursal
     */
    public void setNomSucursal(String nomSucursal) {
        this.nomSucursal = nomSucursal;
    }

    /**
     * @return the idComuna la id de la comuna de la clase Sucursal
     */
    public String getIdComuna() {
        return idComuna;
    }

    /**
     * @param idComuna the idComuna to set la id de la comuna de la clase Sucursal
     */
    public void setIdComuna(String idComuna) {
        this.idComuna = idComuna;
    }

    /**
     * @return the idCiudad la id de la ciudad de la clase Sucursal
     */
    public int getIdCiudad() {
        return idCiudad;
    }

    /**
     * @param idCiudad the idCiudad to set la id de la ciudad de la clase Sucursal
     */
    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }

        /**
     * @return the direcc la direccion de la sucursal
     */
    public String getDirec() {
        return direcc;
    }

    /**
     * @param dir es la direccion de la sucursal.
     * @param idCiudad the la direccion de la sucursal
     */
    public void setDirec(String dir) {
        this.direcc = dir;
    }
    
    /**
     * @return the email el email de contacto de la clase Sucursal
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set el email de contacto de la clase Sucursal
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the fono el telefono de la clase Sucursal
     */
    public String getFono() {
        return fono;
    }

    /**
     * @param fono the fono to set el telefono de la clase Sucursal
     */
    public void setFono(String fono) {
        this.fono = fono;
    }

    /**
     * @return the vtaActual la venta actual de la clase Sucursal
     */
    public double getVtaActual() {
        return vtaActual;
    }

    /**
     * @param vtaActual the vtaActual to set la venta actual de la clase Sucursal
     */
    public void setVtaActual(double vtaActual) {
        this.vtaActual = vtaActual;
    }

    /**
     * @return the vtaSemana acumulado de la venta semanal de la clase Sucursal
     */
    public double getVtaSemana() {
        return vtaSemana;
    }

    /**
     * @param vtaSemana the vtaSemana to set acumulado de la venta semanal de la clase Sucursal
     */
    public void setVtaSemana(double vtaSemana) {
        this.vtaSemana = vtaSemana;
    }

    /**
     * @return the vtaMensua la venta acumulada mensual de la clase Sucursal
     */
    public double getVtaMensua() {
        return vtaMensua;
    }

    /**
     * @param vtaMensua the vtaMensua to set la venta acumulada mensual de la clase Sucursal
     */
    public void setVtaMensua(double vtaMensua) {
        this.vtaMensua = vtaMensua;
    }

    /**
     * @return the timeStamp el stamp de creacion del registro de la clase Sucursal
     */
    public String getTimeStamp() {
        return timeStamp;
    }

    /**
     * @param timeStamp the timeStamp to set el stamp de creacion del registro de la clase Sucursal
     */
    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    //----------------------------------------------------------------------
    //       area de constructores
    //----------------------------------------------------------------------        
    
    
    /**
     *@param constructor crea una instancia vacia de la clase.
     */
    public Sucursal() {
    }

    /**
     *
     * @param id_Sucur crea nueva instancia filtrando por el id de sucursal.
     */
    public Sucursal(int id_Sucur) {
        try {
            String sql = "SELECT `ID_SUC`, `NM_SUC`, `ID_COM`, `ID_CIUD`, `DIRECC`, "
                    + "`EMAIL`, `FONO`, `VTA_ACT`, `VTA_SEM`, `VTA_MEN`, `TIMESTAMP` "
                    + "FROM fac_sucursal "
                    + "WHERE `ID_SUC` = "+id_Sucur+";";
            ResultSet objRes;
            Conexion.sentencia = Conexion.conn.prepareStatement(sql);
            objRes = Conexion.sentencia.executeQuery(sql);

            while (objRes.next()) {
                idSucursal = objRes.getInt(1);
                nomSucursal = objRes.getString(2);
                idComuna = objRes.getString(3);
                idCiudad = objRes.getInt(4);
                direcc   = objRes.getString(5);
                email    = objRes.getString(6);
                fono     = objRes.getString(7);
                vtaActual = objRes.getDouble(8);
                vtaSemana = objRes.getDouble(9);
                vtaMensua = objRes.getDouble(10);
                timeStamp = objRes.getString(11);
            }
        } catch (Exception e) {
        } finally {
        }
    }
    
    
    
    
    
    
    
    
}
