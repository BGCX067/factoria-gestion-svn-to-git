/*
 * Clase que permite acceder a la tabla USuarios para ver los atributos de los usuarios
 */
package CLASESBD;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

/**
 *
 * @author Peter Hansen Lobos
 */
public class Usuario {

    private String idUsuario;
    private String dniRut;
    private String idComuna;
    private String idCiudad;
    private int idSucursal;
    private int idPerfil;
    private String nombre1;
    private String nombre2;
    private String apellido1;
    private String apellido2;
    private String fono;
    private String email;
    private String passw;
    private boolean activo;
    private Date fNacimi;
    private Date fContra;
    private Date fInicio;
    private Date fTermin;
    private String Stamp;
    private String StampM;

    /**
     * @return the idUsuario de la tabla Usuario
     */
    public String getIdUsuario() {
        return idUsuario;
    }

    /**
     * @param idUsuario the idUsuario to set de la tabla Usuario
     */
    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    /**
     * @return the dniRut es el rut del usuario de la tabla Usuario
     */
    public String getDniRut() {
        return dniRut;
    }

    /**
     * @param dniRut the dniRut to set es el rut de la tabla Usuario
     */
    public void setDniRut(String dniRut) {
        this.dniRut = dniRut;
    }

    /**
     * @return the idComuna es el id de la comuna donde vive el usario
     */
    public String getIdComuna() {
        return idComuna;
    }

    /**
     * @param idComuna the idComuna to set es el id de la comuna donde vive el
     * usuario
     */
    public void setIdComuna(String idComuna) {
        this.idComuna = idComuna;
    }

    /**
     * @return the idCiudad es el id ciudad donde vive el usario
     */
    public String getIdCiudad() {
        return idCiudad;
    }

    /**
     * @param idCiudad the idCiudad to set el id de la ciudad del usuario
     */
    public void setIdCiudad(String idCiudad) {
        this.idCiudad = idCiudad;
    }

    /**
     * @return the idSucursal es el id de la sucursal donde trabaja el usuario
     */
    public int getIdSucursal() {
        return idSucursal;
    }

    /**
     * @param idSucursal the idSucursal to set es el id sucursal donde trabaja
     * el usaurio
     */
    public void setIdSucursal(int idSucursal) {
        this.idSucursal = idSucursal;
    }

    /**
     * @return the idPerfil es el id perfil o el cargo del usaurio
     */
    public int getIdPerfil() {
        return idPerfil;
    }

    /**
     * @param idPerfil the idPerfil to set es el id perfil o el cargo del
     * usaurio
     */
    public void setIdPerfil(int idPerfil) {
        this.idPerfil = idPerfil;
    }

    /**
     * @return the nombre1 el prrimer nombre del usuario
     */
    public String getNombre1() {
        return nombre1;
    }

    /**
     * @param nombre1 the nombre1 to set el primer nombre del usaurio
     */
    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    /**
     * @return the nombre2 el segundo nonmbre del usuario
     */
    public String getNombre2() {
        return nombre2;
    }

    /**
     * @param nombre2 the nombre2 to set el segundo nombre del usaurio
     */
    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    /**
     * @return the apellido1 el primer apellido del usuario
     */
    public String getApellido1() {
        return apellido1;
    }

    /**
     * @param apellido1 the apellido1 to set el primer apellido del usuario
     */
    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    /**
     * @return the apellido2 el segundo apellido del usaurio
     */
    public String getApellido2() {
        return apellido2;
    }

    /**
     * @param apellido2 the apellido2 to set el segundo apellido del usaurio
     */
    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    /**
     * @return the fono es el telefono del usuario
     */
    public String getFono() {
        return fono;
    }

    /**
     * @param fono the fono to set el telefono del usuario
     */
    public void setFono(String fono) {
        this.fono = fono;
    }

    /**
     * @return the email el correo electronico del usuario
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set el correo electronico del usuario
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the passw la contraseña encriptada en MD5 del usuario
     */
    public String getPassw() {
        return passw;
    }

    /**
     * @param passw the passw to set la contraseña encriptada en MD5 del usuario
     */
    public void setPassw(String passw) {
        this.passw = passw;
    }

    /**
     * @return the activo si esta habilitado para operar en el sistema
     */
    public boolean isActivo() {
        return activo;
    }

    /**
     * @param activo the activo to set si esta habilitado para operar en el
     * sistema
     */
    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    /**
     * @return the fNacimi fecha de nacimiento del usuario
     */
    public Date getfNacimi() {
        return fNacimi;
    }

    /**
     * @param fNacimi the fNacimi to set fecha de nacimiento del usaurio
     */
    public void setfNacimi(Date fNacimi) {
        this.fNacimi = fNacimi;
    }

    /**
     * @return the fContra fecha de contratacion del usuario en un local
     * determinado
     */
    public Date getfContra() {
        return fContra;
    }

    /**
     * @param fContra the fContra to set fecha de contratacion del usuario en un
     * local determinado
     */
    public void setfContra(Date fContra) {
        this.fContra = fContra;
    }

    /**
     * @return the fInicio fecha de inicio de actividades del usuario en la
     * empresa
     */
    public Date getfInicio() {
        return fInicio;
    }

    /**
     * @param fInicio the fInicio to set fecha de inicio de actividades del
     * usuario en la empresa
     */
    public void setfInicio(Date fInicio) {
        this.fInicio = fInicio;
    }

