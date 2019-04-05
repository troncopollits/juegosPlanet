package net.daw.bean.beanImplementation;

import com.google.gson.annotations.Expose;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import net.daw.bean.genericBeanImplementation.GenericBeanImplementation;
import net.daw.bean.publicBeanInterface.BeanInterface;
import net.daw.dao.publicDaoInterface.DaoInterface;
import net.daw.factory.DaoFactory;
import net.daw.helper.EncodingHelper;

/**
 *
 * @author artur
 */
public class ProductoBean extends GenericBeanImplementation implements BeanInterface {

    @Expose
    private String codigo;
    @Expose
    private String desc;
    @Expose
    private int existencias;
    @Expose
    private float precio;
    @Expose
    private String foto;
    @Expose
    private Boolean novedad;
    @Expose
    private Date fechaLanzamiento;
    @Expose
    private double precioRebaja;
    @Expose
    private String genero;
    @Expose(serialize = false)
    private int id_modelo;
    @Expose(serialize = false)
    private int id_tipoProducto;
    @Expose(deserialize = false)
    private TipoproductoBean obj_tipoProducto;

    //getters & setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getExistencias() {
        return existencias;
    }

    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Boolean getNovedad() {
        return novedad;
    }

    public void setNovedad(Boolean novedad) {
        this.novedad = novedad;
    }

    public Date getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(Date fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public double getPrecioRebaja() {
        return precioRebaja;
    }

    public void setPrecioRebaja(double precioRebaja) {
        this.precioRebaja = precioRebaja;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getId_modelo() {
        return id_modelo;
    }

    public void setId_modelo(int id_modelo) {
        this.id_modelo = id_modelo;
    }

    public TipoproductoBean getObj_tipoProducto() {
        return obj_tipoProducto;
    }

    public void setObj_tipoProducto(TipoproductoBean obj_tipoProducto) {
        this.obj_tipoProducto = obj_tipoProducto;
    }

    public int getId_tipoProducto() {
        return id_tipoProducto;
    }

    public void setId_tipoProducto(int id_tipoProducto) {
        this.id_tipoProducto = id_tipoProducto;
    }

    @Override
    public ProductoBean fill(ResultSet oResultSet, Connection oConnection, Integer expand, UsuarioBean oUsuarioBeanSession) throws Exception {

        this.setId(oResultSet.getInt("id"));
        this.setCodigo(oResultSet.getString("codigo"));
        this.setDesc(oResultSet.getString("desc"));
        this.setExistencias(oResultSet.getInt("existencias"));
        this.setPrecio(oResultSet.getFloat("precio"));
        this.setFoto(oResultSet.getString("foto"));
        this.setNovedad(oResultSet.getBoolean("novedad"));
        this.setFechaLanzamiento(oResultSet.getDate("fechaLanzamiento"));
        this.setPrecioRebaja(oResultSet.getDouble("precioRebaja"));
        this.setGenero(oResultSet.getString("genero"));
        this.setId_modelo(oResultSet.getInt("id_modelo"));
        this.setId_tipoProducto(oResultSet.getInt("id_tipoproducto"));
        if (expand > 0) {
            DaoInterface otipoproductoDao = DaoFactory.getDao(oConnection, "tipoproducto", oUsuarioBeanSession);
            this.setObj_tipoProducto((TipoproductoBean) otipoproductoDao.get(oResultSet.getInt("id_tipoproducto"), expand - 1));
        } else {
            this.setId_tipoProducto(oResultSet.getInt("id_tipoproducto"));
        }
        return this;
    }

    @Override
    public String getPairs() {
        String strPairs = "";

        strPairs += "codigo=" + EncodingHelper.quotate(codigo) + ",";
        strPairs += "producto.desc=" + EncodingHelper.quotate(desc) + ",";
        strPairs += "existencias=" + existencias + ",";
        strPairs += "precio=" + precio + ",";
        strPairs += "foto=" + EncodingHelper.quotate(foto) + ",";
        strPairs += "novedad=" + novedad + ",";
        strPairs += "fechaLanzamiento=" + fechaLanzamiento + ",";
        strPairs += "precioRebaja=" + precioRebaja + ",";
        strPairs += "genero=" + EncodingHelper.quotate(genero) + ",";
        strPairs += "id_modelo=" + id_modelo + ",";
        strPairs += "id_tipoproducto=" + id_tipoProducto;
        strPairs += " WHERE id=" + id;
        return strPairs;

    }

    @Override
    public String getColumns() {

        String strColumns = "";
        strColumns += "id,";
        strColumns += "codigo,";
        strColumns += "producto.desc,";
        strColumns += "existencias,";
        strColumns += "precio,";
        strColumns += "foto,";
        strColumns += "novedad,";
        strColumns += "fechaLanzamiento,";
        strColumns += "precioRebaja,";
        strColumns += "genero,";
        strColumns += "id_modelo,";
        strColumns += "id_tipoproducto";
        return strColumns;
    }

    @Override
    public String getValues() {

        String strColumns = "";
        strColumns += "null,";
        strColumns += EncodingHelper.quotate(codigo) + ",";
        strColumns += EncodingHelper.quotate(desc) + ",";
        strColumns += this.getExistencias() + ",";
        strColumns += this.getPrecio() + ",";
        strColumns += EncodingHelper.quotate(foto) + ",";
        strColumns += this.novedad + ",";
        strColumns += this.fechaLanzamiento + ",";
        strColumns += this.precioRebaja + ",";
        strColumns += EncodingHelper.quotate(genero) + ",";
        strColumns += this.getId_modelo()+ ",";
        strColumns += this.getId_tipoProducto();
        return strColumns;
    }
}
