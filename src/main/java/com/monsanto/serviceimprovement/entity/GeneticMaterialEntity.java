package com.monsanto.serviceimprovement.entity;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Time;

/**
 * Created by SNAND3 on 4/3/2018.
 */
@Entity
@javax.persistence.Table(name = "GENETIC_MATERIAL", schema = "MIDAS", catalog = "")
public class GeneticMaterialEntity {
	private byte geneticMaterialId;

	@Id
	@javax.persistence.Column(name = "GENETIC_MATERIAL_ID")
	public byte getGeneticMaterialId() {
		return geneticMaterialId;
	}

	public void setGeneticMaterialId(byte geneticMaterialId) {
		this.geneticMaterialId = geneticMaterialId;
	}

	private String sourceStr;

	@Basic
	@javax.persistence.Column(name = "SOURCE_STR")
	public String getSourceStr() {
		return sourceStr;
	}

	public void setSourceStr(String sourceStr) {
		this.sourceStr = sourceStr;
	}

	private String generation;

	@Basic
	@javax.persistence.Column(name = "GENERATION")
	public String getGeneration() {
		return generation;
	}

	public void setGeneration(String generation) {
		this.generation = generation;
	}

	private String lineage;

	@Basic
	@javax.persistence.Column(name = "LINEAGE")
	public String getLineage() {
		return lineage;
	}

	public void setLineage(String lineage) {
		this.lineage = lineage;
	}

	private Byte srcAbsCol;

	@Basic
	@javax.persistence.Column(name = "SRC_ABS_COL")
	public Byte getSrcAbsCol() {
		return srcAbsCol;
	}

	public void setSrcAbsCol(Byte srcAbsCol) {
		this.srcAbsCol = srcAbsCol;
	}

	private Byte srcAbsRng;

	@Basic
	@javax.persistence.Column(name = "SRC_ABS_RNG")
	public Byte getSrcAbsRng() {
		return srcAbsRng;
	}

	public void setSrcAbsRng(Byte srcAbsRng) {
		this.srcAbsRng = srcAbsRng;
	}

	private String srcCrop;

	@Basic
	@javax.persistence.Column(name = "SRC_CROP")
	public String getSrcCrop() {
		return srcCrop;
	}

	public void setSrcCrop(String srcCrop) {
		this.srcCrop = srcCrop;
	}

	private String srcGrowProg;

	@Basic
	@javax.persistence.Column(name = "SRC_GROW_PROG")
	public String getSrcGrowProg() {
		return srcGrowProg;
	}

	public void setSrcGrowProg(String srcGrowProg) {
		this.srcGrowProg = srcGrowProg;
	}

	private Byte srcHarvMonth;

	@Basic
	@javax.persistence.Column(name = "SRC_HARV_MONTH")
	public Byte getSrcHarvMonth() {
		return srcHarvMonth;
	}

	public void setSrcHarvMonth(Byte srcHarvMonth) {
		this.srcHarvMonth = srcHarvMonth;
	}

	private Byte srcHarvYear;

	@Basic
	@javax.persistence.Column(name = "SRC_HARV_YEAR")
	public Byte getSrcHarvYear() {
		return srcHarvYear;
	}

	public void setSrcHarvYear(Byte srcHarvYear) {
		this.srcHarvYear = srcHarvYear;
	}

	private String srcLoc;

	@Basic
	@javax.persistence.Column(name = "SRC_LOC")
	public String getSrcLoc() {
		return srcLoc;
	}

	public void setSrcLoc(String srcLoc) {
		this.srcLoc = srcLoc;
	}

	private Byte srcSeqNumber;

	@Basic
	@javax.persistence.Column(name = "SRC_SEQ_NUMBER")
	public Byte getSrcSeqNumber() {
		return srcSeqNumber;
	}

	public void setSrcSeqNumber(Byte srcSeqNumber) {
		this.srcSeqNumber = srcSeqNumber;
	}

	private String srcLotNumber;

	@Basic
	@javax.persistence.Column(name = "SRC_LOT_NUMBER")
	public String getSrcLotNumber() {
		return srcLotNumber;
	}

