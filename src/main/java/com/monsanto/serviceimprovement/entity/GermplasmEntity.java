package com.monsanto.serviceimprovement.entity;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Time;

/**
 * Created by SNAND3 on 4/3/2018.
 */
@Entity
@javax.persistence.Table(name = "GERMPLASM", schema = "MIDAS", catalog = "")
public class GermplasmEntity {
	private byte germplasmId;

	@Id
	@javax.persistence.Column(name = "GERMPLASM_ID")
	public byte getGermplasmId() {
		return germplasmId;
	}

	public void setGermplasmId(byte germplasmId) {
		this.germplasmId = germplasmId;
	}

	private String origin;

	@Basic
	@javax.persistence.Column(name = "ORIGIN")
	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	private String lineCode;

	@Basic
	@javax.persistence.Column(name = "LINE_CODE")
	public String getLineCode() {
		return lineCode;
	}

	public void setLineCode(String lineCode) {
		this.lineCode = lineCode;
	}

	private String pedigreeName;

	@Basic
	@javax.persistence.Column(name = "PEDIGREE_NAME")
	public String getPedigreeName() {
		return pedigreeName;
	}

	public void setPedigreeName(String pedigreeName) {
		this.pedigreeName = pedigreeName;
	}

	private String isTransgenic;

	@Basic
	@javax.persistence.Column(name = "IS_TRANSGENIC")
	public String getIsTransgenic() {
		return isTransgenic;
	}

	public void setIsTransgenic(String isTransgenic) {
		this.isTransgenic = isTransgenic;
	}

	private String remRefNumber;

	@Basic
	@javax.persistence.Column(name = "REM_REF_NUMBER")
	public String getRemRefNumber() {
		return remRefNumber;
	}

	public void setRemRefNumber(String remRefNumber) {
		this.remRefNumber = remRefNumber;
	}

	private String eventDisplay;

	@Basic
	@javax.persistence.Column(name = "EVENT_DISPLAY")
	public String getEventDisplay() {
		return eventDisplay;
	}

	public void setEventDisplay(String eventDisplay) {
		this.eventDisplay = eventDisplay;
	}

	private Byte virgoId;

	@Basic
	@javax.persistence.Column(name = "VIRGO_ID")
	public Byte getVirgoId() {
		return virgoId;
	}

	public void setVirgoId(Byte virgoId) {
		this.virgoId = virgoId;
	}

	private String oldPedigree;

	@Basic
	@javax.persistence.Column(name = "OLD_PEDIGREE")
	public String getOldPedigree() {
		return oldPedigree;
	}

	public void setOldPedigree(String oldPedigree) {
		this.oldPedigree = oldPedigree;
	}

	private String marisDbOrTemplate;

	@Basic
	@javax.persistence.Column(name = "MARIS_DB_OR_TEMPLATE")
	public String getMarisDbOrTemplate() {
		return marisDbOrTemplate;
	}

	public void setMarisDbOrTemplate(String marisDbOrTemplate) {
		this.marisDbOrTemplate = marisDbOrTemplate;
	}

	private Byte marisPedIdOrTemplateId;

	@Basic
	@javax.persistence.Column(name = "MARIS_PED_ID_OR_TEMPLATE_ID")
	public Byte getMarisPedIdOrTemplateId() {
		return marisPedIdOrTemplateId;
	}

	public void setMarisPedIdOrTemplateId(Byte marisPedIdOrTemplateId) {
		this.marisPedIdOrTemplateId = marisPedIdOrTemplateId;
	}

	private Byte holdensRefIndex;

	@Basic
	@javax.persistence.Column(name = "HOLDENS_REF_INDEX")
	public Byte getHoldensRefIndex() {
		return holdensRefIndex;
	}

	public void setHoldensRefIndex(Byte holdensRefIndex) {
		this.holdensRefIndex = holdensRefIndex;
	}

	private String constructDisplay;

	@Basic
	@javax.persistence.Column(name = "CONSTRUCT_DISPLAY")
	public String getConstructDisplay() {
		return constructDisplay;
	}

	public void setConstructDisplay(String constructDisplay) {
		this.constructDisplay = constructDisplay;
	}

	private String cytoplasmDonor;

	@Basic
	@javax.persistence.Column(name = "CYTOPLASM_DONOR")
	public String getCytoplasmDonor() {
		return cytoplasmDonor;
	}

	public void setCytoplasmDonor(String cytoplasmDonor) {
		this.cytoplasmDonor = cytoplasmDonor;
	}

	private String isDeleted;

