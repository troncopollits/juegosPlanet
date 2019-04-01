package net.daw.factory;

import com.google.gson.Gson;
import net.daw.bean.beanImplementation.ComentarioBean;
import net.daw.bean.beanImplementation.FabricanteBean;
import net.daw.bean.beanImplementation.FacturaBean;
import net.daw.bean.beanImplementation.LineaBean;
import net.daw.bean.beanImplementation.MarcaBean;
import net.daw.bean.beanImplementation.ModeloBean;
import net.daw.bean.beanImplementation.ProductoBean;
import net.daw.bean.beanImplementation.TipoproductoBean;
import net.daw.bean.beanImplementation.TipousuarioBean;
import net.daw.bean.beanImplementation.UsuarioBean;
import net.daw.bean.publicBeanInterface.BeanInterface;

/**
 *
 * @author artur
 */
public class BeanFactory {

    public static BeanInterface getBean(String ob) {
        BeanInterface oBean = null;
        switch (ob) {
            case "usuario":
                oBean = (BeanInterface) new UsuarioBean();
                break;
            case "tipousuario":
                oBean = (BeanInterface) new TipousuarioBean();
                break;
            case "tipoproducto":
                oBean = (BeanInterface) new TipoproductoBean();
                break;
            case "producto":
                oBean = (BeanInterface) new ProductoBean();
                break;
            case "factura":
                oBean = (BeanInterface) new FacturaBean();
                break;
            case "linea":
                oBean = (BeanInterface) new LineaBean();
                break;
            case "comentario":
                oBean = (BeanInterface) new ComentarioBean();
                break;
            case "marca":
                oBean = (BeanInterface) new MarcaBean();
                break;
            case "modelo":
                oBean = (BeanInterface) new ModeloBean();
                break;
            case "fabricante":
                oBean = (BeanInterface) new FabricanteBean();
                break;
        }
        return oBean;
    }

    public static BeanInterface getBeanFromJson(String ob, Gson oGson, String strJsonFromClient) {
        BeanInterface oBean = null;
        switch (ob) {
            case "usuario":
                oBean = oGson.fromJson(strJsonFromClient, UsuarioBean.class);
                break;
            case "tipousuario":
                oBean = oGson.fromJson(strJsonFromClient, TipousuarioBean.class);
                break;
            case "tipoproducto":
                oBean = oGson.fromJson(strJsonFromClient, TipoproductoBean.class);
                break;
            case "producto":
                oBean = oGson.fromJson(strJsonFromClient, ProductoBean.class);
                break;
            case "factura":
                oBean = oGson.fromJson(strJsonFromClient, FacturaBean.class);
                break;
            case "linea":
                oBean = oGson.fromJson(strJsonFromClient, LineaBean.class);
                break;
            case "comentario":
                oBean = oGson.fromJson(strJsonFromClient, ComentarioBean.class);
                break;
            case "marca":
                oBean = oGson.fromJson(strJsonFromClient, MarcaBean.class);
                break;
            case "modelo":
                oBean = oGson.fromJson(strJsonFromClient, ModeloBean.class);
                break;
            case "fabricante":
                oBean = oGson.fromJson(strJsonFromClient, FabricanteBean.class);
                break;
        }
        return oBean;
    }
}
