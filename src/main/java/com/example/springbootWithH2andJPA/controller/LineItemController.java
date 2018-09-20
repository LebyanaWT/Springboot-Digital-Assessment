
package com.example.springbootWithH2andJPA.controller;

import com.example.springbootWithH2andJPA.Entity.LineItem;
import com.example.springbootWithH2andJPA.Services.LineItemService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author William
 */
@RestController
public class LineItemController {
    
    @Autowired
    private LineItemService lineItemserv;
    
    @RequestMapping(value="/lineitems",method=RequestMethod.POST)
    public LineItem addLineItem(LineItem lineItemObj){
        return lineItemserv.addLineItem(lineItemObj);
    }
    @RequestMapping(value="/lineitems",method=RequestMethod.GET)
    public List<LineItem> viewAllLineItems(){
       return lineItemserv.getAllListItem();
    }
    @RequestMapping(value="/lineitems/{id}",method=RequestMethod.GET)
    public LineItem viewLineItem(@PathVariable Long id){
        return lineItemserv.getLineItem(id);
    }
    
}
