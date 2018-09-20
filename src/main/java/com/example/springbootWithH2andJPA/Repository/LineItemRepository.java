package com.example.springbootWithH2andJPA.Repository;

import com.example.springbootWithH2andJPA.Entity.LineItem;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author William
 */
public interface LineItemRepository extends JpaRepository<LineItem, Long> {
}
