/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.project.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Chonticha Sae-jiw
 */
public class UrbanCart {

    private List<LineItem> products;

    public UrbanCart() {
        products = new ArrayList<LineItem>();
    }

    public List<LineItem> getProduct() {
        return products;
    }

    public void addProduct(LineItem product) {
        for (LineItem prod : products) {
            if (prod.getProduct().getProduct_Id().equals(product.getProduct().getProduct_Id())) {
                prod.setQuantity(product.getQuantity());
                return;
            }
        }
        products.add(product);
    }

    public void removeProduct(LineItem product) {
        for (LineItem prod : products) {
            if (prod.getProduct().getProduct_Id().equals(product.getProduct().getProduct_Id())) {
                products.remove(prod);
                return;
            }
        }
    }
    
    public double TotalPrice(){
        double total = 0;
        
        for (LineItem prod: products) {
            total += prod.getPrice();
        }
        
        return total;
    }
    
    public int getTotalQuantity(){
        int sum = 0;

        for (LineItem prod : products) {
            sum += prod.getQuantity();
        }
        return sum;
    }
    
}
