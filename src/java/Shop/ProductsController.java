package Shop;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Shop.DBConnector;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Optional;
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

        System.out.println(session.getId());

        DBConnector connector = null;
        List<Product> products = null;
        CartModel cart = (CartModel) session.getAttribute("cart");
        if (cart == null) {
            cart = new CartModel();
            session.setAttribute("cart", cart);
        }

        if (connector == null) {
            connector = new DBConnector();
        }
        if (products == null) {
            products = connector.GetResult();
        }

        session.setAttribute("products", products);

        String action = null;

        Enumeration<String> parameterNames = request.getParameterNames();

        if (request.getParameterNames().hasMoreElements()) {
            action = request.getParameterNames().nextElement();
        }
        if (action == null) {
            action = null;
        } else {
            System.out.println(action);
            System.out.println(session.getServletContext().getContextPath());
        }
        if ("viewCart".equals(action)) {
            url = "/WEB-INF/View/Cart.jsp";
            session.setAttribute("cart", cart);
        }
        if ("backToProducts".equals(action)) {
            url = "/WEB-INF/View/Products.jsp";
        }
        if (action != null && action.startsWith("addToCart")) {
            action = action.replace("addToCart", "");
            int selectedNumber = Integer.parseInt(action);

            if (products.stream().anyMatch((Product prod) -> prod.getNumber() == selectedNumber)) {
                Optional<Product> product = products.stream().filter((Product prod) -> prod.getNumber() == selectedNumber).findFirst();
                if (product == null) {
                    throw new NullPointerException();
                }
                if (product.get().getStock() > 0){
                    cart.AddCartEntry(product.get(), 1);
                }
            }
        }
        if (action != null && action.startsWith("detail")) {
            action = action.replace("detail_", "");
            action = action.replace(".x", "");
            int productId = Integer.parseInt(action);
            session.setAttribute("product", (Product) products.stream().filter((Product p) -> p.getNumber() == productId).findFirst().get());
            url = "/WEB-INF/View/Details.jsp";
        }
        if (action != null && action.startsWith("deleteEntry")) {
            action = action.replace("deleteEntry_", "");
            action = action.replace(".x", "");
            int entryId = Integer.parseInt(action);
            ArrayList<CartEntry> tempList = cart.getCartEntries();
            for (CartEntry entry : tempList) {
                if (entry.getId() != entryId){
                    continue;
                }
                if (entry.getCount() > 1) {
                    entry.setCount(entry.getCount() - 1);
                } else {
                    cart.getCartEntries().remove(entryId);
                }
            }
            url = "/WEB-INF/View/Cart.jsp";
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
