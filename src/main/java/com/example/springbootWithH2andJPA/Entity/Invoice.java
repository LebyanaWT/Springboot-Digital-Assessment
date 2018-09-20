package com.example.springbootWithH2andJPA.Entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author William
 */
@Entity
@Table(name="invoice")
public class Invoice{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="inv_id")
    private Long id;
    @Column(name="client")
    private String client;
    @Column(name="vatRate")
    private Long vatRate;
    @Temporal(TemporalType.DATE)
    @Column(name="invoiceDate")
    private Date invoiceDate;

   
    public Invoice(){}
    public Invoice(String client,Long vatRate,Date invoiceDate){
        super();
        this.client = client;
        this.vatRate = vatRate;
        this.invoiceDate = invoiceDate;   
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getClient() {
        return client;
    }
    public void setClient(String client) {
        this.client = client;
    }
    public Long getVatRate() {
        return vatRate;
    }
    public void setVatRate(Long vatRate) {
        this.vatRate = vatRate;
    }
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    public Date getInvoiceDate() {
        return invoiceDate;
    }
    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }  

}
