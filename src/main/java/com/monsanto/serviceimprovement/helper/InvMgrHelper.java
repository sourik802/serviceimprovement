package com.monsanto.serviceimprovement.helper;

import com.monsanto.serviceimprovement.entity.InventoryEntity;
import com.monsanto.serviceimprovement.repository.InventoryRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

/**
 * Created by SNAND3 on 4/15/2018.
 */
@Component
public class InvMgrHelper {

    private static final Logger LOGGER = LoggerFactory.getLogger(InvMgrHelper.class);

    @Autowired
    private InventoryRepository inventoryRepository;

    @Transactional
    public String activationUpdate(String barcode, String option) {
        LOGGER.info("Within update() for values " + barcode + "  " + option);
        InventoryEntity inventoryEntity = inventoryRepository.findByBarcode(barcode);
        if (inventoryEntity != null) {
            inventoryEntity.setIsActive(option);
            return "Success";
        }
        if (inventoryEntity == null) {
            return "Inventory does not exist";
        }
        return "Failure";
    }
}
