package com.example.springbootWithH2andJPA.Repository;

import com.example.springbootWithH2andJPA.Entity.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author William
 */
@Repository
public interface InvoiceRepository extends JpaRepository<Invoice,Long> {
      
}
