/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shop.Commands;

import Shop.CartEntry;
import Shop.CartModel;
import Shop.DBConnector;
import Shop.Product;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author spitzmessera
 */
public class AddToCartAction extends Action {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        try {
            String idString = request.getParameter("productId");

            HashMap<String, String> filters = new HashMap<>();
            filters.put("id_product", idString);

            List<Product> products = DBConnector.getInstance().getFilteredResult(new String[]{"*"}, filters);

            Product product = products.get(0);
            if (product == null) {
                throw new NullPointerException();
            }
            int stockCount = product.getStock();
            
            ArrayList<CartEntry> cartEntries = CartModel.getInstance().getCartEntries();
            Optional<CartEntry> findFirst = cartEntries.stream().filter((CartEntry entry) -> entry.getProduct().getNumber() == product.getNumber()).findFirst();
            
            if (stockCount - (findFirst.isPresent() ? findFirst.get().getCount() : 0) > 0) {
                try {
                    CartModel.getInstance().AddCartEntry(product, 1);
                    request.setAttribute("cart", CartModel.getInstance());
                    
//                    return "/WEB-INF/View/Cart.jsp";
                } catch (Exception ex) {
                    request.setAttribute("errorMessage", ex.getMessage());
                    return "/WEB-INF/View/Products.jsp";
                }
            }
            if (stockCount - (findFirst.isPresent() ? findFirst.get().getCount() : 0) == 0){
                
                request.setAttribute("notAvailable", product.getNumber());
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddToCartAction.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "/WEB-INF/View/Products.jsp";
    }
}
