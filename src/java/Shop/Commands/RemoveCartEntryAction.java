/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shop.Commands;

import Shop.CartEntry;
import Shop.CartModel;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author spitzmessera
 */
public class RemoveCartEntryAction extends Action{

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        int entryId = Integer.parseInt(request.getParameter("entryToRemove"));
        
        CartEntry entry = CartModel.getInstance().getEntryById(entryId);
        if (entry != null){
            if (entry.getCount() == 1){
                CartModel.getInstance().getCartEntries().remove(entry);
            }
            else {
                CartModel.getInstance().getEntryById(entryId).setCount(entry.getCount() - 1);
            }
        }
        
        return "/WEB-INF/View/Cart.jsp";
    }
    
}
