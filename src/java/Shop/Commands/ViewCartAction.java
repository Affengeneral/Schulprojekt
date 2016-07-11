/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shop.Commands;

import Shop.CartModel;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author spitzmessera
 */
public class ViewCartAction extends Action{

    private final CartModel cartModel;
    private final ServletContext context;

    public ViewCartAction(ServletContext context) {
        super();
        this.cartModel = CartModel.getInstance();
        this.context = context;
    }

    
    
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        request.getSession().setAttribute("cart", cartModel);
        
        RequestDispatcher requestDispatcher = context.getRequestDispatcher("/WEB-INF/View/Cart.jsp");
        try {
            requestDispatcher.forward(request, response);
            return "success";
        } catch (ServletException ex) {
            Logger.getLogger(ViewCartAction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ViewCartAction.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "failure";
    }
    
}
