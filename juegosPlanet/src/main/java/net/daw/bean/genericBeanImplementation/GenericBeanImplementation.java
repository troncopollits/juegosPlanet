package net.daw.bean.genericBeanImplementation;

import com.google.gson.annotations.Expose;
import java.sql.Connection;
import java.sql.ResultSet;
import net.daw.bean.beanImplementation.UsuarioBean;
import net.daw.bean.publicBeanInterface.BeanInterface;

/**
 *
 * @author artur
 */
public class GenericBeanImplementation implements BeanInterface {

    @Expose
    protected int id;

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public BeanInterface fill(ResultSet oResultSet, Connection oConnection, Integer expand, UsuarioBean oUsuarioBeanSession) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getColumns() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getValues() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getPairs() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
