package net.daw.dao.specificDaoImplementation_2;

import java.sql.Connection;
import net.daw.bean.beanImplementation.UsuarioBean;
import net.daw.bean.publicBeanInterface.BeanInterface;
import net.daw.dao.genericDaoImplementation.GenericDaoImplementation;
import net.daw.dao.publicDaoInterface.DaoInterface;

/**
 *
 * @author artur
 */
public class FabricanteDao_2 extends GenericDaoImplementation implements DaoInterface {

    public FabricanteDao_2(Connection oConnection, String ob, UsuarioBean oUsuarioBeanSession) {
        super(oConnection, ob, oUsuarioBeanSession);

    }

    @Override
    public int remove(int id) throws Exception {
        throw new Exception("Error en Dao remove de " + ob + ": No autorizado");
    }

    @Override
    public BeanInterface create(BeanInterface oBean) throws Exception {
        throw new Exception("Error en Dao create de " + ob + ": No autorizado");
    }

    @Override
    public int update(BeanInterface oBean) throws Exception {
        throw new Exception("Error en Dao update de " + ob + ": No autorizado");
    }
}
