package com.monsanto.serviceimprovement.entity;

import javax.persistence.*;

/**
 * Created by SNAND3 on 4/3/2018.
 */
@Entity
@Table(name = "BR_PROG", schema = "MIDAS", catalog = "")
public class BrProgEntity {
	private byte brProgId;
	private String name;
	private String brProgRefId;
	private String refActive;
	private String midasProgram;
	private Byte mailStop;
	private Byte acctId;

	@Id
	@Column(name = "BR_PROG_ID")
	public byte getBrProgId() {
		return brProgId;
	}

	public void setBrProgId(byte brProgId) {
		this.brProgId = brProgId;
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
	@Column(name = "BR_PROG_REF_ID")
	public String getBrProgRefId() {
		return brProgRefId;
	}

	public void setBrProgRefId(String brProgRefId) {
		this.brProgRefId = brProgRefId;
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
	@Column(name = "MIDAS_PROGRAM")
	public String getMidasProgram() {
		return midasProgram;
	}

	public void setMidasProgram(String midasProgram) {
		this.midasProgram = midasProgram;
	}

	@Basic
	@Column(name = "MAIL_STOP")
	public Byte getMailStop() {
		return mailStop;
	}

	public void setMailStop(Byte mailStop) {
		this.mailStop = mailStop;
	}

	@Basic
	@Column(name = "ACCT_ID")
	public Byte getAcctId() {
		return acctId;
	}

	public void setAcctId(Byte acctId) {
		this.acctId = acctId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		BrProgEntity that = (BrProgEntity) o;

		if (brProgId != that.brProgId) return false;
		if (name != null ? !name.equals(that.name) : that.name != null) return false;
		if (brProgRefId != null ? !brProgRefId.equals(that.brProgRefId) : that.brProgRefId != null) return false;
		if (refActive != null ? !refActive.equals(that.refActive) : that.refActive != null) return false;
		if (midasProgram != null ? !midasProgram.equals(that.midasProgram) : that.midasProgram != null) return false;
		if (mailStop != null ? !mailStop.equals(that.mailStop) : that.mailStop != null) return false;
		if (acctId != null ? !acctId.equals(that.acctId) : that.acctId != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = (int) brProgId;
		result = 31 * result + (name != null ? name.hashCode() : 0);
		result = 31 * result + (brProgRefId != null ? brProgRefId.hashCode() : 0);
		result = 31 * result + (refActive != null ? refActive.hashCode() : 0);
		result = 31 * result + (midasProgram != null ? midasProgram.hashCode() : 0);
		result = 31 * result + (mailStop != null ? mailStop.hashCode() : 0);
		result = 31 * result + (acctId != null ? acctId.hashCode() : 0);
		return result;
	}
}
