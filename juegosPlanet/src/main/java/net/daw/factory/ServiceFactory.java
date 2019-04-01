package net.daw.factory;

import javax.servlet.http.HttpServletRequest;
import net.daw.bean.beanImplementation.ReplyBean;
import net.daw.bean.beanImplementation.UsuarioBean;

/**
 *
 * @author artur
 */
public class ServiceFactory {

    public static ReplyBean executeService(HttpServletRequest oRequest) throws Exception {

        String ob = oRequest.getParameter("ob");
        String op = oRequest.getParameter("op");

        int idSessionUserTipe;
        UsuarioBean oUsuarioBeanSession = (UsuarioBean) oRequest.getSession().getAttribute("user");
        if (oUsuarioBeanSession != null) {
            idSessionUserTipe = oUsuarioBeanSession.getObj_tipoUsuario().getId();
        } else {
            idSessionUserTipe = 0;
        }

        ReplyBean oReplyBean = null;

        switch (idSessionUserTipe) {
            case 1:
                switch (ob) {
                    case "tipousuario":
                        TipousuarioService_1 oTipousuarioService = new TipousuarioService_1(oRequest);
                        switch (op) {
                            case "get":
                                oReplyBean = oTipousuarioService.get();
                                break;
                            case "create":
                                oReplyBean = oTipousuarioService.create();
                                break;
                            case "update":
                                oReplyBean = oTipousuarioService.update();
                                break;
                            case "remove":
                                oReplyBean = oTipousuarioService.remove();
                                break;
                            case "getcount":
                                oReplyBean = oTipousuarioService.getcount();
                                break;
                            case "getpage":
                                oReplyBean = oTipousuarioService.getpage();
                                break;
                            default:
                                oReplyBean = new ReplyBean(500, "Operation doesn't exist");
                                break;
                        }
                        break;
                    case "usuario":
                        UsuarioService_1 oUsuarioService = new UsuarioService_1(oRequest);
                        switch (op) {
                            case "get":
                                oReplyBean = oUsuarioService.get();
                                break;
                            case "create":
                                oReplyBean = oUsuarioService.create();
                                break;
                            case "update":
                                oReplyBean = oUsuarioService.update();
                                break;
                            case "remove":
                                oReplyBean = oUsuarioService.remove();
                                break;
                            case "getcount":
                                oReplyBean = oUsuarioService.getcount();
                                break;
                            case "getpage":
                                oReplyBean = oUsuarioService.getpage();
                                break;
                            case "fill":
                                oReplyBean = oUsuarioService.fill();
                                break;
                            case "logout":
                                oReplyBean = oUsuarioService.logout();
                                break;
                            case "check":
                                oReplyBean = oUsuarioService.check();
                                break;
                            default:
                                oReplyBean = new ReplyBean(500, "Operation doesn't exist");
                                break;
                        }
                        break;
                    case "factura":
                        FacturaService_1 oFacturaService = new FacturaService_1(oRequest);
                        switch (op) {
                            case "get":
                                oReplyBean = oFacturaService.get();
                                break;
                            case "create":
                                oReplyBean = oFacturaService.create();
                                break;
                            case "update":
                                oReplyBean = oFacturaService.update();
                                break;
                            case "remove":
                                oReplyBean = oFacturaService.remove();
                                break;
                            case "getcount":
                                oReplyBean = oFacturaService.getcount();
                                break;
                            case "getpage":
                                oReplyBean = oFacturaService.getpage();
                                break;
                            case "getpagexusuario":
                                oReplyBean = oFacturaService.getpageXusuario();
                                break;
                            case "getcountxusuario":
                                oReplyBean = oFacturaService.getcountXusuario();
                                break;
                            default:
                                oReplyBean = new ReplyBean(500, "Operation doesn't exist");
                                break;
                        }
                        break;
                    case "linea":
                        LineaService_1 oLineaService = new LineaService_1(oRequest);
                        String pepe = oRequest.getParameter("idfactura");
                        switch (op) {
                            case "get":
                                oReplyBean = oLineaService.get();
                                break;
                            case "create":
                                oReplyBean = oLineaService.create();
                                break;
                            case "update":
                                oReplyBean = oLineaService.update();
                                break;
                            case "remove":
                                oReplyBean = oLineaService.remove();
                                break;
                            case "getcount":
                                oReplyBean = oLineaService.getcount();
                                break;
                            case "getpage":
                                oReplyBean = oLineaService.getpage();
                                break;
                            case "getlineafactura":
                                oReplyBean = oLineaService.getLineaFactura();
                                break;
                            case "getcountxlinea":
                                oReplyBean = oLineaService.getcountxlinea();
                                break;
                            default:
                                oReplyBean = new ReplyBean(500, "Operation doesn't exist");
                                break;
                        }
                        break;

                    case "producto":
                        ProductoService_1 oProductoService = new ProductoService_1(oRequest);
                        switch (op) {
                            case "get":
                                oReplyBean = oProductoService.get();
                                break;
                            case "create":
                                oReplyBean = oProductoService.create();
                                break;
                            case "update":
                                oReplyBean = oProductoService.update();
                                break;
                            case "remove":
                                oReplyBean = oProductoService.remove();
                                break;
                            case "getcount":
                                oReplyBean = oProductoService.getcount();
                                break;
                            case "getpage":
                                oReplyBean = oProductoService.getpage();
                                break;
                            case "loaddata":
                                oReplyBean = oProductoService.loaddata();
                                break;
                            case "loadimage":
                                oReplyBean = oProductoService.loadimage();
                                break;
                            default:
                                oReplyBean = new ReplyBean(500, "Operation doesn't exist");
                                break;
                        }
                        break;
                    case "tipoproducto":
                        TipoproductoService_1 oTipoproductoService = new TipoproductoService_1(oRequest);
                        switch (op) {
                            case "get":
                                oReplyBean = oTipoproductoService.get();
                                break;
                            case "create":
                                oReplyBean = oTipoproductoService.create();
                                break;
                            case "update":
                                oReplyBean = oTipoproductoService.update();
                                break;
                            case "remove":
                                oReplyBean = oTipoproductoService.remove();
                                break;
                            case "getcount":
                                oReplyBean = oTipoproductoService.getcount();
                                break;
                            case "getpage":
                                oReplyBean = oTipoproductoService.getpage();
                                break;
                            default:
                                oReplyBean = new ReplyBean(500, "Operation doesn't exist");
                                break;
                        }
                        break;
                    case "comentario":
                        ComentarioService_1 oComentarioService = new ComentarioService_1(oRequest);
                        switch (op) {
                            case "get":
                                oReplyBean = oComentarioService.get();
                                break;
                            case "create":
                                oReplyBean = oComentarioService.create();
                                break;
                            case "update":
                                oReplyBean = oComentarioService.update();
                                break;
                            case "remove":
                                oReplyBean = oComentarioService.remove();
                                break;
                            case "getcount":
                                oReplyBean = oComentarioService.getcount();
                                break;
                            case "getpage":
                                oReplyBean = oComentarioService.getpage();
                                break;
                            default:
                                oReplyBean = new ReplyBean(500, "Operation doesn't exist");
                                break;
                        }
                        break;
                    case "marca":
                        MarcaService_1 oMarcaService = new MarcaService_1(oRequest);
                        switch (op) {
                            case "get":
                                oReplyBean = oMarcaService.get();
                                break;
                            case "create":
                                oReplyBean = oMarcaService.create();
                                break;
                            case "update":
                                oReplyBean = oMarcaService.update();
                                break;
                            case "remove":
                                oReplyBean = oMarcaService.remove();
                                break;
                            case "getcount":
                                oReplyBean = oMarcaService.getcount();
                                break;
                            case "getpage":
                                oReplyBean = oMarcaService.getpage();
                                break;
                            default:
                                oReplyBean = new ReplyBean(500, "Operation doesn't exist");
                                break;
                        }
                        break;
                    case "modelo":
                        ModeloService_1 oModeloService = new ModeloService_1(oRequest);
                        switch (op) {
                            case "get":
                                oReplyBean = oModeloService.get();
                                break;
                            case "create":
                                oReplyBean = oModeloService.create();
                                break;
                            case "update":
                                oReplyBean = oModeloService.update();
                                break;
                            case "remove":
                                oReplyBean = oModeloService.remove();
                                break;
                            case "getcount":
                                oReplyBean = oModeloService.getcount();
                                break;
                            case "getpage":
                                oReplyBean = oModeloService.getpage();
                                break;
                            default:
                                oReplyBean = new ReplyBean(500, "Operation doesn't exist");
                                break;
                        }
                        break;
                    case "fabricante":
                        FabricanteService_1 oFabricanteService = new FabricanteService_1(oRequest);
                        switch (op) {
                            case "get":
                                oReplyBean = oFabricanteService.get();
                                break;
                            case "create":
                                oReplyBean = oFabricanteService.create();
                                break;
                            case "update":
                                oReplyBean = oFabricanteService.update();
                                break;
                            case "remove":
                                oReplyBean = oFabricanteService.remove();
                                break;
                            case "getcount":
                                oReplyBean = oFabricanteService.getcount();
                                break;
                            case "getpage":
                                oReplyBean = oFabricanteService.getpage();
                                break;
                            default:
                                oReplyBean = new ReplyBean(500, "Operation doesn't exist");
                                break;
                        }
                        break;
                    default:
                        oReplyBean = new ReplyBean(500, "Object doesn't exist");
                        break;
                }
                break;
            case 2:
                switch (ob) {
                    case "tipousuario":
                        TipousuarioService_2 oTipousuarioService = new TipousuarioService_2(oRequest);
                        switch (op) {
                            case "get":
                                oReplyBean = oTipousuarioService.get();
                                break;
                            default:
                                oReplyBean = new ReplyBean(500, "Operation doesn't exist");
                                break;
                        }
                        break;
                    case "usuario":
                        UsuarioService_2 oUsuarioService = new UsuarioService_2(oRequest);
                        switch (op) {
                            case "get":
                                oReplyBean = oUsuarioService.get();
                                break;
                            case "update":
                                oReplyBean = oUsuarioService.update();
                                break;
                            case "logout":
                                oReplyBean = oUsuarioService.logout();
                                break;
                            case "check":
                                oReplyBean = oUsuarioService.check();
                                break;
                            default:
                                oReplyBean = new ReplyBean(500, "Operation doesn't exist");
                                break;
                        }
                        break;
                    case "factura":
                        FacturaService_2 oFacturaService = new FacturaService_2(oRequest);
                        switch (op) {
                            case "get":
                                oReplyBean = oFacturaService.get();
                                break;
                            case "getcount":
                                oReplyBean = oFacturaService.getcount();
                                break;
                            case "getpage":
                                oReplyBean = oFacturaService.getpage();
                                break;
                            case "getpagexusuario":
                                oReplyBean = oFacturaService.getpageXusuario();
                                break;
                            case "getcountxusuario":
                                oReplyBean = oFacturaService.getcountXusuario();
                                break;
                            default:
                                oReplyBean = new ReplyBean(500, "Operation doesn't exist");
                                break;
                        }
                        break;
                    case "linea":
                        LineaService_2 oLineaService = new LineaService_2(oRequest);
                        String pepe = oRequest.getParameter("idfactura");
                        switch (op) {
                            case "get":
                                oReplyBean = oLineaService.get();
                                break;
                            case "getcount":
                                oReplyBean = oLineaService.getcount();
                                break;
                            case "getpage":
                                oReplyBean = oLineaService.getpage();
                                break;
                            case "getlineafactura":
                                oReplyBean = oLineaService.getLineaFactura();
                                break;
                            case "getcountxlinea":
                                oReplyBean = oLineaService.getcountxlinea();
                                break;
                            default:
                                oReplyBean = new ReplyBean(500, "Operation doesn't exist");
                                break;
                        }
                        break;

                    case "producto":
                        ProductoService_2 oProductoService = new ProductoService_2(oRequest);
                        switch (op) {
                            case "get":
                                oReplyBean = oProductoService.get();
                                break;
                            case "getcount":
                                oReplyBean = oProductoService.getcount();
                                break;
                            case "getpage":
                                oReplyBean = oProductoService.getpage();
                                break;
                            default:
                                oReplyBean = new ReplyBean(500, "Operation doesn't exist");
                                break;
                        }
                        break;
                    case "tipoproducto":
                        TipoproductoService_2 oTipoproductoService = new TipoproductoService_2(oRequest);
                        switch (op) {
                            case "get":
                                oReplyBean = oTipoproductoService.get();
                                break;
                            case "getcount":
                                oReplyBean = oTipoproductoService.getcount();
                                break;
                            case "getpage":
                                oReplyBean = oTipoproductoService.getpage();
                                break;
                            default:
                                oReplyBean = new ReplyBean(500, "Operation doesn't exist");
                                break;
                        }
                        break;
                    case "carrito":
                        CarritoService_2 oCarritoService = new CarritoService_2(oRequest);
                        switch (op) {
                            case "add":
                                oReplyBean = oCarritoService.add();
                                break;
                            case "empty":
                                oReplyBean = oCarritoService.empty();
                                break;
                            case "reduce":
                                oReplyBean = oCarritoService.reduce();
                                break;
                            case "show":
                                oReplyBean = oCarritoService.show();
                                break;
                            case "buy":
                                oReplyBean = oCarritoService.buy();
                                break;
                            default:
                                oReplyBean = new ReplyBean(500, "Operation doesn't exist");
                                break;
                        }
                        break;
                         case "comentario":
                        ComentarioService_2 oComentarioService = new ComentarioService_2(oRequest);
                        switch (op) {
                            case "get":
                                oReplyBean = oComentarioService.get();
                                break;
                            case "create":
                                oReplyBean = oComentarioService.create();
                                break;
                            case "update":
                                oReplyBean = oComentarioService.update();
                                break;
                            case "remove":
                                oReplyBean = oComentarioService.remove();
                                break;
                            case "getcount":
                                oReplyBean = oComentarioService.getcount();
                                break;
                            case "getpage":
                                oReplyBean = oComentarioService.getpage();
                                break;
                            default:
                                oReplyBean = new ReplyBean(500, "Operation doesn't exist");
                                break;
                        }
                        break;
                    case "marca":
                        MarcaService_2 oMarcaService = new MarcaService_2(oRequest);
                        switch (op) {
                            case "get":
                                oReplyBean = oMarcaService.get();
                                break;
                            case "create":
                                oReplyBean = oMarcaService.create();
                                break;
                            case "update":
                                oReplyBean = oMarcaService.update();
                                break;
                            case "remove":
                                oReplyBean = oMarcaService.remove();
                                break;
                            case "getcount":
                                oReplyBean = oMarcaService.getcount();
                                break;
                            case "getpage":
                                oReplyBean = oMarcaService.getpage();
                                break;
                            default:
                                oReplyBean = new ReplyBean(500, "Operation doesn't exist");
                                break;
                        }
                        break;
                    case "modelo":
                        ModeloService_2 oModeloService = new ModeloService_2(oRequest);
                        switch (op) {
                            case "get":
                                oReplyBean = oModeloService.get();
                                break;
                            case "create":
                                oReplyBean = oModeloService.create();
                                break;
                            case "update":
                                oReplyBean = oModeloService.update();
                                break;
                            case "remove":
                                oReplyBean = oModeloService.remove();
                                break;
                            case "getcount":
                                oReplyBean = oModeloService.getcount();
                                break;
                            case "getpage":
                                oReplyBean = oModeloService.getpage();
                                break;
                            default:
                                oReplyBean = new ReplyBean(500, "Operation doesn't exist");
                                break;
                        }
                        break;
                    case "fabricante":
                        FabricanteService_2 oFabricanteService = new FabricanteService_2(oRequest);
                        switch (op) {
                            case "get":
                                oReplyBean = oFabricanteService.get();
                                break;
                            case "create":
                                oReplyBean = oFabricanteService.create();
                                break;
                            case "update":
                                oReplyBean = oFabricanteService.update();
                                break;
                            case "remove":
                                oReplyBean = oFabricanteService.remove();
                                break;
                            case "getcount":
                                oReplyBean = oFabricanteService.getcount();
                                break;
                            case "getpage":
                                oReplyBean = oFabricanteService.getpage();
                                break;
                            default:
                                oReplyBean = new ReplyBean(500, "Operation doesn't exist");
                                break;
                        }
                        break;
                    default:
                        oReplyBean = new ReplyBean(500, "Object doesn't exist");
                        break;
                }
                break;
            case 0:
                switch (ob) {
                    case "usuario":
                        UsuarioService_0 oUsuarioService = new UsuarioService_0(oRequest);
                        switch (op) {

                            case "login":
                                oReplyBean = oUsuarioService.login();
                                break;
                            case "check":
                                oReplyBean = oUsuarioService.check();
                                break;
                            default:
                                oReplyBean = new ReplyBean(500, "Operation doesn't exist");
                                break;
                        }
                        break;

                    default:
                        oReplyBean = new ReplyBean(500, "Object doesn't exist");
                        break;
                }
                break;
            default:
                oReplyBean = new ReplyBean(500, "Proefile doesn't exist");
                break;
        }
        return oReplyBean;
    }

}
