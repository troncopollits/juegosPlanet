package net.daw.dao.specificDaoImplementation_1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import net.daw.bean.beanImplementation.LineaBean;
import net.daw.bean.beanImplementation.UsuarioBean;
import net.daw.dao.genericDaoImplementation.GenericDaoImplementation;
import net.daw.dao.publicDaoInterface.DaoInterface;

/**
 *
 * @author artur
 */
public class LineaDao_1 extends GenericDaoImplementation implements DaoInterface {

    public LineaDao_1(Connection oConnection, String ob, UsuarioBean oUsuarioBeanSession) {
        super(oConnection, ob, oUsuarioBeanSession);

    }

    public ArrayList<LineaBean> getLineaFactura(int iRpp, int iPage, int idFactura, Integer expand) throws Exception {
        String strSQL = "SELECT * FROM " + ob;
        ArrayList<LineaBean> alLineaBean;
        if (iRpp > 0 && iRpp < 100000 && iPage > 0 && iPage < 100000000) {
            strSQL += " WHERE id_factura=? ";
            strSQL += " LIMIT " + (iPage - 1) * iRpp + ", " + iRpp;
            ResultSet oResultSet = null;
            PreparedStatement oPreparedStatement = null;
            try {

                oPreparedStatement = oConnection.prepareStatement(strSQL);
                oPreparedStatement.setInt(1, idFactura);
                oResultSet = oPreparedStatement.executeQuery();
                alLineaBean = new ArrayList<LineaBean>();

                while (oResultSet.next()) {
                    LineaBean oLineaBean = new LineaBean();
                    oLineaBean.fill(oResultSet, oConnection, expand, oUsuarioBeanSession);
                    alLineaBean.add(oLineaBean);
                }
            } catch (SQLException e) {
                throw new Exception("Error en Dao getpage de " + ob, e);
            } finally {
                if (oResultSet != null) {
                    oResultSet.close();
                }
                if (oPreparedStatement != null) {
                    oPreparedStatement.close();
                }
            }
        } else {
            throw new Exception("Error en Dao getpage de " + ob);
        }
        return alLineaBean;

    }

    public int getcountxlinea(int idFactura) throws Exception {
        String strSQL = "SELECT COUNT(id) from " + ob + " where id_factura=" + idFactura;
        int resultado = 0;
        ResultSet oResultSet = null;
        PreparedStatement oPreparedStatement = null;
        try {
            oPreparedStatement = oConnection.prepareStatement(strSQL);
            oResultSet = oPreparedStatement.executeQuery();
            while (oResultSet.next()) {
                resultado = oResultSet.getInt(1);
            }
        } catch (Exception e) {
            throw new Exception("Error en Dao getCountLinea de " + ob);
        } finally {
            if (oResultSet != null) {
                oResultSet.close();
            }
            if (oPreparedStatement != null) {
                oPreparedStatement.close();
            }
        }
        return resultado;

    }
}
