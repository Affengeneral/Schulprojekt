/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shop.Commands;

import Shop.DBConnector;
import Shop.Product;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
            try {
                products = DBConnector.getInstance().getResult();
            } catch (SQLException ex) {
                Logger.getLogger(Action.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public abstract String execute(HttpServletRequest request, HttpServletResponse response);
}
