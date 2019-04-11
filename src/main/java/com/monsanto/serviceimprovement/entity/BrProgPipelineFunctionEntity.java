package com.monsanto.serviceimprovement.entity;

import javax.persistence.*;
import java.sql.Time;

/**
 * Created by SNAND3 on 4/3/2018.
 */
@Entity
@Table(name = "BR_PROG_PIPELINE_FUNCTION", schema = "MIDAS", catalog = "")
public class BrProgPipelineFunctionEntity {
	private byte brProgPipelineFunctionId;
	private Time inactiveDttm;

	@Id
	@Column(name = "BR_PROG_PIPELINE_FUNCTION_ID")
	public byte getBrProgPipelineFunctionId() {
		return brProgPipelineFunctionId;
	}

	public void setBrProgPipelineFunctionId(byte brProgPipelineFunctionId) {
		this.brProgPipelineFunctionId = brProgPipelineFunctionId;
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

		BrProgPipelineFunctionEntity that = (BrProgPipelineFunctionEntity) o;

		if (brProgPipelineFunctionId != that.brProgPipelineFunctionId) return false;
		if (inactiveDttm != null ? !inactiveDttm.equals(that.inactiveDttm) : that.inactiveDttm != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = (int) brProgPipelineFunctionId;
		result = 31 * result + (inactiveDttm != null ? inactiveDttm.hashCode() : 0);
		return result;
	}
}