	@Basic
	@javax.persistence.Column(name = "IS_DELETED")
	public String getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(String isDeleted) {
		this.isDeleted = isDeleted;
	}

	private String isFinishedOrFinishedChild;

	@Basic
	@javax.persistence.Column(name = "IS_FINISHED_OR_FINISHED_CHILD")
	public String getIsFinishedOrFinishedChild() {
		return isFinishedOrFinishedChild;
	}

	public void setIsFinishedOrFinishedChild(String isFinishedOrFinishedChild) {
		this.isFinishedOrFinishedChild = isFinishedOrFinishedChild;
	}

	private Time codeYear;

	@Basic
	@javax.persistence.Column(name = "CODE_YEAR")
	public Time getCodeYear() {
		return codeYear;
	}

	public void setCodeYear(Time codeYear) {
		this.codeYear = codeYear;
	}

	private String transformationGenotype;

	@Basic
	@javax.persistence.Column(name = "TRANSFORMATION_GENOTYPE")
	public String getTransformationGenotype() {
		return transformationGenotype;
	}

	public void setTransformationGenotype(String transformationGenotype) {
		this.transformationGenotype = transformationGenotype;
	}

	private String regulatoryNameDisplay;

	@Basic
	@javax.persistence.Column(name = "REGULATORY_NAME_DISPLAY")
	public String getRegulatoryNameDisplay() {
		return regulatoryNameDisplay;
	}

