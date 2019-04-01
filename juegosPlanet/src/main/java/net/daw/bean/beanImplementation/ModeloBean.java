package net.daw.bean.beanImplementation;

import com.google.gson.annotations.Expose;
import java.sql.Connection;
import java.sql.ResultSet;
import net.daw.bean.genericBeanImplementation.GenericBeanImplementation;
import net.daw.bean.publicBeanInterface.BeanInterface;
import net.daw.helper.EncodingHelper;

/**
 *
 * @author artur
 */
public class ModeloBean extends GenericBeanImplementation implements BeanInterface {

    @Expose
    private String desc;
    @Expose
    private int id_marca;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getId_marca() {
        return id_marca;
    }

    public void setId_marca(int id_marca) {
        this.id_marca = id_marca;
    }

    @Override
    public ModeloBean fill(ResultSet oResultSet, Connection oConnection, Integer expand, UsuarioBean oUsuarioBeanSession) throws Exception {
        this.setId(oResultSet.getInt("id"));
        this.setDesc(oResultSet.getString("desc"));
        this.setId_marca(oResultSet.getInt("id_marca"));
        return this;
    }

    @Override
    public String getColumns() {
        String strColumns = "";
        strColumns += "id,";
        strColumns += "modelo.desc";
        strColumns += "id_marca";
        return strColumns;
    }

    @Override
    public String getValues() {
        String strColumns = "";
        strColumns += "null,";
        strColumns += EncodingHelper.quotate(desc);
        strColumns += this.getId_marca();
        return strColumns;
    }

    @Override
    public String getPairs() {
        String strPairs = "";
        strPairs += "id=" + id + ",";
        strPairs += "marca.desc='" + desc + "'";
        strPairs += "id_marca=" + id_marca;
        strPairs += " WHERE id=" + id;
        return strPairs;
    }
}
