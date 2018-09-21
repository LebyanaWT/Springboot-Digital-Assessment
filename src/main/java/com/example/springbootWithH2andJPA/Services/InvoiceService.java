package com.example.springbootWithH2andJPA.Services;


import com.example.springbootWithH2andJPA.Entity.LineItem;
import com.example.springbootWithH2andJPA.Repository.InvoiceRepository;
import com.example.springbootWithH2andJPA.Repository.LineItemRepository;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.springbootWithH2andJPA.Entity.Invoice;

/**
 *
 * @author William
 */
@Service
public class InvoiceService {
    
  @Autowired
  InvoiceRepository invoiceRep;
 
  @Autowired
  LineItemRepository lineitemRepo;
  
  private LineItem lineItem; 
  private BigDecimal total;
 
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
      List<LineItem> itemsList = new ArrayList<>();
      lineitemRepo.findAll().forEach(itemsList::add);
    BigDecimal unitCost = null;
      for(LineItem items : itemsList ){
          BigDecimal quantity = BigDecimal.valueOf(items.getQuantity()).setScale(2, RoundingMode.HALF_UP) ;
         unitCost = items.getUnitPrice().setScale(2, RoundingMode.HALF_UP);    
      } 
      return unitCost;
    }
}