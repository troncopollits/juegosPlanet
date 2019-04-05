package net.daw.dao.specificDaoImplementation_0;

import java.sql.Connection;
import net.daw.bean.beanImplementation.UsuarioBean;
import net.daw.dao.genericDaoImplementation.GenericDaoImplementation;
import net.daw.dao.publicDaoInterface.DaoInterface;

/**
 *
 * @author artur
 */
public class TipousuarioDao_0 extends GenericDaoImplementation implements DaoInterface {

    public TipousuarioDao_0(Connection oConnection, String ob, UsuarioBean oUsuarioBeanSession) {
        super(oConnection, ob, oUsuarioBeanSession);

    }

}
