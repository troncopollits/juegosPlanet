package net.daw.bean.beanImplementation;

import com.google.gson.annotations.Expose;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import net.daw.bean.genericBeanImplementation.GenericBeanImplementation;
import net.daw.bean.publicBeanInterface.BeanInterface;
import net.daw.helper.EncodingHelper;

/**
 *
 * @author artur
 */
public class ComentarioBean extends GenericBeanImplementation implements BeanInterface {

    @Expose
    private String desc;

    @Expose(serialize = false)
    private Date fecha;

    @Expose(serialize = false)
    private int id_usuario;

    @Expose(serialize = false)
    private int id_producto;

    //getters & setters
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    @Override
    public LineaBean fill(ResultSet oResultSet, Connection oConnection, Integer expand, UsuarioBean oUsuarioBeanSession) throws Exception {

        this.setId(oResultSet.getInt("id"));
        this.setCantidad(oResultSet.getInt("cantidad"));

        if (expand > 0) {
            // ProductoDao_1 oproductoDao = new ProductoDao_1(oConnection, "producto", oUsuarioBeanSession);
            DaoInterface oproductoDao = DaoFactory.getDao(oConnection, "producto", oUsuarioBeanSession);
            this.setObj_Producto((ProductoBean) oproductoDao.get(oResultSet.getInt("id_producto"), expand - 1));
        } else {
            this.setId_producto(oResultSet.getInt("id_producto"));
        }

        if (expand > 0) {
            //FacturaDao_1 oFacturaDao = new FacturaDao_1(oConnection, "factura", oUsuarioBeanSession);
            DaoInterface oFacturaDao = DaoFactory.getDao(oConnection, "factura", oUsuarioBeanSession);
            this.setObj_Factura((FacturaBean) oFacturaDao.get(oResultSet.getInt("id_factura"), expand - 1));
        } else {
            this.setId_factura(oResultSet.getInt("id_factura"));
        }

        return this;
    }
    
    @Override
    public String getPairs() {
        String strPairs = "";
        strPairs += "id=" + id + ",";
        strPairs += "desc=" + EncodingHelper.quotate(desc) + ",";
        strPairs += "fecha=" + fecha + ",";
        strPairs += "id_usuario=" + id_usuario + ",";
        strPairs += "id_producto=" + id_producto;
        strPairs += " WHERE id=" + id;
        return strPairs;

    }

    @Override
    public String getColumns() {
        String strColumns = "";
        strColumns += "id,";
        strColumns += "desc,";
        strColumns += "fecha,";
        strColumns += "id_usuario,";
        strColumns += "id_producto";
        return strColumns;
    }

    @Override
    public String getValues() {

        String strColumns = "";
        strColumns += "null,";
        strColumns += EncodingHelper.quotate(desc) + ",";
        strColumns += this.getFecha() + ",";
        strColumns += this.getId_usuario() + ",";
        strColumns += this.getId_producto();

        return strColumns;
    }
}
