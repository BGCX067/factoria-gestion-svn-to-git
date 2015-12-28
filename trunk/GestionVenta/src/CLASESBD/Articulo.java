/*
 * Clase que permite acceder al maestro de articulos generales
 */
package CLASESBD;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Peter Hansen Lobos
 */
public class Articulo {

    private int idProd;
    private int codPLU;
    private int codBAR;
    private String desBAR;
    private String desMar;
    private String tipoEnv;
    private int valCap;
    private int valCnt;
    private String codUn;
    private String vig;
    private int cantid;
    private double ponAlt;
    private double ponBaj;
    private double valNet;
    private double valCli;
    private int codArea;
    private int codSuba;
    private String timeStamp;

    /**
     * @return the idProd id de un producto
     */
    public int getIdProd() {
        return idProd;
    }

    /**
     * @param idProd the idProd to set el id de un producto
     */
    public void setIdProd(int idProd) {
        this.idProd = idProd;
    }

    /**
     * @return the codPLU codigo plu de un producto
     */
    public int getCodPLU() {
        return codPLU;
    }

    /**
     * @param codPLU the codPLU to setea el codigo plu de un articulo
     */
    public void setCodPLU(int codPLU) {
        this.codPLU = codPLU;
    }

    /**
     * @return the codBAR codigo barra largo 13 de un articulo
     */
    public int getCodBAR() {
        return codBAR;
    }

    /**
     * @param codBAR the codBAR to set codigo barra largo 13 de un articulo
     */
    public void setCodBAR(int codBAR) {
        this.codBAR = codBAR;
    }

    /**
     * @return the desBAR descripcion de la barra de un articulo
     */
    public String getDesBAR() {
        return desBAR;
    }

    /**
     * @param desBAR the desBAR to set descripcion de la barra de un articulo
     */
    public void setDesBAR(String desBAR) {
        this.desBAR = desBAR;
    }

    /**
     * @return the desMar descripcion de la marca de un articulo
     */
    public String getDesMar() {
        return desMar;
    }

    /**
     * @param desMar the desMar to set descripcion de la marca de un articulo
     */
    public void setDesMar(String desMar) {
        this.desMar = desMar;
    }

    /**
     * @return the tipoEnv tipo de envase de un articulo
     */
    public String getTipoEnv() {
        return tipoEnv;
    }

    /**
     * @param tipoEnv the tipoEnv to set tipo de envase de un articulo
     */
    public void setTipoEnv(String tipoEnv) {
        this.tipoEnv = tipoEnv;
    }

    /**
     * @return the valCap valor de capacidad de un articulo
     */
    public int getValCap() {
        return valCap;
    }

    /**
     * @param valCap the valCap to set valor de capacidad de un articulo
     */
    public void setValCap(int valCap) {
        this.valCap = valCap;
    }

    /**
     * @return the valCnt capacida de envase de un articulo
     */
    public int getValCnt() {
        return valCnt;
    }

    /**
     * @param valCnt the valCnt to set capacidad de envase de un articulo
     */
    public void setValCnt(int valCnt) {
        this.valCnt = valCnt;
    }

    /**
     * @return the codUn codigo unitario de de un articulo UN. LT, GR
     */
    public String getCodUn() {
        return codUn;
    }

    /**
     * @param codUn the codUn to set codigo unitario de un articulo LT, GR
     */
    public void setCodUn(String codUn) {
        this.codUn = codUn;
    }

    /**
     * @return the vig la vigencia de un articulo A, I ,V
     */
    public String getVig() {
        return vig;
    }

    /**
     * @param vig the vig to set la vigencia de un articulo A, I, V
     */
    public void setVig(String vig) {
        this.vig = vig;
    }

    /**
     * @return the cantid la cantidad de un articulo
     */
    public int getCantid() {
        return cantid;
    }

    /**
     * @param cantid the cantid to set la cantidad de un articulo
     */
    public void setCantid(int cantid) {
        this.cantid = cantid;
    }

    /**
     * @return the ponAlt porcentaje de ganancia de un articulo
     */
    public double getPonAlt() {
        return ponAlt;
    }

