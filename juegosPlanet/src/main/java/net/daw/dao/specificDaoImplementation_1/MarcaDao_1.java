package net.daw.dao.specificDaoImplementation_1;

import java.sql.Connection;
import net.daw.bean.beanImplementation.UsuarioBean;
import net.daw.dao.genericDaoImplementation.GenericDaoImplementation;
import net.daw.dao.publicDaoInterface.DaoInterface;

/**
 *
 * @author artur
 */
public class MarcaDao_1 extends GenericDaoImplementation implements DaoInterface {

    public MarcaDao_1(Connection oConnection, String ob, UsuarioBean oUsuarioBeanSession) {
        super(oConnection, ob, oUsuarioBeanSession);

    }

}
