package com.example.springbootWithH2andJPA.Repository;

import com.example.springbootWithH2andJPA.Entity.LineItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 *
 * @author William
 */
@Repository
public interface LineItemRepository extends JpaRepository<LineItem, Long> {
}
