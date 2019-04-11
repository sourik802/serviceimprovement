package com.monsanto.serviceimprovement.entity;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Time;

/**
 * Created by SNAND3 on 4/3/2018.
 */
@Entity
@javax.persistence.Table(name = "INVENTORY", schema = "MIDAS", catalog = "")
public class InventoryEntity {
	private Long inventoryId;

	@Id
	@javax.persistence.Column(name = "INVENTORY_ID")
	public Long getInventoryId() {
		return inventoryId;
	}

	public void setInventoryId(Long inventoryId) {
		this.inventoryId = inventoryId;
	}

	private String checkIndicator;

	@Basic
	@javax.persistence.Column(name = "CHECK_INDICATOR")
	public String getCheckIndicator() {
		return checkIndicator;
	}

	public void setCheckIndicator(String checkIndicator) {
		this.checkIndicator = checkIndicator;
	}

	private String isActive;

	@Basic
	@javax.persistence.Column(name = "IS_ACTIVE")
	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	private String isPlaced;

	@Basic
	@javax.persistence.Column(name = "IS_PLACED")
	public String getIsPlaced() {
		return isPlaced;
	}

	public void setIsPlaced(String isPlaced) {
		this.isPlaced = isPlaced;
	}

	private String location;

	@Basic
	@javax.persistence.Column(name = "LOCATION")
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	private String bulkReason;

	@Basic
	@javax.persistence.Column(name = "BULK_REASON")
	public String getBulkReason() {
		return bulkReason;
	}

	public void setBulkReason(String bulkReason) {
		this.bulkReason = bulkReason;
	}

	private String archivedMaterial;

	@Basic
	@javax.persistence.Column(name = "ARCHIVED_MATERIAL")
	public String getArchivedMaterial() {
		return archivedMaterial;
	}

	public void setArchivedMaterial(String archivedMaterial) {
		this.archivedMaterial = archivedMaterial;
	}

	private String isPreview;

	@Basic
	@javax.persistence.Column(name = "IS_PREVIEW")
	public String getIsPreview() {
		return isPreview;
	}

	public void setIsPreview(String isPreview) {
		this.isPreview = isPreview;
	}

	private Byte quantity;

	@Basic
	@javax.persistence.Column(name = "QUANTITY")
	public Byte getQuantity() {
		return quantity;
	}

	public void setQuantity(Byte quantity) {
		this.quantity = quantity;
	}

	private String asort1;

	@Basic
	@javax.persistence.Column(name = "ASORT1")
	public String getAsort1() {
		return asort1;
	}

	public void setAsort1(String asort1) {
		this.asort1 = asort1;
	}

	private String asort2;

	@Basic
	@javax.persistence.Column(name = "ASORT2")
	public String getAsort2() {
		return asort2;
	}

	public void setAsort2(String asort2) {
		this.asort2 = asort2;
	}

	private String asort3;

	@Basic
	@javax.persistence.Column(name = "ASORT3")
	public String getAsort3() {
		return asort3;
	}

	public void setAsort3(String asort3) {
		this.asort3 = asort3;
	}

	private String asort4;

	@Basic
	@javax.persistence.Column(name = "ASORT4")
	public String getAsort4() {
		return asort4;
	}

	public void setAsort4(String asort4) {
		this.asort4 = asort4;
	}

	private String asort5;

	@Basic
	@javax.persistence.Column(name = "ASORT5")
	public String getAsort5() {
		return asort5;
	}

	public void setAsort5(String asort5) {
		this.asort5 = asort5;
	}

	private Byte nsort1;

	@Basic
	@javax.persistence.Column(name = "NSORT1")
	public Byte getNsort1() {
		return nsort1;
	}

	public void setNsort1(Byte nsort1) {
		this.nsort1 = nsort1;
	}

	private Byte nsort2;

	@Basic
	@javax.persistence.Column(name = "NSORT2")
	public Byte getNsort2() {
		return nsort2;
	}

	public void setNsort2(Byte nsort2) {
		this.nsort2 = nsort2;
	}

	private Byte nsort3;

	@Basic
	@javax.persistence.Column(name = "NSORT3")
	public Byte getNsort3() {
		return nsort3;
	}

	public void setNsort3(Byte nsort3) {
		this.nsort3 = nsort3;
	}