	public void setRegulatoryNameDisplay(String regulatoryNameDisplay) {
		this.regulatoryNameDisplay = regulatoryNameDisplay;
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

	private String originatorIdTxt;

	@Basic
	@javax.persistence.Column(name = "ORIGINATOR_ID_TXT")
	public String getOriginatorIdTxt() {
		return originatorIdTxt;
	}

	public void setOriginatorIdTxt(String originatorIdTxt) {
		this.originatorIdTxt = originatorIdTxt;
	}

	private Byte crossContactMidasUserId;

	@Basic
	@javax.persistence.Column(name = "CROSS_CONTACT_MIDAS_USER_ID")
	public Byte getCrossContactMidasUserId() {
		return crossContactMidasUserId;
	}

	public void setCrossContactMidasUserId(Byte crossContactMidasUserId) {
		this.crossContactMidasUserId = crossContactMidasUserId;
	}

	private Byte crossOwnerBrProgId;

	@Basic
	@javax.persistence.Column(name = "CROSS_OWNER_BR_PROG_ID")
	public Byte getCrossOwnerBrProgId() {
		return crossOwnerBrProgId;
	}

	public void setCrossOwnerBrProgId(Byte crossOwnerBrProgId) {
		this.crossOwnerBrProgId = crossOwnerBrProgId;
	}

	private String crossName;

	@Basic
	@javax.persistence.Column(name = "CROSS_NAME")
	public String getCrossName() {
		return crossName;
	}

	public void setCrossName(String crossName) {
		this.crossName = crossName;
	}

	private String ownerBrProgRefId;

	@Basic
	@javax.persistence.Column(name = "OWNER_BR_PROG_REF_ID")
	public String getOwnerBrProgRefId() {
		return ownerBrProgRefId;
	}

	public void setOwnerBrProgRefId(String ownerBrProgRefId) {
		this.ownerBrProgRefId = ownerBrProgRefId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		GermplasmEntity that = (GermplasmEntity) o;

		if (germplasmId != that.germplasmId) return false;
		if (origin != null ? !origin.equals(that.origin) : that.origin != null) return false;
		if (lineCode != null ? !lineCode.equals(that.lineCode) : that.lineCode != null) return false;
		if (pedigreeName != null ? !pedigreeName.equals(that.pedigreeName) : that.pedigreeName != null) return false;
		if (isTransgenic != null ? !isTransgenic.equals(that.isTransgenic) : that.isTransgenic != null) return false;
		if (remRefNumber != null ? !remRefNumber.equals(that.remRefNumber) : that.remRefNumber != null) return false;
		if (eventDisplay != null ? !eventDisplay.equals(that.eventDisplay) : that.eventDisplay != null) return false;
		if (virgoId != null ? !virgoId.equals(that.virgoId) : that.virgoId != null) return false;
		if (oldPedigree != null ? !oldPedigree.equals(that.oldPedigree) : that.oldPedigree != null) return false;
		if (marisDbOrTemplate != null ? !marisDbOrTemplate.equals(that.marisDbOrTemplate) : that.marisDbOrTemplate != null)
			return false;
		if (marisPedIdOrTemplateId != null ? !marisPedIdOrTemplateId.equals(that.marisPedIdOrTemplateId) : that.marisPedIdOrTemplateId != null)
			return false;
		if (holdensRefIndex != null ? !holdensRefIndex.equals(that.holdensRefIndex) : that.holdensRefIndex != null)
			return false;
		if (constructDisplay != null ? !constructDisplay.equals(that.constructDisplay) : that.constructDisplay != null)
			return false;
		if (cytoplasmDonor != null ? !cytoplasmDonor.equals(that.cytoplasmDonor) : that.cytoplasmDonor != null)
			return false;
		if (isDeleted != null ? !isDeleted.equals(that.isDeleted) : that.isDeleted != null) return false;
		if (isFinishedOrFinishedChild != null ? !isFinishedOrFinishedChild.equals(that.isFinishedOrFinishedChild) : that.isFinishedOrFinishedChild != null)
			return false;
		if (codeYear != null ? !codeYear.equals(that.codeYear) : that.codeYear != null) return false;
		if (transformationGenotype != null ? !transformationGenotype.equals(that.transformationGenotype) : that.transformationGenotype != null)
			return false;
		if (regulatoryNameDisplay != null ? !regulatoryNameDisplay.equals(that.regulatoryNameDisplay) : that.regulatoryNameDisplay != null)
			return false;
		if (creationDate != null ? !creationDate.equals(that.creationDate) : that.creationDate != null) return false;
		if (originatorIdTxt != null ? !originatorIdTxt.equals(that.originatorIdTxt) : that.originatorIdTxt != null)
			return false;
		if (crossContactMidasUserId != null ? !crossContactMidasUserId.equals(that.crossContactMidasUserId) : that.crossContactMidasUserId != null)
			return false;
		if (crossOwnerBrProgId != null ? !crossOwnerBrProgId.equals(that.crossOwnerBrProgId) : that.crossOwnerBrProgId != null)
			return false;
		if (crossName != null ? !crossName.equals(that.crossName) : that.crossName != null) return false;
		if (ownerBrProgRefId != null ? !ownerBrProgRefId.equals(that.ownerBrProgRefId) : that.ownerBrProgRefId != null)
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = (int) germplasmId;
		result = 31 * result + (origin != null ? origin.hashCode() : 0);
		result = 31 * result + (lineCode != null ? lineCode.hashCode() : 0);
		result = 31 * result + (pedigreeName != null ? pedigreeName.hashCode() : 0);
		result = 31 * result + (isTransgenic != null ? isTransgenic.hashCode() : 0);
		result = 31 * result + (remRefNumber != null ? remRefNumber.hashCode() : 0);
		result = 31 * result + (eventDisplay != null ? eventDisplay.hashCode() : 0);
		result = 31 * result + (virgoId != null ? virgoId.hashCode() : 0);
		result = 31 * result + (oldPedigree != null ? oldPedigree.hashCode() : 0);
		result = 31 * result + (marisDbOrTemplate != null ? marisDbOrTemplate.hashCode() : 0);
		result = 31 * result + (marisPedIdOrTemplateId != null ? marisPedIdOrTemplateId.hashCode() : 0);
		result = 31 * result + (holdensRefIndex != null ? holdensRefIndex.hashCode() : 0);
		result = 31 * result + (constructDisplay != null ? constructDisplay.hashCode() : 0);
		result = 31 * result + (cytoplasmDonor != null ? cytoplasmDonor.hashCode() : 0);
		result = 31 * result + (isDeleted != null ? isDeleted.hashCode() : 0);
		result = 31 * result + (isFinishedOrFinishedChild != null ? isFinishedOrFinishedChild.hashCode() : 0);
		result = 31 * result + (codeYear != null ? codeYear.hashCode() : 0);
		result = 31 * result + (transformationGenotype != null ? transformationGenotype.hashCode() : 0);
		result = 31 * result + (regulatoryNameDisplay != null ? regulatoryNameDisplay.hashCode() : 0);
		result = 31 * result + (creationDate != null ? creationDate.hashCode() : 0);
		result = 31 * result + (originatorIdTxt != null ? originatorIdTxt.hashCode() : 0);
		result = 31 * result + (crossContactMidasUserId != null ? crossContactMidasUserId.hashCode() : 0);
		result = 31 * result + (crossOwnerBrProgId != null ? crossOwnerBrProgId.hashCode() : 0);
		result = 31 * result + (crossName != null ? crossName.hashCode() : 0);
		result = 31 * result + (ownerBrProgRefId != null ? ownerBrProgRefId.hashCode() : 0);
		return result;
	}
}