	public void setSrcLotNumber(String srcLotNumber) {
		this.srcLotNumber = srcLotNumber;
	}

	private Byte srcMaleCol;

	@Basic
	@javax.persistence.Column(name = "SRC_MALE_COL")
	public Byte getSrcMaleCol() {
		return srcMaleCol;
	}

	public void setSrcMaleCol(Byte srcMaleCol) {
		this.srcMaleCol = srcMaleCol;
	}

	private Byte srcMaleSeqNumber;

	@Basic
	@javax.persistence.Column(name = "SRC_MALE_SEQ_NUMBER")
	public Byte getSrcMaleSeqNumber() {
		return srcMaleSeqNumber;
	}

	public void setSrcMaleSeqNumber(Byte srcMaleSeqNumber) {
		this.srcMaleSeqNumber = srcMaleSeqNumber;
	}

	private Byte srcMaleSrNumber;

	@Basic
	@javax.persistence.Column(name = "SRC_MALE_SR_NUMBER")
	public Byte getSrcMaleSrNumber() {
		return srcMaleSrNumber;
	}

	public void setSrcMaleSrNumber(Byte srcMaleSrNumber) {
		this.srcMaleSrNumber = srcMaleSrNumber;
	}

	private Byte srcMaleRng;

	@Basic
	@javax.persistence.Column(name = "SRC_MALE_RNG")
	public Byte getSrcMaleRng() {
		return srcMaleRng;
	}

	public void setSrcMaleRng(Byte srcMaleRng) {
		this.srcMaleRng = srcMaleRng;
	}

	private String srcOperation;

	@Basic
	@javax.persistence.Column(name = "SRC_OPERATION")
	public String getSrcOperation() {
		return srcOperation;
	}

	public void setSrcOperation(String srcOperation) {
		this.srcOperation = srcOperation;
	}

	private String srcOrigCountry;

	@Basic
	@javax.persistence.Column(name = "SRC_ORIG_COUNTRY")
	public String getSrcOrigCountry() {
		return srcOrigCountry;
	}

	public void setSrcOrigCountry(String srcOrigCountry) {
		this.srcOrigCountry = srcOrigCountry;
	}

	private String srcOrigProg;

	@Basic
	@javax.persistence.Column(name = "SRC_ORIG_PROG")
	public String getSrcOrigProg() {
		return srcOrigProg;
	}

	public void setSrcOrigProg(String srcOrigProg) {
		this.srcOrigProg = srcOrigProg;
	}

	private String srcOrigStation;

	@Basic
	@javax.persistence.Column(name = "SRC_ORIG_STATION")
	public String getSrcOrigStation() {
		return srcOrigStation;
	}

	public void setSrcOrigStation(String srcOrigStation) {
		this.srcOrigStation = srcOrigStation;
	}

	private Byte srcPlantMonth;

	@Basic
	@javax.persistence.Column(name = "SRC_PLANT_MONTH")
	public Byte getSrcPlantMonth() {
		return srcPlantMonth;
	}

	public void setSrcPlantMonth(Byte srcPlantMonth) {
		this.srcPlantMonth = srcPlantMonth;
	}

	private Byte srcPlantYear;

	@Basic
	@javax.persistence.Column(name = "SRC_PLANT_YEAR")
	public Byte getSrcPlantYear() {
		return srcPlantYear;
	}

	public void setSrcPlantYear(Byte srcPlantYear) {
		this.srcPlantYear = srcPlantYear;
	}

	private Byte srcPlotNumber;

	@Basic
	@javax.persistence.Column(name = "SRC_PLOT_NUMBER")
	public Byte getSrcPlotNumber() {
		return srcPlotNumber;
	}

	public void setSrcPlotNumber(Byte srcPlotNumber) {
		this.srcPlotNumber = srcPlotNumber;
	}

	private Byte srcRepNumber;

	@Basic
	@javax.persistence.Column(name = "SRC_REP_NUMBER")
	public Byte getSrcRepNumber() {
		return srcRepNumber;
	}

