package com.monsanto.serviceimprovement.entity;

import javax.persistence.*;
import java.sql.Time;

/**
 * Created by SNAND3 on 4/3/2018.
 */
@Entity
@Table(name = "PIPELINE_FUNCTION", schema = "MIDAS", catalog = "")
public class PipelineFunctionEntity {
	private byte pipelineFunctionId;
	private String refId;
	private String name;
	private String description;
	private Time inactiveDttm;

	@Id
	@Column(name = "PIPELINE_FUNCTION_ID")
	public byte getPipelineFunctionId() {
		return pipelineFunctionId;
	}

	public void setPipelineFunctionId(byte pipelineFunctionId) {
		this.pipelineFunctionId = pipelineFunctionId;
	}

	@Basic
	@Column(name = "REF_ID")
	public String getRefId() {
		return refId;
	}

	public void setRefId(String refId) {
		this.refId = refId;
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
	@Column(name = "DESCRIPTION")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Basic
	@Column(name = "INACTIVE_DTTM")
	public Time getInactiveDttm() {
		return inactiveDttm;
	}

	public void setInactiveDttm(Time inactiveDttm) {
		this.inactiveDttm = inactiveDttm;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		PipelineFunctionEntity that = (PipelineFunctionEntity) o;

		if (pipelineFunctionId != that.pipelineFunctionId) return false;
		if (refId != null ? !refId.equals(that.refId) : that.refId != null) return false;
		if (name != null ? !name.equals(that.name) : that.name != null) return false;
		if (description != null ? !description.equals(that.description) : that.description != null) return false;
		if (inactiveDttm != null ? !inactiveDttm.equals(that.inactiveDttm) : that.inactiveDttm != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = (int) pipelineFunctionId;
		result = 31 * result + (refId != null ? refId.hashCode() : 0);
		result = 31 * result + (name != null ? name.hashCode() : 0);
		result = 31 * result + (description != null ? description.hashCode() : 0);
		result = 31 * result + (inactiveDttm != null ? inactiveDttm.hashCode() : 0);
		return result;
	}
}
