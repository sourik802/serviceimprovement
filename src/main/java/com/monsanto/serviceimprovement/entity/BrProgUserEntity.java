package com.monsanto.serviceimprovement.entity;

import javax.persistence.*;

/**
 * Created by SNAND3 on 4/3/2018.
 */
@Entity
@Table(name = "BR_PROG_USER", schema = "MIDAS", catalog = "")
public class BrProgUserEntity {
	private byte brProgUserId;
	private String defBrProg;
	private String refActive;

	@Id
	@Column(name = "BR_PROG_USER_ID")
	public byte getBrProgUserId() {
		return brProgUserId;
	}

	public void setBrProgUserId(byte brProgUserId) {
		this.brProgUserId = brProgUserId;
	}

	@Basic
	@Column(name = "DEF_BR_PROG")
	public String getDefBrProg() {
		return defBrProg;
	}

	public void setDefBrProg(String defBrProg) {
		this.defBrProg = defBrProg;
	}

	@Basic
	@Column(name = "REF_ACTIVE")
	public String getRefActive() {
		return refActive;
	}

	public void setRefActive(String refActive) {
		this.refActive = refActive;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		BrProgUserEntity that = (BrProgUserEntity) o;

		if (brProgUserId != that.brProgUserId) return false;
		if (defBrProg != null ? !defBrProg.equals(that.defBrProg) : that.defBrProg != null) return false;
		if (refActive != null ? !refActive.equals(that.refActive) : that.refActive != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = (int) brProgUserId;
		result = 31 * result + (defBrProg != null ? defBrProg.hashCode() : 0);
		result = 31 * result + (refActive != null ? refActive.hashCode() : 0);
		return result;
	}
}
