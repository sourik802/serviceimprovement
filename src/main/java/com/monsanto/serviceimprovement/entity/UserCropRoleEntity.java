package com.monsanto.serviceimprovement.entity;

import javax.persistence.*;

/**
 * Created by SNAND3 on 4/3/2018.
 */
@Entity
@Table(name = "USER_CROP_ROLE", schema = "MIDAS", catalog = "")
public class UserCropRoleEntity {
	private byte userCropRoleId;
	private String refActive;

	@Id
	@Column(name = "USER_CROP_ROLE_ID")
	public byte getUserCropRoleId() {
		return userCropRoleId;
	}

	public void setUserCropRoleId(byte userCropRoleId) {
		this.userCropRoleId = userCropRoleId;
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

		UserCropRoleEntity that = (UserCropRoleEntity) o;

		if (userCropRoleId != that.userCropRoleId) return false;
		if (refActive != null ? !refActive.equals(that.refActive) : that.refActive != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = (int) userCropRoleId;
		result = 31 * result + (refActive != null ? refActive.hashCode() : 0);
		return result;
	}
}