	public void setSrcRepNumber(Byte srcRepNumber) {
		this.srcRepNumber = srcRepNumber;
	}

	private Byte srcSampleNumber;

	@Basic
	@javax.persistence.Column(name = "SRC_SAMPLE_NUMBER")
	public Byte getSrcSampleNumber() {
		return srcSampleNumber;
	}

	public void setSrcSampleNumber(Byte srcSampleNumber) {
		this.srcSampleNumber = srcSampleNumber;
	}

	private Byte srcEntryNumber;

	@Basic
	@javax.persistence.Column(name = "SRC_ENTRY_NUMBER")
	public Byte getSrcEntryNumber() {
		return srcEntryNumber;
	}

	public void setSrcEntryNumber(Byte srcEntryNumber) {
		this.srcEntryNumber = srcEntryNumber;
	}

	private String srcSet;

	@Basic
	@javax.persistence.Column(name = "SRC_SET")
	public String getSrcSet() {
		return srcSet;
	}

	public void setSrcSet(String srcSet) {
		this.srcSet = srcSet;
	}

	private Byte srcSubRowNumber;

	@Basic
	@javax.persistence.Column(name = "SRC_SUB_ROW_NUMBER")
	public Byte getSrcSubRowNumber() {
		return srcSubRowNumber;
	}

	public void setSrcSubRowNumber(Byte srcSubRowNumber) {
		this.srcSubRowNumber = srcSubRowNumber;
	}

	private Byte srcSubSubRowNumber;

	@Basic
	@javax.persistence.Column(name = "SRC_SUB_SUB_ROW_NUMBER")
	public Byte getSrcSubSubRowNumber() {
		return srcSubSubRowNumber;
	}

	public void setSrcSubSubRowNumber(Byte srcSubSubRowNumber) {
		this.srcSubSubRowNumber = srcSubSubRowNumber;
	}

	private String srcTrkId;

	@Basic
	@javax.persistence.Column(name = "SRC_TRK_ID")
	public String getSrcTrkId() {
		return srcTrkId;
	}

	public void setSrcTrkId(String srcTrkId) {
		this.srcTrkId = srcTrkId;
	}

	private String srcMaleProg;

	@Basic
	@javax.persistence.Column(name = "SRC_MALE_PROG")
	public String getSrcMaleProg() {
		return srcMaleProg;
	}

	public void setSrcMaleProg(String srcMaleProg) {
		this.srcMaleProg = srcMaleProg;
	}

	private String testerDisplay;

	@Basic
	@javax.persistence.Column(name = "TESTER_DISPLAY")
	public String getTesterDisplay() {
		return testerDisplay;
	}

	public void setTesterDisplay(String testerDisplay) {
		this.testerDisplay = testerDisplay;
	}

	private String rubProjDisplay;

	@Basic
	@javax.persistence.Column(name = "RUB_PROJ_DISPLAY")
	public String getRubProjDisplay() {
		return rubProjDisplay;
	}

	public void setRubProjDisplay(String rubProjDisplay) {
		this.rubProjDisplay = rubProjDisplay;
	}

	private String rubKeeperDisplay;

	@Basic
	@javax.persistence.Column(name = "RUB_KEEPER_DISPLAY")
	public String getRubKeeperDisplay() {
		return rubKeeperDisplay;
	}

	public void setRubKeeperDisplay(String rubKeeperDisplay) {
		this.rubKeeperDisplay = rubKeeperDisplay;
	}

	private String srcSeason;

	@Basic
	@javax.persistence.Column(name = "SRC_SEASON")
	public String getSrcSeason() {
		return srcSeason;
	}

	public void setSrcSeason(String srcSeason) {
		this.srcSeason = srcSeason;
	}

	private String srcPlotBid;

	@Basic
	@javax.persistence.Column(name = "SRC_PLOT_BID")
	public String getSrcPlotBid() {
		return srcPlotBid;
	}

	public void setSrcPlotBid(String srcPlotBid) {
		this.srcPlotBid = srcPlotBid;
	}

	private String srcExtBid;

