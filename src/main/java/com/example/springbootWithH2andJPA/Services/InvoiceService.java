
package com.example.springbootWithH2andJPA.Services;

import com.example.springbootWithH2andJPA.Entity.Invoice;
import com.example.springbootWithH2andJPA.Entity.LineItem;
import com.example.springbootWithH2andJPA.Repository.InvoiceRepository;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

/**
 *
 * @author William
 */
@Service
public class InvoiceService {
    
  @Autowired
  InvoiceRepository invoiceRep;
 
   private LineItem lineItem; 
  
  public List<Invoice> getAllInvoices(){
      List<Invoice> invoicesList = new ArrayList<>();
      invoiceRep.findAll().forEach(invoicesList::add);
      return invoicesList;
  }
  
  public Invoice addInvoice(Invoice invc){
      invoiceRep.save(invc);
      return invc;
  }
  public Invoice getInvoice(Long id){
      List<Invoice> invoices = getAllInvoices();
      return invoices.stream().filter(i -> i.getId().equals(id)).findFirst().get();
  }
  public BigDecimal getSubTotal(){
      double subtotal = 0;
      return null;
  }
  public BigDecimal getVat(){
      return null;
  } 
  public BigDecimal getTotal(){

   return null;
}
}