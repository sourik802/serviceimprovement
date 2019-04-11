package com.monsanto.serviceimprovement.entity;

import javax.persistence.*;

/**
 * Created by SNAND3 on 4/3/2018.
 */
@Entity
@Table(name = "MIDAS_USER", schema = "MIDAS", catalog = "")
public class MidasUserEntity {
	private byte midasUserId;
	private String loginId;
	private String refActive;
	private String firstName;
	private String middleName;
	private String lastName;
	private String domainName;

	@Id
	@Column(name = "MIDAS_USER_ID")
	public byte getMidasUserId() {
		return midasUserId;
	}

	public void setMidasUserId(byte midasUserId) {
		this.midasUserId = midasUserId;
	}

	@Basic
	@Column(name = "LOGIN_ID")
	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
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
	@Column(name = "FIRST_NAME")
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Basic
	@Column(name = "MIDDLE_NAME")
	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	@Basic
	@Column(name = "LAST_NAME")
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Basic
	@Column(name = "DOMAIN_NAME")
	public String getDomainName() {
		return domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		MidasUserEntity that = (MidasUserEntity) o;

		if (midasUserId != that.midasUserId) return false;
		if (loginId != null ? !loginId.equals(that.loginId) : that.loginId != null) return false;
		if (refActive != null ? !refActive.equals(that.refActive) : that.refActive != null) return false;
		if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
		if (middleName != null ? !middleName.equals(that.middleName) : that.middleName != null) return false;
		if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
		if (domainName != null ? !domainName.equals(that.domainName) : that.domainName != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = (int) midasUserId;
		result = 31 * result + (loginId != null ? loginId.hashCode() : 0);
		result = 31 * result + (refActive != null ? refActive.hashCode() : 0);
		result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
		result = 31 * result + (middleName != null ? middleName.hashCode() : 0);
		result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
		result = 31 * result + (domainName != null ? domainName.hashCode() : 0);
		return result;
	}
}