    /**
     * @param ponAlt the ponAlt to set porcentaje de ganancia de un articulo
     */
    public void setPonAlt(double ponAlt) {
        this.ponAlt = ponAlt;
    }

    /**
     * @return the ponBaj porcentaje de rebaja de un articulo
     */
    public double getPonBaj() {
        return ponBaj;
    }

    /**
     * @param ponBaj the ponBaj to set porcentaje de un articulo
     */
    public void setPonBaj(double ponBaj) {
        this.ponBaj = ponBaj;
    }

    /**
     * @return the valNet el valor neto de un articulo
     */
    public double getValNet() {
        return valNet;
    }

    /**
     * @param valNet the valNet to set el valor de un articulo
     */
    public void setValNet(double valNet) {
        this.valNet = valNet;
    }

    /**
     * @return the valCli el valor a precio cliente de un articulo
     */
    public double getValCli() {
        return valCli;
    }

    /**
     * @param valCli the valCli to set el valor a precio cliente de un articulo
     */
    public void setValCli(double valCli) {
        this.valCli = valCli;
    }

    /**
     * @return the codArea el codigo de area de un articulo, Electro, Hogar
     * Bazar, Abarore
     */
    public int getCodArea() {
        return codArea;
    }

    /**
     * @param codArea the codArea to set el codigo de area de un articulo,
     * Electro, Hogar, Bazar, Abarrotes
     */
    public void setCodArea(int codArea) {
        this.codArea = codArea;
    }

    /**
     * @return the codSuba el codigo de subarea de un articulo, Electro-->
     * computacion
     */
    public int getCodSuba() {
        return codSuba;
    }

    /**
     * @param codSuba the codSuba to set el codigo de subarea de un articulo,
     * Electro --> computacion
     */
    public void setCodSuba(int codSuba) {
        this.codSuba = codSuba;
    }

    /**
     * @return the timeStamp el stamp de un articulo
     */
    public String getTimeStamp() {
        return timeStamp;
    }

    /**
     * @param timeStamp the timeStamp to set el stamp de un articulo
     */
    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    //----------------------------------------------------------------------
    //       area de constructores
    //----------------------------------------------------------------------
    /**
     */
    public Articulo() {
    }

    /**
     * @param cod_plu filtra el contructor por el articulo
     */
    public Articulo(int cod_plu) {

        try {
            String sql = "SELECT `ID_PROD`, `COD_PLU`, `COD_BAR`, `DES_BARRA`, `DES_MARCA`, "
                    + "`COD_ENV`, `VAL_CAP`, `VAL_CNT`, `COD_UNI`, `IND_VIG`, `CANTIDA`, "
                    + "`POND_AL`, `POND_BA`, `VALOR_N`, `VALOR_C`, `COD_1`, `COD_2`, `TIMESTAMP` "
                    + " FROM fac_articulo "
                    + "WHERE `COD_PLU` = " + cod_plu + " ;";
            ResultSet objRes;
            Conexion.sentencia = Conexion.conn.prepareStatement(sql);
            objRes = Conexion.sentencia.executeQuery(sql);

            while (objRes.next()) {
                idProd = objRes.getInt(1);
                codPLU = objRes.getInt(2);
                codBAR = objRes.getInt(3);
                desBAR = objRes.getString(4);
                desMar = objRes.getString(5);
                tipoEnv = objRes.getString(6);
                valCap = objRes.getInt(7);
                valCnt = objRes.getInt(8);
                codUn = objRes.getString(9);
                vig = objRes.getString(10);
                cantid = objRes.getInt(11);
                ponAlt = objRes.getDouble(12);
                ponBaj = objRes.getDouble(13);
                valNet = objRes.getDouble(14);
                valCli = objRes.getDouble(15);
                codArea = objRes.getInt(16);
                codSuba = objRes.getInt(17);
                timeStamp = objRes.getString(18);
            }
        } catch (Exception e) {
        } finally {
        }
    }

