/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shop.Commands;

import Shop.CartModel;
import Shop.DBConnector;
import Shop.Product;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
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
            if (stockCount > 0) {
                try {
                    CartModel.getInstance().AddCartEntry(product, 1);
//                        product.setStock(stockCount - 1);
//
//                        DBConnector.getInstance().updateProduct(selectedNumber, "stockcount", stockCount - 1);

                    return "/WEB-INF/View/Test.jsp";
                } catch (Exception ex) {
                    request.setAttribute("errorMessage", ex.getMessage());
                    return "/WEB-INF/View/Products.jsp";
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddToCartAction.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "/WEB-INF/View/Products.jsp";
    }
}