    /**
     * @return the fTermin fecha de despido del usaurio en la empresa
     */
    public Date getfTermin() {
        return fTermin;
    }

    /**
     * @param fTermin the fTermin to set fecha de despido del usaurio en la
     * empresa
     */
    public void setfTermin(Date fTermin) {
        this.fTermin = fTermin;
    }

    /**
     * @return the Stamp stamp de creacion del usaurio en el sistema
     */
    public String getStamp() {
        return Stamp;
    }

    /**
     * @param Stamp the Stamp to set stamp de creacion del usuario en el sistema
     */
    public void setStamp(String Stamp) {
        this.Stamp = Stamp;
    }

    /**
     * @return the StampM stamp de moficiacion de datos del usuario en el
     * sistema
     */
    public String getStampM() {
        return StampM;
    }

    /**
     * @param StampM the StampM to set stamp de modificacion de datos del
     * usuario en el sistema
     */
    public void setStampM(String StampM) {
        this.StampM = StampM;
    }

    //----------------------------------------------------------------------
    //       area de constructores
    //----------------------------------------------------------------------    
    
    /**
     * @param Contructor vacio crea una instancia sin parametros cargados
     */
    public Usuario() {
    }

    /**
     * @param id_usr carga una instancia de la clase con el atributo id_usuario
     */
    public Usuario(String id_usr) {
        try {
            String sql = "SELECT `ID_USUARIO`, `DNI_RUT`, `ID_CIUDAD`, `ID_COMUNA`, `ID_SUC`, "
                    + "`ID_PERFIL`, `NOMBRE1`, `NOMBRE2`, `APELLID1`, `APELLID2`, `FONO`, `EMAIL`, "
                    + "`PASSW`, `ACT`, `FCH_NAC`, `FCH_CON`, `FCH_INIC`, `FCH_TER`, `TIMESTAMP`, `TIMESTAMP_M` "
                    + "FROM fac_usuario "
                    + "WHERE `ID_USUARIO` = '" + id_usr + "';";
            ResultSet objRes;
            Conexion.sentencia = Conexion.conn.prepareStatement(sql);
            objRes = Conexion.sentencia.executeQuery(sql);

            while (objRes.next()) {
                idUsuario = objRes.getString(1);
                dniRut = objRes.getString(2);
                idCiudad = objRes.getString(3);
                idComuna = objRes.getString(4);
                idSucursal = objRes.getInt(5);
                idPerfil = objRes.getInt(6);
                nombre1 = objRes.getString(7);
                nombre2 = objRes.getString(8);
                apellido1 = objRes.getString(9);
                apellido2 = objRes.getString(10);
                fono = objRes.getString(11);
                email = objRes.getString(12);
                passw = objRes.getString(13);
                activo = objRes.getBoolean(14);
                fNacimi = objRes.getDate(15);
                fContra = objRes.getDate(16);
                fInicio = objRes.getDate(17);
                fTermin = objRes.getDate(18);
                Stamp = objRes.getString(19);
                StampM = objRes.getString(20);
            }
        } catch (Exception e) {
        } finally {
        }
    }

    /**     
     * @param id_usr el id del isuario, es el rut sin verificador
     * @param id_sucur el id de sucursal a la cual pertenece.
     */
    public Usuario(String id_usr, int id_sucur) {
        try {
            String sql = "SELECT `ID_USUARIO`, `DNI_RUT`, `ID_CIUDAD`, `ID_COMUNA`, `ID_SUC`, "
                    + "`ID_PERFIL`, `NOMBRE1`, `NOMBRE2`, `APELLID1`, `APELLID2`, `FONO`, `EMAIL`, "
                    + "`PASSW`, `ACT`, `FCH_NAC`, `FCH_CON`, `FCH_INIC`, `FCH_TER`, `TIMESTAMP`, `TIMESTAMP_M` "
                    + "FROM fac_usuario "
                    + "WHERE `ID_USUARIO` = '" + id_usr + "' AND `ID_SUC` = " + id_sucur + ";";
            ResultSet objRes;
            Conexion.sentencia = Conexion.conn.prepareStatement(sql);
            objRes = Conexion.sentencia.executeQuery(sql);

            while (objRes.next()) {
                idUsuario = objRes.getString(1);
                dniRut = objRes.getString(2);
                idCiudad = objRes.getString(3);
                idComuna = objRes.getString(4);
                idSucursal = objRes.getInt(5);
                idPerfil = objRes.getInt(6);
                nombre1 = objRes.getString(7);
                nombre2 = objRes.getString(8);
                apellido1 = objRes.getString(9);
                apellido2 = objRes.getString(10);
                fono = objRes.getString(11);
                email = objRes.getString(12);
                passw = objRes.getString(13);
                activo = objRes.getBoolean(14);
                fNacimi = objRes.getDate(15);
                fContra = objRes.getDate(16);
                fInicio = objRes.getDate(17);
                fTermin = objRes.getDate(18);
                Stamp = objRes.getString(19);
                StampM = objRes.getString(20);
            }
        } catch (Exception e) {
        } finally {
        }
    }
    
    
    
    public static ResultSet listarComboUsuarios() throws SQLException {
        String strSql;
        strSql = "SELECT DISTINCT (`COD_UNI`) "
                + "FROM fac_articulo "
                + "ORDER BY `COD_UNI` ASC;";
        ResultSet objRes;
        Conexion.sentencia = Conexion.conn.prepareStatement(strSql);
        objRes = Conexion.sentencia.executeQuery(strSql);

        return objRes;
    }
    
}