    /**
     *
     * @param cod1 codigo de area
     * @param nomMarca nombre de la marca del producto
     */
    public Articulo(int cod1, String nomMarca) {

        //SELECT * FROM fac_articulo WHERE `COD_1` = 7 AND `DES_BARRA` LIKE '%TV%'
        try {
            String sql = "SELECT `ID_PROD`, `COD_PLU`, `COD_BAR`, `DES_BARRA`, `DES_MARCA`, "
                    + "`COD_ENV`, `VAL_CAP`, `VAL_CNT`, `COD_UNI`, `IND_VIG`, `CANTIDA`, "
                    + "`POND_AL`, `POND_BA`, `VALOR_N`, `VALOR_C`, `COD_1`, `COD_2`, `TIMESTAMP` "
                    + " FROM fac_articulo WHERE `COD_1` = " + cod1 + " AND `DES_BARRA` LIKE '%" + nomMarca + "%';";
            ResultSet objRes;
            Conexion.sentencia = Conexion.conn.prepareStatement(sql);
            objRes = Conexion.sentencia.executeQuery(sql);

            while (objRes.next()) {
                idProd = objRes.getInt(1);
                codPLU = objRes.getInt(2);
                codBAR = objRes.getInt(3);
                desBAR = objRes.getString(4);
                desMar = objRes.getString(5);
                tipoEnv = objRes.getString(6);
                valCap = objRes.getInt(7);
                valCnt = objRes.getInt(8);
                codUn = objRes.getString(9);
                vig = objRes.getString(10);
                cantid = objRes.getInt(11);
                ponAlt = objRes.getDouble(12);
                ponBaj = objRes.getDouble(13);
                valNet = objRes.getDouble(14);
                valCli = objRes.getDouble(15);
                codArea = objRes.getInt(16);
                codSuba = objRes.getInt(17);
                timeStamp = objRes.getString(18);
            }
        } catch (Exception e) {
        } finally {
        }
    }

    /**
     *
     * @param cod1 codigo de area
     * @param cod2 codigo de subarea
     * @param cod_barr codigo de barras para filtrar un Articulo
     */
    public Articulo(int cod1, int cod2, int cod_barr) {

        //SELECT * FROM fac_articulo WHERE `COD_1` = 7 AND `DES_BARRA` LIKE '%TV%'
        try {
            String sql = "SELECT `ID_PROD`, `COD_PLU`, `COD_BAR`, `DES_BARRA`, `DES_MARCA`, "
                    + "`COD_ENV`, `VAL_CAP`, `VAL_CNT`, `COD_UNI`, `IND_VIG`, `CANTIDA`, "
                    + "`POND_AL`, `POND_BA`, `VALOR_N`, `VALOR_C`, `COD_1`, `COD_2`, `TIMESTAMP` "
                    + " FROM fac_articulo "
                    + "WHERE `COD_1` = " + cod1 + " AND `COD_2` = " + cod2 + " AND `COD_BAR` = " + cod_barr + ";";
            ResultSet objRes;
            Conexion.sentencia = Conexion.conn.prepareStatement(sql);
            objRes = Conexion.sentencia.executeQuery(sql);

            while (objRes.next()) {
                idProd = objRes.getInt(1);
                codPLU = objRes.getInt(2);
                codBAR = objRes.getInt(3);
                desBAR = objRes.getString(4);
                desMar = objRes.getString(5);
                tipoEnv = objRes.getString(6);
                valCap = objRes.getInt(7);
                valCnt = objRes.getInt(8);
                codUn = objRes.getString(9);
                vig = objRes.getString(10);
                cantid = objRes.getInt(11);
                ponAlt = objRes.getDouble(12);
                ponBaj = objRes.getDouble(13);
                valNet = objRes.getDouble(14);
                valCli = objRes.getDouble(15);
                codArea = objRes.getInt(16);
                codSuba = objRes.getInt(17);
                timeStamp = objRes.getString(18);
            }
        } catch (Exception e) {
        } finally {
        }
    }

    //-------------------------------------------------------------------------
    //      area de combos
    //-------------------------------------------------------------------------
    
