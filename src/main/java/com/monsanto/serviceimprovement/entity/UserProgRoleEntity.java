package com.monsanto.serviceimprovement.entity;

import javax.persistence.*;

/**
 * Created by SNAND3 on 4/3/2018.
 */
@Entity
@Table(name = "USER_PROG_ROLE", schema = "MIDAS", catalog = "")
public class UserProgRoleEntity {
	private byte userProgRoleId;
	private String refActive;

	@Id
	@Column(name = "USER_PROG_ROLE_ID")
	public byte getUserProgRoleId() {
		return userProgRoleId;
	}

	public void setUserProgRoleId(byte userProgRoleId) {
		this.userProgRoleId = userProgRoleId;
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

		UserProgRoleEntity that = (UserProgRoleEntity) o;

		if (userProgRoleId != that.userProgRoleId) return false;
		if (refActive != null ? !refActive.equals(that.refActive) : that.refActive != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = (int) userProgRoleId;
		result = 31 * result + (refActive != null ? refActive.hashCode() : 0);
		return result;
	}
}
