package com.monsanto.serviceimprovement.entity;

import javax.persistence.*;
import java.sql.Time;

/**
 * Created by SNAND3 on 4/3/2018.
 */
@Entity
@Table(name = "MATERIAL_EXCHANGE", schema = "MIDAS", catalog = "")
public class MaterialExchangeEntity {
	private byte materialExchangeId;
	private byte sentQuantity;
	private String packagedBy;
	private String permitNumber;
	private Time publicationDate;
	private String comments;
	private Time externalMidasProcessedDate;
	private String senderInvBarcode;
	private String receiverInvBarcode;
	private String rubProjName;
	private Byte rubSampleNumber;
	private String isActive;
	private Byte sentQuantityUomId;
	private String toBrProgRefId;
	private String fromBrProgRefId;

	@Id
	@Column(name = "MATERIAL_EXCHANGE_ID")
	public byte getMaterialExchangeId() {
		return materialExchangeId;
	}

	public void setMaterialExchangeId(byte materialExchangeId) {
		this.materialExchangeId = materialExchangeId;
	}

	@Basic
	@Column(name = "SENT_QUANTITY")
	public byte getSentQuantity() {
		return sentQuantity;
	}

	public void setSentQuantity(byte sentQuantity) {
		this.sentQuantity = sentQuantity;
	}

	@Basic
	@Column(name = "PACKAGED_BY")
	public String getPackagedBy() {
		return packagedBy;
	}

	public void setPackagedBy(String packagedBy) {
		this.packagedBy = packagedBy;
	}

	@Basic
	@Column(name = "PERMIT_NUMBER")
	public String getPermitNumber() {
		return permitNumber;
	}

	public void setPermitNumber(String permitNumber) {
		this.permitNumber = permitNumber;
	}

	@Basic
	@Column(name = "PUBLICATION_DATE")
	public Time getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(Time publicationDate) {
		this.publicationDate = publicationDate;
	}

	@Basic
	@Column(name = "COMMENTS")
	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	@Basic
	@Column(name = "EXTERNAL_MIDAS_PROCESSED_DATE")
	public Time getExternalMidasProcessedDate() {
		return externalMidasProcessedDate;
	}

	public void setExternalMidasProcessedDate(Time externalMidasProcessedDate) {
		this.externalMidasProcessedDate = externalMidasProcessedDate;
	}

	@Basic
	@Column(name = "SENDER_INV_BARCODE")
	public String getSenderInvBarcode() {
		return senderInvBarcode;
	}

	public void setSenderInvBarcode(String senderInvBarcode) {
		this.senderInvBarcode = senderInvBarcode;
	}

	@Basic
	@Column(name = "RECEIVER_INV_BARCODE")
	public String getReceiverInvBarcode() {
		return receiverInvBarcode;
	}

	public void setReceiverInvBarcode(String receiverInvBarcode) {
		this.receiverInvBarcode = receiverInvBarcode;
	}

	@Basic
	@Column(name = "RUB_PROJ_NAME")
	public String getRubProjName() {
		return rubProjName;
	}

	public void setRubProjName(String rubProjName) {
		this.rubProjName = rubProjName;
	}

	@Basic
	@Column(name = "RUB_SAMPLE_NUMBER")
	public Byte getRubSampleNumber() {
		return rubSampleNumber;
	}

	public void setRubSampleNumber(Byte rubSampleNumber) {
		this.rubSampleNumber = rubSampleNumber;
	}

	@Basic
	@Column(name = "IS_ACTIVE")
	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	@Basic
	@Column(name = "SENT_QUANTITY_UOM_ID")
	public Byte getSentQuantityUomId() {
		return sentQuantityUomId;
	}

	public void setSentQuantityUomId(Byte sentQuantityUomId) {
		this.sentQuantityUomId = sentQuantityUomId;
	}

	@Basic
	@Column(name = "TO_BR_PROG_REF_ID")
	public String getToBrProgRefId() {
		return toBrProgRefId;
	}

	public void setToBrProgRefId(String toBrProgRefId) {
		this.toBrProgRefId = toBrProgRefId;
	}

	@Basic
	@Column(name = "FROM_BR_PROG_REF_ID")
	public String getFromBrProgRefId() {
		return fromBrProgRefId;
	}

	public void setFromBrProgRefId(String fromBrProgRefId) {
		this.fromBrProgRefId = fromBrProgRefId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		MaterialExchangeEntity that = (MaterialExchangeEntity) o;

		if (materialExchangeId != that.materialExchangeId) return false;
		if (sentQuantity != that.sentQuantity) return false;
		if (packagedBy != null ? !packagedBy.equals(that.packagedBy) : that.packagedBy != null) return false;
		if (permitNumber != null ? !permitNumber.equals(that.permitNumber) : that.permitNumber != null) return false;
		if (publicationDate != null ? !publicationDate.equals(that.publicationDate) : that.publicationDate != null)
			return false;
		if (comments != null ? !comments.equals(that.comments) : that.comments != null) return false;
		if (externalMidasProcessedDate != null ? !externalMidasProcessedDate.equals(that.externalMidasProcessedDate) : that.externalMidasProcessedDate != null)
			return false;
		if (senderInvBarcode != null ? !senderInvBarcode.equals(that.senderInvBarcode) : that.senderInvBarcode != null)
			return false;
		if (receiverInvBarcode != null ? !receiverInvBarcode.equals(that.receiverInvBarcode) : that.receiverInvBarcode != null)
			return false;
		if (rubProjName != null ? !rubProjName.equals(that.rubProjName) : that.rubProjName != null) return false;
		if (rubSampleNumber != null ? !rubSampleNumber.equals(that.rubSampleNumber) : that.rubSampleNumber != null)
			return false;
		if (isActive != null ? !isActive.equals(that.isActive) : that.isActive != null) return false;
		if (sentQuantityUomId != null ? !sentQuantityUomId.equals(that.sentQuantityUomId) : that.sentQuantityUomId != null)
			return false;
		if (toBrProgRefId != null ? !toBrProgRefId.equals(that.toBrProgRefId) : that.toBrProgRefId != null)
			return false;
		if (fromBrProgRefId != null ? !fromBrProgRefId.equals(that.fromBrProgRefId) : that.fromBrProgRefId != null)
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = (int) materialExchangeId;
		result = 31 * result + (int) sentQuantity;
		result = 31 * result + (packagedBy != null ? packagedBy.hashCode() : 0);
		result = 31 * result + (permitNumber != null ? permitNumber.hashCode() : 0);
		result = 31 * result + (publicationDate != null ? publicationDate.hashCode() : 0);
		result = 31 * result + (comments != null ? comments.hashCode() : 0);
		result = 31 * result + (externalMidasProcessedDate != null ? externalMidasProcessedDate.hashCode() : 0);
		result = 31 * result + (senderInvBarcode != null ? senderInvBarcode.hashCode() : 0);
		result = 31 * result + (receiverInvBarcode != null ? receiverInvBarcode.hashCode() : 0);
		result = 31 * result + (rubProjName != null ? rubProjName.hashCode() : 0);
		result = 31 * result + (rubSampleNumber != null ? rubSampleNumber.hashCode() : 0);
		result = 31 * result + (isActive != null ? isActive.hashCode() : 0);
		result = 31 * result + (sentQuantityUomId != null ? sentQuantityUomId.hashCode() : 0);
		result = 31 * result + (toBrProgRefId != null ? toBrProgRefId.hashCode() : 0);
		result = 31 * result + (fromBrProgRefId != null ? fromBrProgRefId.hashCode() : 0);
		return result;
	}
}