     /**
     *
     * @param cod1 filtra por el area  de un articulo
     * @return todos los articulos fltrados por el area,  ELECTRO, BAZAR, VESTUAR, CARNICERIA
     * @throws SQLException
     */
    public static ResultSet listarComboArticulos(int cod1) throws SQLException {
        String strSql;
        strSql = "SELECT `DES_BARRA` FROM fac_articulo "
                + "WHERE `COD_1` = " + cod1 + " "
                + "ORDER BY `COD_1`ASC , `COD_2` ASC, `DES_BARRA` ASC;";
        ResultSet objRes;
        Conexion.sentencia = Conexion.conn.prepareStatement(strSql);
        objRes = Conexion.sentencia.executeQuery(strSql);

        return objRes;
    }    
    
    /**
     *
     * @param cod1 filtra por codigo de area
     * @param cod2 filtra por codigo de subarea
     * @return retona la lista de Articulos para desplegarlos en un combo
     * @throws SQLException
     */
    public static ResultSet listarComboArticulos(int cod1, int cod2) throws SQLException {
        String strSql;
        strSql = "SELECT `DES_BARRA` FROM fac_articulo WHERE `COD_1` = " + cod1 + " AND `COD_2` =" + cod2 + " "
                + "ORDER BY `COD_1`ASC , `COD_2` ASC, `DES_BARRA` ASC;";
        ResultSet objRes;
        Conexion.sentencia = Conexion.conn.prepareStatement(strSql);
        objRes = Conexion.sentencia.executeQuery(strSql);

        return objRes;
    }

    /**
     *
     * @param cod1 filtra por codigo de area
     * @param cod2 filtra por codigo de subarea
     * @param marca filtra por marca del producto
     * @return lista los productos de una area, subarea y marca determinado
     * @throws SQLException
     */
    public static ResultSet listarComboArticulos(int cod1, int cod2, String marca) throws SQLException {
        String strSql;  //LIKE '" + "" + fecha + "%" + "" + "'
        strSql = "SELECT DISTINCT(`DES_BARRA`) FROM fac_articulo "
                + "WHERE `COD_1` = " + cod1 + " AND `COD_2` =" + cod2 + " "
                + "AND `DES_BARRA` LIKE '"+"%"+marca+"%"+""+"' "
                + "ORDER BY `DES_BARRA` ASC;";
        System.out.println("REVISAR :"+strSql);
        ResultSet objRes;
        Conexion.sentencia = Conexion.conn.prepareStatement(strSql);
        objRes = Conexion.sentencia.executeQuery(strSql);

        return objRes;
    }

    /**
     *
     * @param cod1 filtra por codigo de areas
     * @return lista las marcas por el codigo de area.
     * @throws SQLException
     */
    public static ResultSet listarComboMarcas(int cod1) throws SQLException {
        String strSql;
        strSql = "SELECT DISTINCT (`DES_MARCA`) "
                + "FROM fac_articulo "
                + "WHERE `COD_1` = " + cod1 + " ORDER BY `DES_MARCA` ASC;";
        ResultSet objRes;
        Conexion.sentencia = Conexion.conn.prepareStatement(strSql);
        objRes = Conexion.sentencia.executeQuery(strSql);

        return objRes;
    }

    /**
     *
     * @param cod1 filtra las marcas por area int
     * @param cod2 filtra las marcas por subareas
     * @return la lista de Marcas segun la area y subarea
     * @throws SQLException
     */
    public static ResultSet listarComboMarcas(int cod1, int cod2) throws SQLException {
        String strSql;
        strSql = "SELECT DISTINCT (`DES_MARCA`) "
                + "FROM fac_articulo "
                + "WHERE `COD_1` = " + cod1 + " AND `COD_2` =" + cod2 + " "
                + "ORDER BY `DES_MARCA` ASC;";
        ResultSet objRes;
        Conexion.sentencia = Conexion.conn.prepareStatement(strSql);
        objRes = Conexion.sentencia.executeQuery(strSql);

        return objRes;
    }

    /**
     * @return lista de los codigo unitarios LT, UN, CC, GR, KG
     * @throws SQLException
     */
    public static ResultSet listarComboUnitarios() throws SQLException {
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
