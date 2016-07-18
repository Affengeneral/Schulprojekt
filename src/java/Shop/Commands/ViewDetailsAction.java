/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shop.Commands;

import Shop.DBConnector;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author spitzmessera
 */
public class ViewDetailsAction extends Action {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        int productId = Integer.parseInt(request.getParameter("productId"));

        try {
            request.getSession().setAttribute("product", DBConnector.getInstance().getResult().get(productId));
        } catch (SQLException ex) {
            Logger.getLogger(ViewDetailsAction.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "/WEB-INF/View/Details.jsp";
    }

}
