/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shop.Commands;

import Shop.Commands.Action;
import Shop.DBConnector;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author spitzmessera
 */
public class ClearFilterAction extends Action {    

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        
        try {
            request.setAttribute("products", DBConnector.getInstance().getResult());
            request.setAttribute("selectedProducer", null);
        } catch (SQLException ex) {
            Logger.getLogger(ClearFilterAction.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return "/WEB-INF/View/Products.jsp";
    }
}
