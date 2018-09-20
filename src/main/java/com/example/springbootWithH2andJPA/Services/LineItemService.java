/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.springbootWithH2andJPA.Services;

import com.example.springbootWithH2andJPA.Entity.LineItem;
import com.example.springbootWithH2andJPA.Repository.LineItemRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author William
 */
@Service
public class LineItemService {
  
    @Autowired
    LineItemRepository lineitemRep;
 
    public List<LineItem> lineitemList = new ArrayList<>();
    
    public List<LineItem> getAllListItem(){
      lineitemRep.findAll().forEach(lineitemList::add);
      return lineitemList;
    }
    
    public LineItem addLineItem(LineItem lineItem){
        lineitemRep.save(lineItem);
        return lineItem;
    }
    
    public LineItem getLineItem(Long id){
        List<LineItem> lineItems = getAllListItem();
        return lineItems.stream().filter(i -> i.getId().equals(id)).findFirst().get();
    }

}
