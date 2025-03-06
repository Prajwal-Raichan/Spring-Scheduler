package com.merin.sb_scheduler.repository;

import com.merin.sb_scheduler.entity.GoldProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GoldIProductRepository extends JpaRepository<GoldProduct, Long> {

}
