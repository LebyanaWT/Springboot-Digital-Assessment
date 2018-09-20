package com.example.springbootWithH2andJPA.Entity;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 *
 * @author William
 */
@Entity
@Table(name="line_item")
public class LineItem implements Serializable {
    
    private Long id;
    private Long quantity;
    private String description;
    private BigDecimal unitPrice;
  
    public LineItem(){}
    
    public LineItem(Long quantity ,String description,BigDecimal unitPrice){
        super();
        this.description = description;
        this.quantity = quantity;
        this.unitPrice =unitPrice;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    @Column(name="quantity")
    public Long getQuantity() {
        return quantity;
    }
    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }
    @Column(name="description")
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    @Column(name="unit_Price")
    public BigDecimal getUnitPrice() {
        return unitPrice;
    }
    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }   
}
