/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shop.Commands;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author spitzmessera
 */
public class BackToProductsAction extends Action{    
    
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        try {
            response.sendRedirect("/WEB-INF/View/Products.jsp");
            return "success";
        } catch (IOException ex) {
            Logger.getLogger(BackToProductsAction.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "failure";
    }
    
}
