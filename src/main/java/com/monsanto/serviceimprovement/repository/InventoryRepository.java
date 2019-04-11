package com.monsanto.serviceimprovement.repository;

import com.monsanto.serviceimprovement.entity.InventoryEntity;
import org.springframework.data.repository.CrudRepository;

import java.math.BigDecimal;

/**
 * Created by SNAND3 on 4/15/2018.
 */
public interface InventoryRepository extends CrudRepository<InventoryEntity, Long> {

    InventoryEntity findByBarcode(String barcode);
}