	@Basic
	@javax.persistence.Column(name = "SRC_EXT_BID")
	public String getSrcExtBid() {
		return srcExtBid;
	}

	public void setSrcExtBid(String srcExtBid) {
		this.srcExtBid = srcExtBid;
	}

	private String srcProtocolName;

	@Basic
	@javax.persistence.Column(name = "SRC_PROTOCOL_NAME")
	public String getSrcProtocolName() {
		return srcProtocolName;
	}

	public void setSrcProtocolName(String srcProtocolName) {
		this.srcProtocolName = srcProtocolName;
	}

	private String transformationGeneration;

	@Basic
	@javax.persistence.Column(name = "TRANSFORMATION_GENERATION")
	public String getTransformationGeneration() {
		return transformationGeneration;
	}

	public void setTransformationGeneration(String transformationGeneration) {
		this.transformationGeneration = transformationGeneration;
	}

	private Time srcPollDate;

	@Basic
	@javax.persistence.Column(name = "SRC_POLL_DATE")
	public Time getSrcPollDate() {
		return srcPollDate;
	}

	public void setSrcPollDate(Time srcPollDate) {
		this.srcPollDate = srcPollDate;
	}

	private String isAutogen;

	@Basic
	@javax.persistence.Column(name = "IS_AUTOGEN")
	public String getIsAutogen() {
		return isAutogen;
	}

	public void setIsAutogen(String isAutogen) {
		this.isAutogen = isAutogen;
	}

	private String srcMPlotBid;

	@Basic
	@javax.persistence.Column(name = "SRC_M_PLOT_BID")
	public String getSrcMPlotBid() {
		return srcMPlotBid;
	}

	public void setSrcMPlotBid(String srcMPlotBid) {
		this.srcMPlotBid = srcMPlotBid;
	}

	private String inbredLineRatingCd;

	@Basic
	@javax.persistence.Column(name = "INBRED_LINE_RATING_CD")
	public String getInbredLineRatingCd() {
		return inbredLineRatingCd;
	}

	public void setInbredLineRatingCd(String inbredLineRatingCd) {
		this.inbredLineRatingCd = inbredLineRatingCd;
	}

	private Time inbredLineRatingTimeStamp;

	@Basic
	@javax.persistence.Column(name = "INBRED_LINE_RATING_TIME_STAMP")
	public Time getInbredLineRatingTimeStamp() {
		return inbredLineRatingTimeStamp;
	}

	public void setInbredLineRatingTimeStamp(Time inbredLineRatingTimeStamp) {
		this.inbredLineRatingTimeStamp = inbredLineRatingTimeStamp;
	}

	private Byte srcAdvancementNumber;

	@Basic
	@javax.persistence.Column(name = "SRC_ADVANCEMENT_NUMBER")
	public Byte getSrcAdvancementNumber() {
		return srcAdvancementNumber;
	}

	public void setSrcAdvancementNumber(Byte srcAdvancementNumber) {
		this.srcAdvancementNumber = srcAdvancementNumber;
	}

	private String srcSelection;

	@Basic
	@javax.persistence.Column(name = "SRC_SELECTION")
	public String getSrcSelection() {
		return srcSelection;
	}

	public void setSrcSelection(String srcSelection) {
		this.srcSelection = srcSelection;
	}

	private Byte srcMalePlotNumber;

	@Basic
	@javax.persistence.Column(name = "SRC_MALE_PLOT_NUMBER")
	public Byte getSrcMalePlotNumber() {
		return srcMalePlotNumber;
	}

	public void setSrcMalePlotNumber(Byte srcMalePlotNumber) {
		this.srcMalePlotNumber = srcMalePlotNumber;
	}

	private String textCmpstnTmpltTxt;

	@Basic
	@javax.persistence.Column(name = "TEXT_CMPSTN_TMPLT_TXT")
	public String getTextCmpstnTmpltTxt() {
		return textCmpstnTmpltTxt;
	}

	public void setTextCmpstnTmpltTxt(String textCmpstnTmpltTxt) {
		this.textCmpstnTmpltTxt = textCmpstnTmpltTxt;
	}