	private Byte nsort4;

	@Basic
	@javax.persistence.Column(name = "NSORT4")
	public Byte getNsort4() {
		return nsort4;
	}

	public void setNsort4(Byte nsort4) {
		this.nsort4 = nsort4;
	}

	private Byte nsort5;

	@Basic
	@javax.persistence.Column(name = "NSORT5")
	public Byte getNsort5() {
		return nsort5;
	}

	public void setNsort5(Byte nsort5) {
		this.nsort5 = nsort5;
	}

	private String invComments;

	@Basic
	@javax.persistence.Column(name = "INV_COMMENTS")
	public String getInvComments() {
		return invComments;
	}

	public void setInvComments(String invComments) {
		this.invComments = invComments;
	}

	private String barcode;

	@Basic
	@javax.persistence.Column(name = "BARCODE")
	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	private String toBeDestroyed;

	@Basic
	@javax.persistence.Column(name = "TO_BE_DESTROYED")
	public String getToBeDestroyed() {
		return toBeDestroyed;
	}

	public void setToBeDestroyed(String toBeDestroyed) {
		this.toBeDestroyed = toBeDestroyed;
	}

	private Time destructionDate;

	@Basic
	@javax.persistence.Column(name = "DESTRUCTION_DATE")
	public Time getDestructionDate() {
		return destructionDate;
	}

	public void setDestructionDate(Time destructionDate) {
		this.destructionDate = destructionDate;
	}

	private String isPlacedInArchivedBook;

	@Basic
	@javax.persistence.Column(name = "IS_PLACED_IN_ARCHIVED_BOOK")
	public String getIsPlacedInArchivedBook() {
		return isPlacedInArchivedBook;
	}

	public void setIsPlacedInArchivedBook(String isPlacedInArchivedBook) {
		this.isPlacedInArchivedBook = isPlacedInArchivedBook;
	}

	private Time fateReasonDate;

	@Basic
	@javax.persistence.Column(name = "FATE_REASON_DATE")
	public Time getFateReasonDate() {
		return fateReasonDate;
	}

	public void setFateReasonDate(Time fateReasonDate) {
		this.fateReasonDate = fateReasonDate;
	}

	private Time creationDate;

