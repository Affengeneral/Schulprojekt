package Shop;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Shop.Commands.Action;
import Shop.Commands.AddToCartAction;
import Shop.Commands.BackToProductsAction;
import Shop.Commands.ClearFilterAction;
import Shop.Commands.FilterAction;
import Shop.Commands.RemoveCartEntryAction;
import Shop.Commands.ViewCartAction;
import Shop.Commands.ViewDetailsAction;
import java.io.IOException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Alex
 */
@WebServlet(urlPatterns = {"/Products"})
public class ProductsController extends HttpServlet {

    private Map<String, Action> actionMap;

    private CartModel cart;

    public ProductsController() {
        this.actionMap = new HashMap<>();
    }

    @Override
    public void init() throws ServletException {
        super.init(); //To change body of generated methods, choose Tools | Templates.

        actionMap.put("addToCart", new AddToCartAction());
        actionMap.put("viewCart", new ViewCartAction());
        actionMap.put("details", new ViewDetailsAction());
        actionMap.put("backToProducts", new BackToProductsAction());
        actionMap.put("Filter", new FilterAction());
        actionMap.put("Filter löschen", new ClearFilterAction());
        actionMap.put("removeCartEntry", new RemoveCartEntryAction());
    }

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, Exception {
        response.setContentType("text/html;charset=UTF-8");
        String url = "/WEB-INF/View/Products.jsp";

        HttpSession session = request.getSession();

        DBConnector connector = null;
        List<Product> products = null;
        cart = (CartModel) session.getAttribute("cart");
        if (cart == null) {
            cart = CartModel.getInstance();
            session.setAttribute("cart", cart);
        }

        if (connector == null) {
            connector = DBConnector.getInstance();
        }
        if (products == null) {
            products = connector.getResult();
        }

        List<Product> source = DBConnector.getInstance().getDistinctBy("manufacturer");

        session.setAttribute("productsFilter", source);

        session.setAttribute("products", products);

        String actionKey = request.getParameter("action");
        if (actionKey != null && !"".equals(actionKey)) {
            Action action = actionMap.get(actionKey);
            url = action.execute(request, response);
        }

        ServletContext sc = this.getServletContext();
        RequestDispatcher rd = sc.getRequestDispatcher(url);
        rd.forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(ProductsController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(ProductsController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    @Override
    public void destroy() {
        super.destroy(); //To change body of generated methods, choose Tools | Templates.
    }
}
