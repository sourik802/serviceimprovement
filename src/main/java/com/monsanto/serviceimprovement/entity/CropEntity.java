package com.monsanto.serviceimprovement.entity;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by SNAND3 on 4/3/2018.
 */
@Entity
@Table(name = "CROP", schema = "MIDAS", catalog = "")
public class CropEntity {
	private BigDecimal cropId;
	private String name;
	private String remCropId;
	private String refActive;
	private String genusSpecies;
	private String cropRefId;
	private BigDecimal listOrder;
	private BigDecimal rmMin;
	private BigDecimal rmMax;
	private BigDecimal rmIncrement;

	@Id
	@Column(name = "CROP_ID")
	public BigDecimal getCropId() {
		return cropId;
	}

	public void setCropId(BigDecimal cropId) {
		this.cropId = cropId;
	}

	@Basic
	@Column(name = "NAME")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Basic
	@Column(name = "REM_CROP_ID")
	public String getRemCropId() {
		return remCropId;
	}

	public void setRemCropId(String remCropId) {
		this.remCropId = remCropId;
	}

	@Basic
	@Column(name = "REF_ACTIVE")
	public String getRefActive() {
		return refActive;
	}

	public void setRefActive(String refActive) {
		this.refActive = refActive;
	}

	@Basic
	@Column(name = "GENUS_SPECIES")
	public String getGenusSpecies() {
		return genusSpecies;
	}

	public void setGenusSpecies(String genusSpecies) {
		this.genusSpecies = genusSpecies;
	}

	@Basic
	@Column(name = "CROP_REF_ID")
	public String getCropRefId() {
		return cropRefId;
	}

	public void setCropRefId(String cropRefId) {
		this.cropRefId = cropRefId;
	}

	@Basic
	@Column(name = "LIST_ORDER")
	public BigDecimal getListOrder() {
		return listOrder;
	}

	public void setListOrder(BigDecimal listOrder) {
		this.listOrder = listOrder;
	}

	@Basic
	@Column(name = "RM_MIN")
	public BigDecimal getRmMin() {
		return rmMin;
	}

	public void setRmMin(BigDecimal rmMin) {
		this.rmMin = rmMin;
	}

	@Basic
	@Column(name = "RM_MAX")
	public BigDecimal getRmMax() {
		return rmMax;
	}

	public void setRmMax(BigDecimal rmMax) {
		this.rmMax = rmMax;
	}

	@Basic
	@Column(name = "RM_INCREMENT")
	public BigDecimal getRmIncrement() {
		return rmIncrement;
	}

	public void setRmIncrement(BigDecimal rmIncrement) {
		this.rmIncrement = rmIncrement;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		CropEntity that = (CropEntity) o;

		if (cropId != that.cropId) return false;
		if (rmMin != that.rmMin) return false;
		if (rmMax != that.rmMax) return false;
		if (rmIncrement != that.rmIncrement) return false;
		if (name != null ? !name.equals(that.name) : that.name != null) return false;
		if (remCropId != null ? !remCropId.equals(that.remCropId) : that.remCropId != null) return false;
		if (refActive != null ? !refActive.equals(that.refActive) : that.refActive != null) return false;
		if (genusSpecies != null ? !genusSpecies.equals(that.genusSpecies) : that.genusSpecies != null) return false;
		if (cropRefId != null ? !cropRefId.equals(that.cropRefId) : that.cropRefId != null) return false;
		if (listOrder != null ? !listOrder.equals(that.listOrder) : that.listOrder != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		BigDecimal result1 = (BigDecimal) cropId;
		Integer result = result1.intValue();
		result = 31 * result + (name != null ? name.hashCode() : 0);
		result = 31 * result + (remCropId != null ? remCropId.hashCode() : 0);
		result = 31 * result + (refActive != null ? refActive.hashCode() : 0);
		result = 31 * result + (genusSpecies != null ? genusSpecies.hashCode() : 0);
		result = 31 * result + (cropRefId != null ? cropRefId.hashCode() : 0);
		result = 31 * result + (listOrder != null ? listOrder.hashCode() : 0);
		result = 31 * result + (int) rmMin.intValue();
		result = 31 * result + (int) rmMax.intValue();
		result = 31 * result + (int) rmIncrement.intValue();
		return result;
	}
}