	@Basic
	@javax.persistence.Column(name = "CREATION_DATE")
	public Time getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Time creationDate) {
		this.creationDate = creationDate;
	}

	private Byte currentQty;

	@Basic
	@javax.persistence.Column(name = "CURRENT_QTY")
	public Byte getCurrentQty() {
		return currentQty;
	}

	public void setCurrentQty(Byte currentQty) {
		this.currentQty = currentQty;
	}

	private Byte nbrSubinventoryToCreate;

	@Basic
	@javax.persistence.Column(name = "NBR_SUBINVENTORY_TO_CREATE")
	public Byte getNbrSubinventoryToCreate() {
		return nbrSubinventoryToCreate;
	}

	public void setNbrSubinventoryToCreate(Byte nbrSubinventoryToCreate) {
		this.nbrSubinventoryToCreate = nbrSubinventoryToCreate;
	}

	private Byte subinventoryQuantity;

	@Basic
	@javax.persistence.Column(name = "SUBINVENTORY_QUANTITY")
	public Byte getSubinventoryQuantity() {
		return subinventoryQuantity;
	}

	public void setSubinventoryQuantity(Byte subinventoryQuantity) {
		this.subinventoryQuantity = subinventoryQuantity;
	}

	private String virgoId;

	@Basic
	@javax.persistence.Column(name = "VIRGO_ID")
	public String getVirgoId() {
		return virgoId;
	}

	public void setVirgoId(String virgoId) {
		this.virgoId = virgoId;
	}

	private String storageUnitBarcode;

	@Basic
	@javax.persistence.Column(name = "STORAGE_UNIT_BARCODE")
	public String getStorageUnitBarcode() {
		return storageUnitBarcode;
	}

	public void setStorageUnitBarcode(String storageUnitBarcode) {
		this.storageUnitBarcode = storageUnitBarcode;
	}

	private String storageUnitDisplayDnml;

	@Basic
	@javax.persistence.Column(name = "STORAGE_UNIT_DISPLAY_DNML")
	public String getStorageUnitDisplayDnml() {
		return storageUnitDisplayDnml;
	}

	public void setStorageUnitDisplayDnml(String storageUnitDisplayDnml) {
		this.storageUnitDisplayDnml = storageUnitDisplayDnml;
	}

	private Time readyForTransformationDate;

	@Basic
	@javax.persistence.Column(name = "READY_FOR_TRANSFORMATION_DATE")
	public Time getReadyForTransformationDate() {
		return readyForTransformationDate;
	}

	public void setReadyForTransformationDate(Time readyForTransformationDate) {
		this.readyForTransformationDate = readyForTransformationDate;
	}

	private String seedTreatment;

	@Basic
	@javax.persistence.Column(name = "SEED_TREATMENT")
	public String getSeedTreatment() {
		return seedTreatment;
	}

	public void setSeedTreatment(String seedTreatment) {
		this.seedTreatment = seedTreatment;
	}

	private String goiTxt;

	@Basic
	@javax.persistence.Column(name = "GOI_TXT")
	public String getGoiTxt() {
		return goiTxt;
	}

	public void setGoiTxt(String goiTxt) {
		this.goiTxt = goiTxt;
	}

	private Byte originQty;

	@Basic
	@javax.persistence.Column(name = "ORIGIN_QTY")
	public Byte getOriginQty() {
		return originQty;
	}

	public void setOriginQty(Byte originQty) {
		this.originQty = originQty;
	}

	private Time originDate;

	@Basic
	@javax.persistence.Column(name = "ORIGIN_DATE")
	public Time getOriginDate() {
		return originDate;
	}

	public void setOriginDate(Time originDate) {
		this.originDate = originDate;
	}

	private Byte weight;

	@Basic
	@javax.persistence.Column(name = "WEIGHT")
	public Byte getWeight() {
		return weight;
	}

	public void setWeight(Byte weight) {
		this.weight = weight;
	}

	private String modifiedUseridTxt;

	@Basic
	@javax.persistence.Column(name = "MODIFIED_USERID_TXT")
	public String getModifiedUseridTxt() {
		return modifiedUseridTxt;
	}

	public void setModifiedUseridTxt(String modifiedUseridTxt) {
		this.modifiedUseridTxt = modifiedUseridTxt;
	}

	private Time modifiedDt;

	@Basic
	@javax.persistence.Column(name = "MODIFIED_DT")
	public Time getModifiedDt() {
		return modifiedDt;
	}

	public void setModifiedDt(Time modifiedDt) {
		this.modifiedDt = modifiedDt;
	}

	private Byte firstAllocationQty;

	@Basic
	@javax.persistence.Column(name = "FIRST_ALLOCATION_QTY")
	public Byte getFirstAllocationQty() {
		return firstAllocationQty;
	}

	public void setFirstAllocationQty(Byte firstAllocationQty) {
		this.firstAllocationQty = firstAllocationQty;
	}

	private Byte secondAllocationQty;

	@Basic
	@javax.persistence.Column(name = "SECOND_ALLOCATION_QTY")
	public Byte getSecondAllocationQty() {
		return secondAllocationQty;
	}

	public void setSecondAllocationQty(Byte secondAllocationQty) {
		this.secondAllocationQty = secondAllocationQty;
	}

	private Time seedProcessingDt;

	@Basic
	@javax.persistence.Column(name = "SEED_PROCESSING_DT")
	public Time getSeedProcessingDt() {
		return seedProcessingDt;
	}

	public void setSeedProcessingDt(Time seedProcessingDt) {
		this.seedProcessingDt = seedProcessingDt;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		InventoryEntity that = (InventoryEntity) o;

		if (inventoryId != that.inventoryId) return false;
		if (checkIndicator != null ? !checkIndicator.equals(that.checkIndicator) : that.checkIndicator != null)
			return false;
		if (isActive != null ? !isActive.equals(that.isActive) : that.isActive != null) return false;
		if (isPlaced != null ? !isPlaced.equals(that.isPlaced) : that.isPlaced != null) return false;
		if (location != null ? !location.equals(that.location) : that.location != null) return false;
		if (bulkReason != null ? !bulkReason.equals(that.bulkReason) : that.bulkReason != null) return false;
		if (archivedMaterial != null ? !archivedMaterial.equals(that.archivedMaterial) : that.archivedMaterial != null)
			return false;
		if (isPreview != null ? !isPreview.equals(that.isPreview) : that.isPreview != null) return false;
		if (quantity != null ? !quantity.equals(that.quantity) : that.quantity != null) return false;
		if (asort1 != null ? !asort1.equals(that.asort1) : that.asort1 != null) return false;
		if (asort2 != null ? !asort2.equals(that.asort2) : that.asort2 != null) return false;
		if (asort3 != null ? !asort3.equals(that.asort3) : that.asort3 != null) return false;
		if (asort4 != null ? !asort4.equals(that.asort4) : that.asort4 != null) return false;
		if (asort5 != null ? !asort5.equals(that.asort5) : that.asort5 != null) return false;
		if (nsort1 != null ? !nsort1.equals(that.nsort1) : that.nsort1 != null) return false;
		if (nsort2 != null ? !nsort2.equals(that.nsort2) : that.nsort2 != null) return false;
		if (nsort3 != null ? !nsort3.equals(that.nsort3) : that.nsort3 != null) return false;
		if (nsort4 != null ? !nsort4.equals(that.nsort4) : that.nsort4 != null) return false;
		if (nsort5 != null ? !nsort5.equals(that.nsort5) : that.nsort5 != null) return false;
		if (invComments != null ? !invComments.equals(that.invComments) : that.invComments != null) return false;
		if (barcode != null ? !barcode.equals(that.barcode) : that.barcode != null) return false;
		if (toBeDestroyed != null ? !toBeDestroyed.equals(that.toBeDestroyed) : that.toBeDestroyed != null)
			return false;
		if (destructionDate != null ? !destructionDate.equals(that.destructionDate) : that.destructionDate != null)
			return false;
		if (isPlacedInArchivedBook != null ? !isPlacedInArchivedBook.equals(that.isPlacedInArchivedBook) : that.isPlacedInArchivedBook != null)
			return false;
		if (fateReasonDate != null ? !fateReasonDate.equals(that.fateReasonDate) : that.fateReasonDate != null)
			return false;
		if (creationDate != null ? !creationDate.equals(that.creationDate) : that.creationDate != null) return false;
		if (currentQty != null ? !currentQty.equals(that.currentQty) : that.currentQty != null) return false;
		if (nbrSubinventoryToCreate != null ? !nbrSubinventoryToCreate.equals(that.nbrSubinventoryToCreate) : that.nbrSubinventoryToCreate != null)
			return false;
		if (subinventoryQuantity != null ? !subinventoryQuantity.equals(that.subinventoryQuantity) : that.subinventoryQuantity != null)
			return false;
		if (virgoId != null ? !virgoId.equals(that.virgoId) : that.virgoId != null) return false;
		if (storageUnitBarcode != null ? !storageUnitBarcode.equals(that.storageUnitBarcode) : that.storageUnitBarcode != null)
			return false;
		if (storageUnitDisplayDnml != null ? !storageUnitDisplayDnml.equals(that.storageUnitDisplayDnml) : that.storageUnitDisplayDnml != null)
			return false;
		if (readyForTransformationDate != null ? !readyForTransformationDate.equals(that.readyForTransformationDate) : that.readyForTransformationDate != null)
			return false;
		if (seedTreatment != null ? !seedTreatment.equals(that.seedTreatment) : that.seedTreatment != null)
			return false;
		if (goiTxt != null ? !goiTxt.equals(that.goiTxt) : that.goiTxt != null) return false;
		if (originQty != null ? !originQty.equals(that.originQty) : that.originQty != null) return false;
		if (originDate != null ? !originDate.equals(that.originDate) : that.originDate != null) return false;
		if (weight != null ? !weight.equals(that.weight) : that.weight != null) return false;
		if (modifiedUseridTxt != null ? !modifiedUseridTxt.equals(that.modifiedUseridTxt) : that.modifiedUseridTxt != null)
			return false;
		if (modifiedDt != null ? !modifiedDt.equals(that.modifiedDt) : that.modifiedDt != null) return false;
		if (firstAllocationQty != null ? !firstAllocationQty.equals(that.firstAllocationQty) : that.firstAllocationQty != null)
			return false;
		if (secondAllocationQty != null ? !secondAllocationQty.equals(that.secondAllocationQty) : that.secondAllocationQty != null)
			return false;
		if (seedProcessingDt != null ? !seedProcessingDt.equals(that.seedProcessingDt) : that.seedProcessingDt != null)
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = ((Long) inventoryId).intValue();
		result = 31 * result + (checkIndicator != null ? checkIndicator.hashCode() : 0);
		result = 31 * result + (isActive != null ? isActive.hashCode() : 0);
		result = 31 * result + (isPlaced != null ? isPlaced.hashCode() : 0);
		result = 31 * result + (location != null ? location.hashCode() : 0);
		result = 31 * result + (bulkReason != null ? bulkReason.hashCode() : 0);
		result = 31 * result + (archivedMaterial != null ? archivedMaterial.hashCode() : 0);
		result = 31 * result + (isPreview != null ? isPreview.hashCode() : 0);
		result = 31 * result + (quantity != null ? quantity.hashCode() : 0);
		result = 31 * result + (asort1 != null ? asort1.hashCode() : 0);
		result = 31 * result + (asort2 != null ? asort2.hashCode() : 0);
		result = 31 * result + (asort3 != null ? asort3.hashCode() : 0);
		result = 31 * result + (asort4 != null ? asort4.hashCode() : 0);
		result = 31 * result + (asort5 != null ? asort5.hashCode() : 0);
		result = 31 * result + (nsort1 != null ? nsort1.hashCode() : 0);
		result = 31 * result + (nsort2 != null ? nsort2.hashCode() : 0);
		result = 31 * result + (nsort3 != null ? nsort3.hashCode() : 0);
		result = 31 * result + (nsort4 != null ? nsort4.hashCode() : 0);
		result = 31 * result + (nsort5 != null ? nsort5.hashCode() : 0);
		result = 31 * result + (invComments != null ? invComments.hashCode() : 0);
		result = 31 * result + (barcode != null ? barcode.hashCode() : 0);
		result = 31 * result + (toBeDestroyed != null ? toBeDestroyed.hashCode() : 0);
		result = 31 * result + (destructionDate != null ? destructionDate.hashCode() : 0);
		result = 31 * result + (isPlacedInArchivedBook != null ? isPlacedInArchivedBook.hashCode() : 0);
		result = 31 * result + (fateReasonDate != null ? fateReasonDate.hashCode() : 0);
		result = 31 * result + (creationDate != null ? creationDate.hashCode() : 0);
		result = 31 * result + (currentQty != null ? currentQty.hashCode() : 0);
		result = 31 * result + (nbrSubinventoryToCreate != null ? nbrSubinventoryToCreate.hashCode() : 0);
		result = 31 * result + (subinventoryQuantity != null ? subinventoryQuantity.hashCode() : 0);
		result = 31 * result + (virgoId != null ? virgoId.hashCode() : 0);
		result = 31 * result + (storageUnitBarcode != null ? storageUnitBarcode.hashCode() : 0);
		result = 31 * result + (storageUnitDisplayDnml != null ? storageUnitDisplayDnml.hashCode() : 0);
		result = 31 * result + (readyForTransformationDate != null ? readyForTransformationDate.hashCode() : 0);
		result = 31 * result + (seedTreatment != null ? seedTreatment.hashCode() : 0);
		result = 31 * result + (goiTxt != null ? goiTxt.hashCode() : 0);
		result = 31 * result + (originQty != null ? originQty.hashCode() : 0);
		result = 31 * result + (originDate != null ? originDate.hashCode() : 0);
		result = 31 * result + (weight != null ? weight.hashCode() : 0);
		result = 31 * result + (modifiedUseridTxt != null ? modifiedUseridTxt.hashCode() : 0);
		result = 31 * result + (modifiedDt != null ? modifiedDt.hashCode() : 0);
		result = 31 * result + (firstAllocationQty != null ? firstAllocationQty.hashCode() : 0);
		result = 31 * result + (secondAllocationQty != null ? secondAllocationQty.hashCode() : 0);
		result = 31 * result + (seedProcessingDt != null ? seedProcessingDt.hashCode() : 0);
		return result;
	}
}
