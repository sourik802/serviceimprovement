package com.monsanto.serviceimprovement.repository;

import com.monsanto.serviceimprovement.entity.CropEntity;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by SNAND3 on 4/5/2018.
 */
public interface CropRepository extends CrudRepository<CropEntity, Byte> {

    public CropEntity findByName(String name);
}
