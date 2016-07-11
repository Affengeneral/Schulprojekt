/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shop.Commands;

import Shop.DBConnector;
import Shop.Product;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author spitzmessera
 */
public abstract class Action {

    List<Product> products;
    
    public Action() {
        if (products == null) {
            products = new DBConnector().getResult();
        }
    }

    public abstract String execute(HttpServletRequest request, HttpServletResponse response);
}
