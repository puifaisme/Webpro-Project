/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urban.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Bud
 */
@Entity
@Table(name = "ORDER_DETAIL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OrderDetail.findAll", query = "SELECT o FROM OrderDetail o")
    , @NamedQuery(name = "OrderDetail.findByOrderDetailno", query = "SELECT o FROM OrderDetail o WHERE o.orderDetailno = :orderDetailno")
    , @NamedQuery(name = "OrderDetail.findByAmount", query = "SELECT o FROM OrderDetail o WHERE o.amount = :amount")
    , @NamedQuery(name = "OrderDetail.findByTotalPrice", query = "SELECT o FROM OrderDetail o WHERE o.totalPrice = :totalPrice")})
public class OrderDetail implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ORDER_DETAILNO")
    private Integer orderDetailno;
    @Column(name = "AMOUNT")
    private Integer amount;
    @Column(name = "TOTAL_PRICE")
    private Integer totalPrice;
    @JoinColumn(name = "ORDER_ID", referencedColumnName = "ORDER_ID")
    @ManyToOne
    private OrderList orderId;
    @JoinColumn(name = "PRODUCT_ID", referencedColumnName = "PRODUCT_ID")
    @ManyToOne
    private Product productId;

    public OrderDetail() {
    }

    public OrderDetail(Integer orderDetailno) {
        this.orderDetailno = orderDetailno;
    }

    public Integer getOrderDetailno() {
        return orderDetailno;
    }

    public void setOrderDetailno(Integer orderDetailno) {
        this.orderDetailno = orderDetailno;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }

    public OrderList getOrderId() {
        return orderId;
    }

    public void setOrderId(OrderList orderId) {
        this.orderId = orderId;
    }

    public Product getProductId() {
        return productId;
    }

    public void setProductId(Product productId) {
        this.productId = productId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderDetailno != null ? orderDetailno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrderDetail)) {
            return false;
        }
        OrderDetail other = (OrderDetail) object;
        if ((this.orderDetailno == null && other.orderDetailno != null) || (this.orderDetailno != null && !this.orderDetailno.equals(other.orderDetailno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "urban.model.OrderDetail[ orderDetailno=" + orderDetailno + " ]";
    }
    
}
