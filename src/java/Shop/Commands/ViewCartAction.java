/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shop.Commands;

import Shop.CartModel;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author spitzmessera
 */
public class ViewCartAction extends Action{
    
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        request.getSession().setAttribute("cart", CartModel.getInstance());
        
        return "/WEB-INF/View/Cart.jsp";
    }
    
}
