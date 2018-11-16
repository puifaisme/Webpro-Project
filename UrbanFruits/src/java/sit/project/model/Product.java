/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.project.model;

/**
 *
 * @author Chonticha Sae-jiw
 */
public class Product {
    private String product_Id;
    private String product_name;
    private int category_id;
    private double price;
    private String image;

    public Product() {
    }

    public Product(String product_Id, String product_name, int category_id, double price, String image) {
        this.product_Id = product_Id;
        this.product_name = product_name;
        this.category_id = category_id;
        this.price = price;
        this.image = image;
    }

    public String getProduct_Id() {
        return product_Id;
    }

    public void setProduct_Id(String product_Id) {
        this.product_Id = product_Id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Product{" + "product_Id=" + product_Id + ", product_name=" + product_name + ", category_id=" + category_id + ", price=" + price + ", image=" + image + '}';
    }
    
    

}
