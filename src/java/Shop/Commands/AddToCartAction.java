/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shop.Commands;

import Shop.CartModel;
import Shop.Product;
import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author spitzmessera
 */
public class AddToCartAction extends Action{

    CartModel cartModel;

    public AddToCartAction() {
        super();
        this.cartModel = CartModel.getInstance();
    }

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        String idString = request.getParameter("productId");
        int selectedNumber = Integer.parseInt(idString);

        if (products.stream().anyMatch((Product prod) -> prod.getNumber() == selectedNumber)) {
            Optional<Product> product = products.stream().filter((Product prod) -> prod.getNumber() == selectedNumber).findFirst();
            if (product == null) {
                throw new NullPointerException();
            }
            if (product.get().getStock() > 0) {
                try {
                    cartModel.AddCartEntry(product.get(), 1);
                    product.get().setStock(product.get().getStock() - 1);
                    
                    response.sendRedirect(request.getContextPath() + "/Controller");
                    return "succes";
                } catch (Exception ex) {
                    request.setAttribute("errorMessage", ex.getMessage());
                    return "failure";
                }
            }
        }
        return "failure";
    }
}