	private String srcBatchName;

	@Basic
	@javax.persistence.Column(name = "SRC_BATCH_NAME")
	public String getSrcBatchName() {
		return srcBatchName;
	}

	public void setSrcBatchName(String srcBatchName) {
		this.srcBatchName = srcBatchName;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		GeneticMaterialEntity that = (GeneticMaterialEntity) o;

		if (geneticMaterialId != that.geneticMaterialId) return false;
		if (sourceStr != null ? !sourceStr.equals(that.sourceStr) : that.sourceStr != null) return false;
		if (generation != null ? !generation.equals(that.generation) : that.generation != null) return false;
		if (lineage != null ? !lineage.equals(that.lineage) : that.lineage != null) return false;
		if (srcAbsCol != null ? !srcAbsCol.equals(that.srcAbsCol) : that.srcAbsCol != null) return false;
		if (srcAbsRng != null ? !srcAbsRng.equals(that.srcAbsRng) : that.srcAbsRng != null) return false;
		if (srcCrop != null ? !srcCrop.equals(that.srcCrop) : that.srcCrop != null) return false;
		if (srcGrowProg != null ? !srcGrowProg.equals(that.srcGrowProg) : that.srcGrowProg != null) return false;
		if (srcHarvMonth != null ? !srcHarvMonth.equals(that.srcHarvMonth) : that.srcHarvMonth != null) return false;
		if (srcHarvYear != null ? !srcHarvYear.equals(that.srcHarvYear) : that.srcHarvYear != null) return false;
		if (srcLoc != null ? !srcLoc.equals(that.srcLoc) : that.srcLoc != null) return false;
		if (srcSeqNumber != null ? !srcSeqNumber.equals(that.srcSeqNumber) : that.srcSeqNumber != null) return false;
		if (srcLotNumber != null ? !srcLotNumber.equals(that.srcLotNumber) : that.srcLotNumber != null) return false;
		if (srcMaleCol != null ? !srcMaleCol.equals(that.srcMaleCol) : that.srcMaleCol != null) return false;
		if (srcMaleSeqNumber != null ? !srcMaleSeqNumber.equals(that.srcMaleSeqNumber) : that.srcMaleSeqNumber != null)
			return false;
		if (srcMaleSrNumber != null ? !srcMaleSrNumber.equals(that.srcMaleSrNumber) : that.srcMaleSrNumber != null)
			return false;
		if (srcMaleRng != null ? !srcMaleRng.equals(that.srcMaleRng) : that.srcMaleRng != null) return false;
		if (srcOperation != null ? !srcOperation.equals(that.srcOperation) : that.srcOperation != null) return false;
		if (srcOrigCountry != null ? !srcOrigCountry.equals(that.srcOrigCountry) : that.srcOrigCountry != null)
			return false;
		if (srcOrigProg != null ? !srcOrigProg.equals(that.srcOrigProg) : that.srcOrigProg != null) return false;
		if (srcOrigStation != null ? !srcOrigStation.equals(that.srcOrigStation) : that.srcOrigStation != null)
			return false;
		if (srcPlantMonth != null ? !srcPlantMonth.equals(that.srcPlantMonth) : that.srcPlantMonth != null)
			return false;
		if (srcPlantYear != null ? !srcPlantYear.equals(that.srcPlantYear) : that.srcPlantYear != null) return false;
		if (srcPlotNumber != null ? !srcPlotNumber.equals(that.srcPlotNumber) : that.srcPlotNumber != null)
			return false;
		if (srcRepNumber != null ? !srcRepNumber.equals(that.srcRepNumber) : that.srcRepNumber != null) return false;
		if (srcSampleNumber != null ? !srcSampleNumber.equals(that.srcSampleNumber) : that.srcSampleNumber != null)
			return false;
		if (srcEntryNumber != null ? !srcEntryNumber.equals(that.srcEntryNumber) : that.srcEntryNumber != null)
			return false;
		if (srcSet != null ? !srcSet.equals(that.srcSet) : that.srcSet != null) return false;
		if (srcSubRowNumber != null ? !srcSubRowNumber.equals(that.srcSubRowNumber) : that.srcSubRowNumber != null)
			return false;
		if (srcSubSubRowNumber != null ? !srcSubSubRowNumber.equals(that.srcSubSubRowNumber) : that.srcSubSubRowNumber != null)
			return false;
		if (srcTrkId != null ? !srcTrkId.equals(that.srcTrkId) : that.srcTrkId != null) return false;
		if (srcMaleProg != null ? !srcMaleProg.equals(that.srcMaleProg) : that.srcMaleProg != null) return false;
		if (testerDisplay != null ? !testerDisplay.equals(that.testerDisplay) : that.testerDisplay != null)
			return false;
		if (rubProjDisplay != null ? !rubProjDisplay.equals(that.rubProjDisplay) : that.rubProjDisplay != null)
			return false;
		if (rubKeeperDisplay != null ? !rubKeeperDisplay.equals(that.rubKeeperDisplay) : that.rubKeeperDisplay != null)
			return false;
		if (srcSeason != null ? !srcSeason.equals(that.srcSeason) : that.srcSeason != null) return false;
		if (srcPlotBid != null ? !srcPlotBid.equals(that.srcPlotBid) : that.srcPlotBid != null) return false;
		if (srcExtBid != null ? !srcExtBid.equals(that.srcExtBid) : that.srcExtBid != null) return false;
		if (srcProtocolName != null ? !srcProtocolName.equals(that.srcProtocolName) : that.srcProtocolName != null)
			return false;
		if (transformationGeneration != null ? !transformationGeneration.equals(that.transformationGeneration) : that.transformationGeneration != null)
			return false;
		if (srcPollDate != null ? !srcPollDate.equals(that.srcPollDate) : that.srcPollDate != null) return false;
		if (isAutogen != null ? !isAutogen.equals(that.isAutogen) : that.isAutogen != null) return false;
		if (srcMPlotBid != null ? !srcMPlotBid.equals(that.srcMPlotBid) : that.srcMPlotBid != null) return false;
		if (inbredLineRatingCd != null ? !inbredLineRatingCd.equals(that.inbredLineRatingCd) : that.inbredLineRatingCd != null)
			return false;
		if (inbredLineRatingTimeStamp != null ? !inbredLineRatingTimeStamp.equals(that.inbredLineRatingTimeStamp) : that.inbredLineRatingTimeStamp != null)
			return false;
		if (srcAdvancementNumber != null ? !srcAdvancementNumber.equals(that.srcAdvancementNumber) : that.srcAdvancementNumber != null)
			return false;
		if (srcSelection != null ? !srcSelection.equals(that.srcSelection) : that.srcSelection != null) return false;
		if (srcMalePlotNumber != null ? !srcMalePlotNumber.equals(that.srcMalePlotNumber) : that.srcMalePlotNumber != null)
			return false;
		if (textCmpstnTmpltTxt != null ? !textCmpstnTmpltTxt.equals(that.textCmpstnTmpltTxt) : that.textCmpstnTmpltTxt != null)
			return false;
		if (srcBatchName != null ? !srcBatchName.equals(that.srcBatchName) : that.srcBatchName != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = (int) geneticMaterialId;
		result = 31 * result + (sourceStr != null ? sourceStr.hashCode() : 0);
		result = 31 * result + (generation != null ? generation.hashCode() : 0);
		result = 31 * result + (lineage != null ? lineage.hashCode() : 0);
		result = 31 * result + (srcAbsCol != null ? srcAbsCol.hashCode() : 0);
		result = 31 * result + (srcAbsRng != null ? srcAbsRng.hashCode() : 0);
		result = 31 * result + (srcCrop != null ? srcCrop.hashCode() : 0);
		result = 31 * result + (srcGrowProg != null ? srcGrowProg.hashCode() : 0);
		result = 31 * result + (srcHarvMonth != null ? srcHarvMonth.hashCode() : 0);
		result = 31 * result + (srcHarvYear != null ? srcHarvYear.hashCode() : 0);
		result = 31 * result + (srcLoc != null ? srcLoc.hashCode() : 0);
		result = 31 * result + (srcSeqNumber != null ? srcSeqNumber.hashCode() : 0);
		result = 31 * result + (srcLotNumber != null ? srcLotNumber.hashCode() : 0);
		result = 31 * result + (srcMaleCol != null ? srcMaleCol.hashCode() : 0);
		result = 31 * result + (srcMaleSeqNumber != null ? srcMaleSeqNumber.hashCode() : 0);
		result = 31 * result + (srcMaleSrNumber != null ? srcMaleSrNumber.hashCode() : 0);
		result = 31 * result + (srcMaleRng != null ? srcMaleRng.hashCode() : 0);
		result = 31 * result + (srcOperation != null ? srcOperation.hashCode() : 0);
		result = 31 * result + (srcOrigCountry != null ? srcOrigCountry.hashCode() : 0);
		result = 31 * result + (srcOrigProg != null ? srcOrigProg.hashCode() : 0);
		result = 31 * result + (srcOrigStation != null ? srcOrigStation.hashCode() : 0);
		result = 31 * result + (srcPlantMonth != null ? srcPlantMonth.hashCode() : 0);
		result = 31 * result + (srcPlantYear != null ? srcPlantYear.hashCode() : 0);
		result = 31 * result + (srcPlotNumber != null ? srcPlotNumber.hashCode() : 0);
		result = 31 * result + (srcRepNumber != null ? srcRepNumber.hashCode() : 0);
		result = 31 * result + (srcSampleNumber != null ? srcSampleNumber.hashCode() : 0);
		result = 31 * result + (srcEntryNumber != null ? srcEntryNumber.hashCode() : 0);
		result = 31 * result + (srcSet != null ? srcSet.hashCode() : 0);
		result = 31 * result + (srcSubRowNumber != null ? srcSubRowNumber.hashCode() : 0);
		result = 31 * result + (srcSubSubRowNumber != null ? srcSubSubRowNumber.hashCode() : 0);
		result = 31 * result + (srcTrkId != null ? srcTrkId.hashCode() : 0);
		result = 31 * result + (srcMaleProg != null ? srcMaleProg.hashCode() : 0);
		result = 31 * result + (testerDisplay != null ? testerDisplay.hashCode() : 0);
		result = 31 * result + (rubProjDisplay != null ? rubProjDisplay.hashCode() : 0);
		result = 31 * result + (rubKeeperDisplay != null ? rubKeeperDisplay.hashCode() : 0);
		result = 31 * result + (srcSeason != null ? srcSeason.hashCode() : 0);
		result = 31 * result + (srcPlotBid != null ? srcPlotBid.hashCode() : 0);
		result = 31 * result + (srcExtBid != null ? srcExtBid.hashCode() : 0);
		result = 31 * result + (srcProtocolName != null ? srcProtocolName.hashCode() : 0);
		result = 31 * result + (transformationGeneration != null ? transformationGeneration.hashCode() : 0);
		result = 31 * result + (srcPollDate != null ? srcPollDate.hashCode() : 0);
		result = 31 * result + (isAutogen != null ? isAutogen.hashCode() : 0);
		result = 31 * result + (srcMPlotBid != null ? srcMPlotBid.hashCode() : 0);
		result = 31 * result + (inbredLineRatingCd != null ? inbredLineRatingCd.hashCode() : 0);
		result = 31 * result + (inbredLineRatingTimeStamp != null ? inbredLineRatingTimeStamp.hashCode() : 0);
		result = 31 * result + (srcAdvancementNumber != null ? srcAdvancementNumber.hashCode() : 0);
		result = 31 * result + (srcSelection != null ? srcSelection.hashCode() : 0);
		result = 31 * result + (srcMalePlotNumber != null ? srcMalePlotNumber.hashCode() : 0);
		result = 31 * result + (textCmpstnTmpltTxt != null ? textCmpstnTmpltTxt.hashCode() : 0);
		result = 31 * result + (srcBatchName != null ? srcBatchName.hashCode() : 0);
		return result;
	}
}
