/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.springbootWithH2andJPA.controller;

import com.example.springbootWithH2andJPA.Entity.Invoice;
import com.example.springbootWithH2andJPA.Services.InvoiceService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author William
 */
@RestController
public class InvoiceController {
  
    @Autowired
    private InvoiceService invServiceRef;
    
    @RequestMapping(value="/invoices",method=RequestMethod.POST)
    public Invoice addInvoice(Invoice invoiceObj){
        return invServiceRef.addInvoice(invoiceObj);
    }
    @RequestMapping(value="/invoices",method=RequestMethod.GET)
    public List<Invoice> viewAllInvoices(){
       return invServiceRef.getAllInvoices();
    }
    @RequestMapping(value="/invoices/{id}",method=RequestMethod.GET)
    public Invoice viewInvoice(@PathVariable Long id){
        return invServiceRef.getInvoice(id);
    }   
}
