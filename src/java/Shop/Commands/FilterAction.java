/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shop.Commands;

import Shop.DBConnector;
import Shop.Product;
import java.sql.SQLException;
import java.util.ArrayList;
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
public class FilterAction extends Action {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        String selectedProducer = request.getParameter("selectedProducer");
        System.out.println(selectedProducer);

        HashMap<String, String> filters = new HashMap<>();
        filters.put("id_product", selectedProducer);
        List<Product> products = new ArrayList<>();
        try {
            products = DBConnector.getInstance().getFilteredResult(new String[]{"*"}, filters);
        } catch (SQLException ex) {
            Logger.getLogger(FilterAction.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (Product product : products) {
            System.out.println(product.getNumber());
        }
        request.setAttribute("products", products);

        request.setAttribute("selectedFilterOprion", selectedProducer);
        return "/WEB-INF/View/Products.jsp";
    }
}
