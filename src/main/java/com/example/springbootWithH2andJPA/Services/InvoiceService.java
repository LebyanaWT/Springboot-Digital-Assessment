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
   
  private final BigDecimal vatPercentage = new BigDecimal(0.15);

  @Autowired
  InvoiceRepository invoiceRep;
 
  @Autowired
  LineItemService lineItemService;

    private BigDecimal total = BigDecimal.ZERO;
  
    public Invoice addInvoice(Invoice invc){
        invoiceRep.save(invc);
        return invc;
    }
   
    public List<Invoice> viewAllInvoices(){
        List<Invoice> invoicesList = new ArrayList<>();
        invoiceRep.findAll().forEach(invoicesList::add);
        return invoicesList;
    }
  
    public Invoice getInvoice(Long id){
        List<Invoice> invoices = viewAllInvoices();
        return invoices.stream().filter(i -> i.getId().equals(id)).findFirst().get();
    }
}