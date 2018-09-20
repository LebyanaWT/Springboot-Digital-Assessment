package com.example.springbootWithH2andJPA.Repository;

import com.example.springbootWithH2andJPA.Entity.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author William
 */
public interface InvoiceRepository extends JpaRepository<Invoice,Long> {
    
}
