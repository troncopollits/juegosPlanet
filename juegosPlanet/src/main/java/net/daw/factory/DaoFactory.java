package net.daw.factory;

import java.sql.Connection;
import net.daw.bean.beanImplementation.UsuarioBean;

/**
 *
 * @author artur
 */
public class DaoFactory {

    public static DaoInterface getDao(Connection oConnection, String ob, UsuarioBean oUsuarioBeanSession) throws Exception {
        DaoInterface oDao = null;
        int idSessionUserTipe;
        if (oUsuarioBeanSession != null) {
            idSessionUserTipe = oUsuarioBeanSession.getObj_tipoUsuario().getId();
        } else {
            idSessionUserTipe = 0;
        }

        switch (idSessionUserTipe) {
            case 1:
                switch (ob) {
                    case "usuario":
                        oDao = new UsuarioDao_1(oConnection, ob, oUsuarioBeanSession);
                        break;
                    case "tipousuario":
                        oDao = new TipousuarioDao_1(oConnection, ob, oUsuarioBeanSession);
                        break;
                    case "tipoproducto":
                        oDao = new TipoproductoDao_1(oConnection, ob, oUsuarioBeanSession);
                        break;
                    case "producto":
                        oDao = new ProductoDao_1(oConnection, ob, oUsuarioBeanSession);
                        break;
                    case "factura":
                        oDao = new FacturaDao_1(oConnection, ob, oUsuarioBeanSession);
                        break;
                    case "linea":
                        oDao = new LineaDao_1(oConnection, ob, oUsuarioBeanSession);
                        break;
                    case "comentario":
                        oDao = new ComentarioDao_1(oConnection, ob, oUsuarioBeanSession);
                        break;
                    case "marca":
                        oDao = new MarcaDao_1(oConnection, ob, oUsuarioBeanSession);
                        break;
                    case "modelo":
                        oDao = new ModeloDao_1(oConnection, ob, oUsuarioBeanSession);
                        break;
                    case "fabricante":
                        oDao = new FabricanteDao_1(oConnection, ob, oUsuarioBeanSession);
                        break;
                }
                break;
            case 2:
                switch (ob) {
                    case "usuario":
                        oDao = new UsuarioDao_2(oConnection, ob, oUsuarioBeanSession);
                        break;
                    case "tipousuario":
                        oDao = new TipousuarioDao_2(oConnection, ob, oUsuarioBeanSession);
                        break;
                    case "tipoproducto":
                        oDao = new TipoproductoDao_2(oConnection, ob, oUsuarioBeanSession);
                        break;
                    case "producto":
                        oDao = new ProductoDao_2(oConnection, ob, oUsuarioBeanSession);
                        break;
                    case "factura":
                        oDao = new FacturaDao_2(oConnection, ob, oUsuarioBeanSession);
                        break;
                    case "linea":
                        oDao = new LineaDao_2(oConnection, ob, oUsuarioBeanSession);
                        break;
                    case "comentario":
                        oDao = new ComentarioDao_2(oConnection, ob, oUsuarioBeanSession);
                        break;
                    case "marca":
                        oDao = new MarcaDao_2(oConnection, ob, oUsuarioBeanSession);
                        break;
                    case "modelo":
                        oDao = new ModeloDao_2(oConnection, ob, oUsuarioBeanSession);
                        break;
                    case "fabricante":
                        oDao = new FabricanteDao_2(oConnection, ob, oUsuarioBeanSession);
                        break;
                }
                break;
            case 0:
                switch (ob) {
                    case "usuario":
                        oDao = new UsuarioDao_0(oConnection, ob, oUsuarioBeanSession);
                        break;
                    case "tipousuario":
                        oDao = new TipousuarioDao_0(oConnection, ob, oUsuarioBeanSession);
                        break;
                    case "factura":
                        oDao = new FacturaDao_0(oConnection, ob, oUsuarioBeanSession);
                        break;
                }
                break;
            default:
                throw new Exception("Error en Dao factory de " + ob);
        }

        return oDao;
    }
}
