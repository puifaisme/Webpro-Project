/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.project.model;

import java.util.List;

/**
 *
 * @author Chonticha Sae-jiw
 */
public class ProductMockup {
    public static Product createProduct(Object products, String product_Id) {
		
        // Attempt to find the prodId and then return the Product.
        for (Product prod: (List<Product>) products) {
            if (prod.getProduct_Id().equals(product_Id)) {
                return prod;
            }
        }
        return null; 
    }
}
